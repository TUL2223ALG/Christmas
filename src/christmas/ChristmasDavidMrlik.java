import java.util.Scanner;
import java.util.Random;

public class ChristmasDavidMrlik {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static final int EDGES = 2;
    public static final int GRAPHIC_LINE_BREAKS = 2;
    public static final int TREE_HEIGHT_RATIO = 22;
    public static final int TREE_PARTS = 4;

    public static final int START_TREE_TIP_HEIGHT = 7;
    public static final int START_TREE_BODY_HEIGHT = 5;
    public static final int START_TREE_END_HEIGHT = 7;
    public static final int START_TREE_TRUNK_THICKNESS = 6;
    public static final int START_TREE_TRUNK_HEIGHT = 3;

    public static final int BASIC_TREE_TIP_WIDTH = 0;
    public static final int BASIC_TREE_BODY_WIDTH = 6;
    public static final int BASIC_TREE_END_WIDTH = 6;
    


    public static final int LINE_BREAK_RATIO_TREE_BODY = 1;
    public static final int LINE_BREAK_RATIO_TREE_END = 3;

    

    private static int[] printDecoration(int rightSide, int x, int last[], String treePart, boolean balls, boolean garland){
        Random rand = new Random();
        int positionOfBall = rand.nextInt(rightSide);
        boolean ballPrinted = false;
        if(garland){
            int positionOfGarland = last[0] + x;
            int garlandPrinted = last[1];
            if(positionOfGarland >= rightSide){
                positionOfGarland = 0;
                for(int i = 0; i < rightSide; i++){
                    if(balls && i == positionOfBall){
                        System.out.print(ANSI_CYAN + "x");
                        ballPrinted = true;
                    } 
                    else System.out.print(ANSI_GREEN + "#");
                }
                garlandPrinted = 0;
            } else {
                if(garlandPrinted == 0) positionOfGarland = 0;
                if(positionOfBall == positionOfGarland && positionOfGarland == 0) positionOfBall++;
                else if(positionOfBall == positionOfGarland) positionOfBall--;
                for(int i = 0; i< positionOfGarland; i++){
                    if(balls && i == positionOfBall && !ballPrinted){
                        System.out.print(ANSI_CYAN + "x");
                        ballPrinted = true;
                    }
                    else System.out.print(ANSI_GREEN + "#");
                }
                System.out.print(ANSI_PURPLE + "0");
                garlandPrinted = 1;
                for(int j = 0; j < rightSide-1-positionOfGarland; j++)
                {   
                    int n = j + positionOfGarland + 1;
                    if(balls && n == positionOfBall && !ballPrinted){
                        System.out.print(ANSI_CYAN + "x");
                        ballPrinted = true;
                    }
                    else System.out.print(ANSI_GREEN + "#");
                }
            }
            last[0] = positionOfGarland;
            last[1] = garlandPrinted;
        } else {
            for(int i = 0; i < rightSide; i++){
                if(i == positionOfBall) System.out.print(ANSI_CYAN + "x");
                else System.out.print(ANSI_GREEN + "#");
            }        
        }  
        return last;
    }
    
    private static void printStar(int[] last){
        int lineBreaks = START_TREE_TIP_HEIGHT + last[2] + GRAPHIC_LINE_BREAKS +EDGES + last[3], levels = 3, star = 2; 
        for(int i = 0; i < levels; i++){
            System.out.println();
            if(i == 0 || i == levels - 1){
                for(int j = 0; j < lineBreaks; j++)
                    System.out.print(" ");
                for(int j = 0; j < star; j++)
                    System.out.print(ANSI_YELLOW + "*");
            } else {
                for(int j = 0; j < lineBreaks - 1; j++)
                    System.out.print(" ");
                for(int j = 0; j < star + 2; j++)
                    System.out.print(ANSI_YELLOW + "*");
            }
        }
    }    

    private static int[] printTreeLevel(int currLevel, int lineBreaks, int rightSide, int last[], String treePart, boolean balls, boolean garland){
        System.out.println();
        for(int i = 0; i < lineBreaks; i++)
            System.out.print(" ");
        System.out.print(ANSI_GREEN + "/");
        if((garland || balls) && currLevel > 1 && treePart.equals("treeTip")){
            int x = 3;
            currLevel = currLevel -2;
            if (currLevel == 0 ) last[1] = 0;
            last = printDecoration(rightSide, x, last, treePart, balls, garland);
        } else if((garland || balls) && treePart.equals("treeBody")){
            int x = 2;
            if (currLevel == 0 ) last[1] = 0;
            last = printDecoration(rightSide, x, last, treePart, balls, garland); 
        } else if((garland || balls) && treePart.equals("treeEnd")){
            int x = 3;
            if (currLevel == 0 ) last[1] = 0;
            last = printDecoration(rightSide, x, last, treePart, balls, garland);
        } else {
            for(int i = 0; i < rightSide; i++)
                System.out.print(ANSI_GREEN + "#");        
        }
        System.out.print(ANSI_GREEN + "\\");
        return last;
    } 

    private static int[] printTreeBody(boolean balls, boolean garland, int[] last){
        int rightSide = BASIC_TREE_BODY_WIDTH, levels = START_TREE_BODY_HEIGHT + last[2];
        int lineBreaks = levels + GRAPHIC_LINE_BREAKS - LINE_BREAK_RATIO_TREE_BODY + EDGES + last[3];
        for(int i = 0; i < levels; i++)
           last = printTreeLevel(i, lineBreaks-1*i, rightSide+2*i, last, "treeBody", balls, garland);
        
        return last;
    }   

    private static int[] printTreeTip(boolean balls, boolean garland, int[] last){
        int rightSide = BASIC_TREE_TIP_WIDTH, levels = START_TREE_TIP_HEIGHT + last[2];
        int lineBreaks = levels + GRAPHIC_LINE_BREAKS +EDGES + last[3];
        for(int i = 0; i < levels; i++)
            last = printTreeLevel(i, lineBreaks-1*i, rightSide+2*i, last, "treeTip", balls, garland);
        return last;
    }
          
    private static int[] printTreeEnd(boolean balls, boolean garland, int[] last){
        int rightSide = BASIC_TREE_END_WIDTH, levels = START_TREE_END_HEIGHT + last[2];
        int lineBreaks = levels - LINE_BREAK_RATIO_TREE_END + GRAPHIC_LINE_BREAKS + EDGES + last[3]; 
        int i;
        for(i = 0; i < levels; i++)
            last = printTreeLevel(i, lineBreaks-1*i, rightSide+2*i, last, "treeEnd", balls, garland);
        last[4] = lineBreaks-1*(i-1); 
        return last;
    }

    private static void printTreeTrunk(int[] last, int scaleTreeTrunkWidth, int treeWidth){
        int levels = START_TREE_TRUNK_HEIGHT + last[2], trunkThickness = START_TREE_TRUNK_THICKNESS + scaleTreeTrunkWidth; 
        int lineBreaks = last[4] + (treeWidth-trunkThickness)/2 + (EDGES -1);
        for(int i = 0; i < levels; i++){
            System.out.println();
            for(int j = 0; j < lineBreaks; j++)
                System.out.print(" ");
            for(int k = 0; k < trunkThickness; k++)
                System.out.print(ANSI_RED + "|");    
        } 
        System.out.println();
        System.out.println();
    }
    
    private static void printTree(boolean star, boolean balls, boolean garland, int treeHeight){
        int lastPositionOfGarland = 0, garlandPrinted = 0, treeTrunkLineBreaks = 0;
        int scaleTreeEndHeight = (treeHeight - TREE_HEIGHT_RATIO + TREE_PARTS)%TREE_PARTS; 
        int scaleTreeHeight = (treeHeight - TREE_HEIGHT_RATIO - scaleTreeEndHeight) / TREE_PARTS;
        int [] last = {lastPositionOfGarland, garlandPrinted, scaleTreeHeight, scaleTreeEndHeight, treeTrunkLineBreaks};
        int treeWidth = BASIC_TREE_END_WIDTH+2*(START_TREE_END_HEIGHT + last[2]-1);
        int scaleTreeTrunkWidth = (treeWidth- (BASIC_TREE_END_WIDTH + START_TREE_TRUNK_THICKNESS))/(BASIC_TREE_END_WIDTH + START_TREE_TRUNK_THICKNESS);
        if(scaleTreeTrunkWidth >= 1){
            if(scaleTreeTrunkWidth % 2 != 0) scaleTreeTrunkWidth++;
        }
        if(star) printStar(last);
        last = printTreeTip(balls, garland, last);
        last = printTreeBody(balls, garland, last);
        last = printTreeEnd(balls, garland, last);
        printTreeTrunk(last, scaleTreeTrunkWidth, treeWidth);
    }
    private static void treeDimension(boolean star, boolean balls, boolean garland){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Zvol si výšku stromečku (min 22)");
        int treeHeight = 0;
        try {
            treeHeight = sc.nextInt();
        } catch (Exception e){
            System.out.println("Tento znak nemá žádnou funkci !");
            treeDimension(star, balls, garland);
        }
        
        if(treeHeight < 22){
            System.out.println("Zadaná výška nevyhovuje podmínce");
            treeDimension(star, balls, garland);
        } 
        printTree(star, balls, garland, treeHeight);
        treeDecoration("1");
        sc.close();
    }

    private static void treeDecoration(String s){
        String u = s.replaceAll(" ", "");
        if(u.equals("0")) return;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(ANSI_RESET + "Pro ukončení programu zadej pouze číslo 0");
        System.out.println();
        System.out.println("Navol si nazdobení stromečku");
        System.out.println("1. hvězda");
        System.out.println("2. koule");
        System.out.println("3. řetěz");
        System.out.println("4. bez ozdoby");
        System.out.println();
        u = sc.nextLine();
        u = u.replaceAll(" ", "");
        if(!u.contains("0") && !u.contains("1") && !u.contains("2") && !u.contains("3") && !u.contains("4")){
            System.out.println();
            System.out.println("Tento znak nemá žádnou funkci !");
            treeDecoration(u);
        }   
        else if(u.equals("0")){
            sc.close();
            return;
        }
        else if(u.contains("0") && (u.contains("1") || u.contains("2") || u.contains("3") || u.contains("4"))) {
            System.out.println();
            treeDecoration(u);    
        }
        else if(u.contains("4") && (u.contains("1") || u.contains("2") || u.contains("3"))){
            System.out.println();
            System.out.println("Vyber si buď s ozdobou nebo bez");
            treeDecoration(u);
        }
        else treeDimension(u.contains("1"), u.contains("2"), u.contains("3"));
        sc.close(); 
    }
    
    private static void startProgram(String s){  
        String d = s.replaceAll(" ", "");
        if(d.equals("1")){
            treeDecoration(d);
            return;
        } 
        if(d.equals("0")) 
        {
            treeDecoration(d);
            return;
        }
        Scanner sc = new Scanner(System.in);
        if ( !d.contains("1") && !d.contains("0")) System.out.println("Prosím zadej 1 pro spuštění programu nebo 0 pro jeho ukončení");
        else System.out.println("Proím zadej pouze číslo 1 pro spuštění programu nebo 0 pro jeho ukončení");
        s = sc.nextLine();
        startProgram(s);
        sc.close();
    }
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        System.out.println("Pro výběr možností nazdobení stromečku zadej číslo 1");
        System.out.println("Pro ukončení programu zadej číslo 0");
        String s = sc.nextLine();
        startProgram(s);
        sc.close(); 
    }
}

