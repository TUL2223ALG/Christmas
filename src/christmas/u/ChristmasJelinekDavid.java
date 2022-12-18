package vanocniuloha;
import java.util.Scanner;
public class ChristmasJelinekDavid {

    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[3];
    static String[] space = new String[30];
    

    public static void main(String[] args) {
        summonMenu();
    }

    public static void summonMenu() {
        int baseWidth = 0;
        int topIndex = 0;
        System.out.println(">---------------------------------MENU---------------------------------<");
        System.out.println("Postav si svůj stromeček podle vlastních parametrů(Alespoň 5)");
        System.out.println("Nyní napiš, jak má být široký vespod: ");
        baseWidth = sc.nextInt();
        //baseWidth = 15;
        if (baseWidth < 1) {
            System.out.println("Zadej kladné číslo prosím  :)");
            summonMenu();
            return;
        }

        System.out.println("Nyní napiš, jakou má mít ozdobu(1-3): ");
        chooseTop();
        topIndex = sc.nextInt();
        //topIndex = 2;
        if (topIndex < 1 && topIndex > 3) {
            System.out.println("Zadej číslo ze zadaného intervalu prosím: )");
            summonMenu();
            return;
        }
        System.out.println("Nyní napiš, Kolik bude dárků(0-2) a poté jména šťastlivců(max 7 znaků: )\nČíslo:\nJméno1:\nJméno2: ");
        int giftCount = sc.nextInt();
        for (int i = 0; i < giftCount + 1; i++) {
            names[i] = sc.nextLine();
        }

        if (topIndex < 1 && topIndex > 3) {
            System.out.println("Zadej číslo ze zadaného prosím  :)");
            summonMenu();
            return;
        }
        System.out.println(">---------------------------------MENU---------------------------------<");

        generateTree(baseWidth, topIndex);
        generateGifts(giftCount, names);
    }

    public static void chooseTop() {
        System.out.println(">--------------------------------HVĚZDY--------------------------------<");
        System.out.println("1)");
        System.out.println("    A\n"
                + "___/_\\___\n"
                + " ',. ..'\n"
                + " /.'^'.\\\n"
                + "/'     '\\");
        System.out.println("2)");
        System.out.println("       .\n"
                + "  ---./|\\.---\n"
                + "  '._/ | \\_.'\n"
                + "_.-'_'.|.'_'-._\n"
                + " '-._.'|'._.-'\n"
                + "  .' \\ | / '.\n"
                + "  ---'\\|/'---\n"
                + "        '");
        System.out.println("3)");
        System.out.println("      ,\n"
                + "   \\  :  /\n"
                + "`. __/ \\__ .'\n"
                + "_ _\\     /_ _\n"
                + "   /_   _\\\n"
                + " .'  \\ /  `.\n"
                + "   /  :  \\  \n"
                + "      '");
        System.out.println(">--------------------------------HVĚZDY--------------------------------<");
    }

    public static int compareStar(String[] array) {
        int elementLength = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > elementLength) {
                elementLength = array[i].length();
                //System.out.println(index+" "+array[i].length());
            }
        }
        return elementLength;
    }

    public static void generateGifts(int giftCount, String[] names) {
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
        }
        //Fill blanks
        space[0]=" ";
        for (int i = 1; i < space.length; i++) {
            space[i]=space[i-1]+" ";
        }

        switch (giftCount) {
            case 0 -> {
                System.out.println("-------------------------");
                System.out.println("| Nikdo nic nedostane, |\n|     zlobili jste     |");
                System.out.println("-------------------------");
                System.out.println("            |            ");
                System.out.println("            |            ");
                System.out.println("            |            ");
            }
            case 1 -> {
                int numOfSpaces=7-names[1].length();
                System.out.println("          \\\\//           ");
                System.out.println("           ||           ");
                System.out.println("-------------------------");
                System.out.println("| "+names[1]+space[numOfSpaces]+"||          |\n|          ||          |\n|==========||==========|\n|          ||          |\n|          ||          |");
                System.out.println("-------------------------");
            }
            case 2 -> {
                int numOfSpacesSec=7-names[2].length();
                System.out.println("          \\\\//           "+space[9]+"          \\\\//           ");
                System.out.println("           ||           "+space[10]+"           ||           ");
                System.out.println("-------------------------"+space[9]+"------------------------");
                System.out.println("|  "+names[1]+space[numOfSpacesSec]+"||          |"+space[10]+"|  "+names[2]+space[numOfSpacesSec]+"||          |\n|          ||          |"+space[10]+"|          ||          |\n|==========||==========|"+space[10]+"|==========||==========|\n|          ||          |"+space[10]+"|          ||          |\n-------------------------"+space[9]+"------------------------");
            }
        }
    }

    public static void generateStar(int base, int index) {
        if (base > 10) {
            switch (index) {
                case 1 -> {
                    String hvezda = "    A\n___/_\\___\n ',. ..'\n /.'^'.\\\n/'     '\\";
                    String[] lines1 = hvezda.split("\r?\n|\r");
                    for (String num1 : lines1) {
                        for (int j = 0; j < base - compareStar(lines1) / 2; j++) {

                            System.out.print(" ");
                        }
                        System.out.println(num1);
                    }
                }
                case 2 -> {
                    String hvezda2 = "       .\n  ---./|\\.---\n  '._/ | \\_.'\n_.-'_'.|.'_'-._\n '-._.'|'._.-'\n  .' \\ | / '.\n  ---'\\|/'---\n       '";
                    String[] lines2 = hvezda2.split("\r?\n|\r");
                    for (String num2 : lines2) {
                        for (int j = 0; j < base - compareStar(lines2) / 2; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(num2);
                    }
                }
                case 3 -> {
                    String hvezda3 = "      ,\n   \\  :  /\n`. __/ \\__ .'\n_ _\\     /_ _\n   /_   _\\\n .'  \\ /  `.\n   /  :  \\    \n      '";
                    String[] lines3 = hvezda3.split("\r?\n|\r");
                    for (String num3 : lines3) {
                        for (int j = 0; j < (base - compareStar(lines3) / 2); j++) {
                            System.out.print(" ");
                        }
                        System.out.println(num3);
                    }
                }
            }
        } else {
            for (int j = 0; j < (base); j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }

    }

    public static void generateTree(int baseWidth, int topIndex) {
        generateStar(baseWidth, topIndex);
        for (int i = 1; i <= baseWidth; i++) {      // i=Řádky

            for (int k = 0; k < baseWidth - i; k++) {   //k=Počet mezer k stromu zleva 
                System.out.print(" ");
            }
            //^^^MEZERY

            for (int j = 0; j < i; j++) {               //j=Počet hvězdiček v jednotlivém řádku 
                if (i % (baseWidth / 5) == 0) {
                    System.out.print(" #");
                } else if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < baseWidth / 6; i++) {
            for (int k = 0; k < (baseWidth - ((baseWidth / 7))) - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < baseWidth / 3; j++) {

                System.out.print("M");
            }
            System.out.println(" ");
        }

    }
}
