package vanocniuloha;

import java.util.Scanner;

/**
 *
 * @author Lilian
 */
public class ChristmasLucaLilian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of snowballs: ");
        int numOfSnowballs = scanner.nextInt();
        System.out.println("Enter the number of snowmen: ");
        int numOfSnowmen = scanner.nextInt();

        for (int i = 0; i < numOfSnowmen; i++) {
            System.out.println(drawSnowmanWithFor(numOfSnowballs));
            System.out.print("----------------------" + "\n" + "\n");
        }
    }

    public static String drawSnowheadWithBlock() {
        String snowhead = """
                         .---------------.
                         |     Merry     | 
                         |   Christmas   |
                         |               |
                         |_______________|
                          /  °       °  \\
                         |               |
                         |    ())))      |
                         |               |
                          \\    \\___/    /
                           \\-----------/
                          """;

        return snowhead;
    }

    public static String drawSnowheadWithFor() {
        String snowhead = "";
        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                snowhead += "." + "-----------------" + "." + "\n";
            } else if (i == 1) {
                snowhead += "|" + "      Merry      " + "|" + "\n";
            } else if (i == 2) {
                snowhead += "|" + "    Christmas    " + "|" + "\n";
            } else if (i == 3) {
                snowhead += "|" + "                 " + "|" + "\n";
            } else if (i == 4) {
                snowhead += "|" + "_________________" + "|" + "\n";
            } else if (i == 5) {
                snowhead += "  /  °       °  \\" + "\n";
            } else if (i == 7) {
                snowhead += " |    ())))      |" + "\n";
            } else if (i == 9) {
                snowhead += "  \\    \\___/    /" + "\n";
            } else if (i == 10) {
                snowhead += "   \\-----------/" + "\n";
            } else {
                snowhead += " |" + "               " + "|" + "\n";
            }
        }

        return snowhead;
    }

    public static String drawSnowballWithBlock() {
        String snowball = """
                           /-----------\\
                          /      *      \\
                         |               |
                         |       *       |
                         |               |
                          \\      *      /
                           \\-----------/
                          """;

        return snowball;
    }

    public static String drawSnowballWithFor() {
        String snowball = "";

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                snowball += "   /-----------\\" + "\n";
            } else if (i == 1) {
                snowball += "  /      *      \\" + "\n";
            } else if (i == 3) {
                snowball += " |       *       |" + "\n";
            } else if (i == 5) {
                snowball += "  \\      *      /" + "\n";
            } else if (i == 6) {
                snowball += "   \\-----------/" + "\n";
            } else {
                snowball += " |               |" + "\n";
            }
        }

        return snowball;
    }

    public static String drawSnowmanWithBlock(int numOfSnowballs) {
        String snowman = drawSnowheadWithBlock();

        for (int i = 0; i < numOfSnowballs - 1; i++) {
            if (i + 1 == 1) {
                snowman += """
                           /-----------\\      \\==/
                          /      *      \\.     \\/
                         |               |\\    ||
                         |       *       |  \\  ||
                         |               | \\  \\|| 
                          \\      *      /   \\__||
                           \\-----------/       ||
                          """;
            } else {
                snowman += drawSnowballWithBlock();
            }
        }

        return snowman;
    }

    public static String drawSnowmanWithFor(int numOfSnowballs) {
        String snowman = drawSnowheadWithFor();

        for (int i = 0; i < numOfSnowballs - 1; i++) {
            if (i + 1 == 1) {
                for (int j = 0; j < 7; j++) {
                    if (j == 0) {
                        snowman += "   /-----------\\      \\==/" + "\n";
                    } else if (j == 1) {
                        snowman += "  /      *      \\.     \\/" + "\n";
                    } else if (j == 2) {
                        snowman += " |               |\\    ||" + "\n";
                    } else if (j == 3) {
                        snowman += " |       *       |  \\  ||" + "\n";
                    } else if (j == 4) {
                        snowman += " |               | \\  \\|| " + "\n";
                    } else if (j == 5) {
                        snowman += "  \\      *      /   \\__||" + "\n";
                    } else if (j == 6) {
                        snowman += "   \\-----------/       ||" + "\n";
                    }
                }
            } else {
                snowman += drawSnowballWithFor();
            }
        }

        return snowman;
    }

}
