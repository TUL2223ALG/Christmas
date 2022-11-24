package christmas.u;
/**
 * @author Jakub Keršláger
 */
import java.util.Scanner;

public class ChristmasKerslagerJakub {
    static int Balls = 0;
    static int SnowmanCount = 1;
    static boolean end = false;
    static String ColorReset = "\u001B[0m";
    static String BkgBLACK = "\u001B[40m";
    static String BkgRED = "\u001B[41m";
    static String BkgGREEN = "\u001B[42m";
    static String BkgYELLOW = "\u001B[43m";
    static String BkgBLUE = "\u001B[44m";
    static String BkgPURPLE = "\u001B[45m";
    static String BkgCYAN = "\u001B[46m";
    static String BkgWHITE = "\u001B[47m";
    static String SnowColor = " ";
    static String PotColor = " ";
    static Scanner sc = new Scanner(System.in);
                 
public static void main(String[] args) {
    int choice;
    
        do {
            WantToBuild();
            choice = sc.nextInt();
            switch (choice){
                case 1: Snow();
                        Pot();
                        NumberOfBalls();
                        NumberOfSnowman();
                        Head();
                        Balls();
                        break;

                case 0: end = true; break;
                default: System.out.println("Nevalidní volba");}
  
        }while(!end);
}
 private static void WantToBuild() {
     System.out.println("Zdravíčko, chceš postavit sněhuláka?");
     System.out.println("Jestli ano, napiš 1, jestli ne, napiš 0.");
 }          

private static void Snow() {
    int choice;
        System.out.println("");
        System.out.println("Jakou barvu má sněhulák mít?");
        System.out.println("");
        System.out.println("Pro červenou napiš 1");
        System.out.println("Pro zelenou napiš 2");
        System.out.println("Pro žlutou napiš 3");
        System.out.println("Pro modrou napiš 4");
        System.out.println("Pro fialovou napiš 5");
        System.out.println("Pro světle modrou napiš 6");
        System.out.println("Pro bílou napiš 7");
        System.out.println("");
        
    choice = sc.nextInt();     
           
        switch (choice){
            case 1: SnowColor = BkgRED; break;
            case 2: SnowColor = BkgGREEN;break;
            case 3: SnowColor = BkgYELLOW; break;
            case 4: SnowColor = BkgBLUE; break;
            case 5: SnowColor = BkgPURPLE; break;
            case 6: SnowColor = BkgCYAN; break;
            case 7: SnowColor = BkgWHITE; break;
            default: System.out.println("Nevalidní volba");
        }
}        

private static void Pot() {
    int choice;
        System.out.println("");
        System.out.println("Jakou barvu má hrnec mít?");
        System.out.println("");
        System.out.println("Pro červenou napiš 1");
        System.out.println("Pro zelenou napiš 2");
        System.out.println("Pro žlutou napiš 3");
        System.out.println("Pro modrou napiš 4");
        System.out.println("Pro fialovou napiš 5");
        System.out.println("Pro světle modrou napiš 6");
        System.out.println("Pro bílou napiš 7");
        System.out.println("");
        
    choice = sc.nextInt();     
           
        switch (choice){
            case 1: PotColor = BkgRED; break;
            case 2: PotColor = BkgGREEN;break;
            case 3: PotColor = BkgYELLOW; break;
            case 4: PotColor = BkgBLUE; break;
            case 5: PotColor = BkgPURPLE; break;
            case 6: PotColor = BkgCYAN; break;
            case 7: PotColor = BkgWHITE; break;
            default: System.out.println("Nevalidní volba");
        }
}        

private static void NumberOfSnowman() {
        System.out.println("");
        System.out.println("Kolik sněhuláků chceš postavit?");
        System.out.println("");
        SnowmanCount = sc.nextInt();
}
private static void NumberOfBalls() {
        System.out.println("");
        System.out.println("Kolik koulí má sněhulák mít?");
        System.out.println("");
        Balls = sc.nextInt();
}
        
private static void Head() {        
        if (Balls>=1){     
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +PotColor + "                 " + ColorReset + "             "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("    " +PotColor + "                     " + ColorReset + "           "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("    " +PotColor + "                     " + ColorReset + "           "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +PotColor + "                 " + ColorReset + "             "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +PotColor + "                 " + ColorReset + "             "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +SnowColor + "                 " + ColorReset + "             "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("     " +SnowColor + "   "+BkgBLACK+"  "+SnowColor+"         "+BkgBLACK+"  "+SnowColor+"   " + ColorReset + "            "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("    " +SnowColor + "                     " + ColorReset +"           "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("   " +SnowColor +"          "+BkgBLACK+"  "+SnowColor+"           " + ColorReset + "          "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("   " +SnowColor +"                       " + ColorReset + "          "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("    " +SnowColor + "                     " + ColorReset +"           "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("     " +SnowColor + "    "+BkgBLACK+" "+SnowColor+"         "+BkgBLACK+" "+SnowColor+"    " + ColorReset + "            "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +SnowColor + "    "+BkgBLACK+"         "+SnowColor+"    " + ColorReset + "             "); System.out.printf("\n");
            for (int i =1; i <= SnowmanCount; i++) System.out.printf("        " +SnowColor + "             " + ColorReset + "               "); System.out.printf("\n");
        }
        else{
            System.out.println("Vážně chceš stavět sněhuláka bez jediné koule? Jestli se ti to povede, tak budeš prohlášen za druhého Ježíše Krista...");
            System.out.println("");
            System.out.println("");
        }
           
}
private static void Balls() {
            
    
    if (Balls >= 2){
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("        " +SnowColor + "             " + ColorReset + "               " ); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +SnowColor + "                 " + ColorReset + "             "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("     " +SnowColor + "                   " + ColorReset + "            " ); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf(" " +SnowColor + "            "+BkgBLACK+"  "+SnowColor +"             " + ColorReset +"        "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("" +SnowColor +"                             " + ColorReset + "       "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("" +SnowColor +"                             " + ColorReset + "       "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf(" " +SnowColor + "            "+BkgBLACK+"  "+SnowColor+"             " + ColorReset +"        "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("     " +SnowColor + "                   " + ColorReset + "            " ); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +SnowColor + "                 " + ColorReset +"             "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("        " +SnowColor + "             " + ColorReset +"               ");  System.out.printf("\n");    
                
        for (int ii=3;  ii <= Balls;){
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("        " +SnowColor + "             " + ColorReset + "               "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +SnowColor + "                 " + ColorReset + "             "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("     " +SnowColor + "                   " + ColorReset + "            "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("    " +SnowColor + "         "+BkgBLACK+"  "+SnowColor+"          " + ColorReset + "           "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("   " +SnowColor +"                       " + ColorReset + "          "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("   " +SnowColor +"                       " + ColorReset + "          "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("    " +SnowColor + "         "+BkgBLACK+"  "+SnowColor+"          " + ColorReset + "           "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("     " +SnowColor + "                   " + ColorReset + "            "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("      " +SnowColor + "                 " + ColorReset + "             "); System.out.printf("\n");
                for (int i =1; i <= SnowmanCount; i++) System.out.printf("        " +SnowColor + "             " + ColorReset + "               "); System.out.printf("\n");   
                ii++;                 
        }
    }    
    else {      if (Balls == 0){
                System.out.println("");
                }
                else {
                System.out.println("Nějakej malej ne? To u tebe asi moc nenasněžilo....");
                System.out.println("");
                }
    }     
}

}

