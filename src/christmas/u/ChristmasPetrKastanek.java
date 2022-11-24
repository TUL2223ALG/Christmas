package christmas.u;

import java.util.Scanner;

public class ChristmasPetrKastanek {

    static Scanner scanner = new Scanner(System.in);
    static int n, size, hands;

    public static void main(String[] args) {
        boolean endAll = false;
        do {
            next();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userMenu();
                    fix();
                    boolean end = false;
                    do {
                        hatMenu();
                        int hat = scanner.nextInt();

                        switch (hat) {
                            case 1:
                                noHat();
                                end = true;
                                break;
                            case 2:
                                hat();
                                end = true;
                                break;
                            case 3:
                                christmasHat();
                                end = true;
                                break;
                            default:
                                System.out.println("Neplatná volba");
                                break;
                        }
                    } while (!end);

                    head();
                    balls();
                    break;
                case 2:
                    System.out.println("Veselé listopadové vánoce!");
                    endAll = true;
                    break;
                default:
                    System.out.println("Neplatná volba");
                    break;
            }
        } while (!endAll);
    }

    private static void next() {
        System.out.println("*****************************");
        System.out.println("*  Chceš stavět sněhuláky?  *");
        System.out.println("* 1. Ano                    *");
        System.out.println("* 2. Ne                     *");
        System.out.println("*****************************");
    }

    private static void userMenu() {
        System.out.println("Neplatné hodnoty (záporné nebo menší než požadované) se samy upraví");
        System.out.printf("Zadej počet sněhuláků (min. 1, max. 100 - více se nevejde na výstup): ");
        n = scanner.nextInt();
        System.out.printf("Kolik budou mít sněhuláci koulí (min. 2, max. aby to netrvalo dlouho): ");
        size = scanner.nextInt();
        System.out.println("Na kolikáte kouli (ze shora, bez hlavy) budou ruce (alespoň 1, max. počet koulí - 1): ");
        hands = scanner.nextInt();
    }

    private static void fix() {
        if (n < 0) {
            n = Math.abs(n);
        }
        if (n > 100) {
            n = 100;
        }
        if (n < 1) {
            n = 1;
        }

        if (size < 0) {
            size = Math.abs(size);
        }
        if (size < 2) {
            size = 2;
        }

        if (hands < 0) {
            hands = Math.abs(hands);
        }
        if (hands < 1) {
            hands = 1;
        }
        if (hands > size - 1) {
            hands = size - 1;
        }
    }

    private static void hatMenu() {
        System.out.println("**************************");
        System.out.println("*  Co bude mít na hlavě  *");
        System.out.println("* 1. Nic                 *");
        System.out.println("* 2. Klobouk             *");
        System.out.println("* 3. Vánoční čepici      *");
        System.out.println("**************************");
    }

    private static void hat() {
        System.out.printf("Výška klobouku (max. 10): ");
        int hatHeight = scanner.nextInt();
        if (hatHeight < 0) {
            hatHeight = Math.abs(hatHeight);
        }
        if (hatHeight > 10) {
            hatHeight = 10;
        }
        if (hatHeight < 1) {
            hatHeight = 1;
        }
        for (int j = 1; j <= n; j++) {
            System.out.printf("             ___________             ");
        }
        System.out.printf("\n");
        for (int i = 1; i < hatHeight; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("              |       |              ");
            }
            System.out.printf("\n");
        }
        for (int j = 1; j <= n; j++) {
            System.out.printf("           \\__|_______|__/           ");
        }
        System.out.printf("\n");
    }

    private static void christmasHat() {
        for (int j = 1; j <= n; j++) {
            System.out.printf("                    ______           ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("                   /      \\          ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("                  /     _  \\         ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("                 /     /  \\_\\        ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("                /     /   /  \\       ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("             __|_____|__  \\__/       ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("            |___________|            ");
        }
        System.out.printf("\n");
    }

    private static void noHat() {
        for (int i = 1; i <= n; i++) {
            System.out.printf("              X X X X X              ");
        }
        System.out.printf("\n");
    }

    private static void head() {
        for (int j = 1; j <= n; j++) {
            System.out.printf("            X           X            ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("          X   _       _   X          ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("        X    |_|     |_|    X        ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("        X                   X        ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("        X         /\\        X        ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("          X    \\_____/    X          ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("            X           X            ");
        }
        System.out.printf("\n");
        for (int j = 1; j <= n; j++) {
            System.out.printf("              X X X X X              ");
        }
        System.out.printf("\n");
    }

    public static void balls() {
        for (int i = 2; i <= size; i++) {
            if (i == hands + 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("    X X     X           X     X X    ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("   X    X X       o       X X     X  ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("    X                           X    ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("      X           o           X      ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("        X                   X        ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("          X       o       X          ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("            X           X            ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("              X X X X X              ");
                }
                System.out.printf("\n");
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("            X           X            ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("          X       o       X          ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("        X                   X        ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("        X         O         X        ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("        X                   X        ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("          X       o       X          ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("            X           X            ");
                }
                System.out.printf("\n");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("              X X X X X              ");
                }
                System.out.printf("\n");
            }

        }
        System.out.printf("\n");
    }
}
