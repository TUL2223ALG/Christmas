package Week06;

import java.util.Scanner;

/**
 * Input
 * nSnowballs = 25
 * NButtons = 24
 * hatColor = 2
 * scarfColor = 1
 */

public class ChristmasPalfiVlastimil {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Jak se v javě mění konstanty enumů
    enum ColorType{
        Black,
        Red,
        Green,
        Yellow,
        Blue,
        Purple,
        Cyan;
    }
    private static final ColorType[] ColorValues  = ColorType.values();
    public static void main(String[] args) {
        RunSnowmanProgram();
    }
    public static void RunSnowmanProgram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte počet sněhových koulí.");
        int nSnowballs = sc.nextInt();
        System.out.println("Zadejte počet knoflíků.");
        int nButtons = sc.nextInt();

        while(nButtons >= nSnowballs){
            System.out.println("Nesmí být větší nebo rovný počet knoflíků než sněhových koulí.");
            System.out.println("Zadejte počet knoflíků znovu.");
            nButtons = sc.nextInt();
        }

        System.out.println("Zadejte číselně barvu pro čepici: \n1:Black\n2:Red\n3:Green\n4:Yellow\n5:Blue\n6:Purple\n7.Cyan");
        int hatColor = sc.nextInt()-1; //-1, protože nebereme barvy od 1, ale od 0
        System.out.println("Zadejte číselně barvu pro šálu: \n1:Black\n2:Red\n3:Green\n4:Yellow\n5:Blue\n6:Purple\n7.Cyan");
        int scarfColor = sc.nextInt()-1;
        String result = PrintSnowMan(nSnowballs,nButtons, hatColor, scarfColor);
        System.out.println(result);
    }
    public static String ChangeColor(int colorIndex){
        if(colorIndex < 0 || colorIndex > ColorValues.length - 1){
            return ANSI_WHITE;
        }
        switch (ColorValues[colorIndex]) {
            case Black:
                return ANSI_BLACK;
            case Red:
                return ANSI_RED;
            case Green:
                return ANSI_GREEN;
            case Yellow:
                return ANSI_YELLOW;
            case Blue:
                return ANSI_BLUE;
            case Purple:
                return ANSI_PURPLE;
            case Cyan:
                return ANSI_CYAN;
            default:
                return ANSI_WHITE;
        }
    }
    public static String PrintSnowMan(int nSnowballs, int nButtons, int hatColor, int scarfColor) {
        //graphicbuilder
        StringBuilder sb = new StringBuilder();
        String rowString = "";
        int rows = 6;
        int columns = 12 * nSnowballs; //sníh pod sněhulákem, zvýší se o počet snowballů
        int snowBallSize = 6; //velikost sněhové koule
        int maxHatSize = 10; //max. velikost čepice
        int maxSize = 4;  // maximální velkost 10:2 = 5 sloupců
        int buttonPlace = 4;
        int maxDeviation = maxSize * nSnowballs;
        int jPosun = 1;
        //čepice
        for (int i = 0; i <= maxHatSize; i++) { //s
            for (int j = 0; j < maxHatSize - i + maxDeviation-1; j++) { //i+6 = posun
                sb.append(" ");
            }
            for (int k = 0; k < i; k++) {
                sb.append(ChangeColor(hatColor)  + " █" + ANSI_RESET);
            }
            sb.append("\n");
        }
        //poslední pruh čepice
        for (int i = 0; i < 1; i++) { //s
            for (int j = 0; j < 1 - i + maxDeviation-8; j++) { //i+6 = posun
                sb.append(" ");
            }
            for (int k = 0; k < maxHatSize+6; k++) {
                sb.append(ChangeColor(hatColor)  + " █" + ANSI_RESET);
            }
            sb.append("\n");
        }
        for (int z = 0; z < nSnowballs; z++) {
            for (int i = 0; i <= maxSize; i += 2) { //s
                for (int j = jPosun; j < maxSize - i + maxDeviation; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < snowBallSize; k++) {

                    if((z == 0 && i == 2 && k == 2) || (z == 0 && i == 2 && k == 5)){
                        sb.append(ANSI_BLACK  + " █" + ANSI_RESET);
                    }
                    else if((z == 0 && i == 4 && k == 3) || (z == 0 && i == 4 && k == 6)){
                        sb.append(ANSI_BLACK  + " █" + ANSI_RESET);
                    }
                    //šála color
                    else if((z == 1 && i < 4 && k < snowBallSize)){
                        sb.append(ChangeColor(scarfColor)  + " █" + ANSI_RESET);
                    }
                    //I met the devil and he gave me this…
                    else if((z > 0 && z < nSnowballs) && (( i == 4 && k >= buttonPlace && k <= snowBallSize-buttonPlace-1)
                            || ( i == 6 && k >= buttonPlace+1 && k <= snowBallSize-buttonPlace-2 )) && nButtons > -1){
                        sb.append(ANSI_BLACK  + " █" + ANSI_RESET);
                    }
                    else{
                        sb.append(" █");
                    }
                }
                sb.append("\n");
                snowBallSize += 2;
            }
               nButtons -=1;
            for (int i = maxSize; i >= 0; i -= 2) { //
                for (int j = jPosun; j < maxSize - i + maxDeviation; j++) { //i+6 = posun
                    sb.append(" ");
                }
                snowBallSize -= 2;
                for (int k = 0; k < snowBallSize; k++) {

                    if((z == 0 && i == 2 && k == 2)){
                        sb.append(ANSI_YELLOW  + " █" + ANSI_RESET);
                    }
                    else if((z == 0 && i == 4 && k == 4)){
                        sb.append(ANSI_YELLOW  + " █" + ANSI_RESET);
                    }
                    else{
                        sb.append(" █");
                    }
                }
                sb.append("\n");
            }

            snowBallSize += 2;
            maxSize += 2;
            jPosun += 4;
        }
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                sb.append("█ ");
            }
            sb.append("\n");
        }
        rowString += sb;
        return rowString;
    }
}
