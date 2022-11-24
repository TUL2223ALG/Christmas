package christmas.s;

/**
 *
 * @author Jakub Dvorak
 */
public class ChristmasDvorakJakub {

    public static void main(String[] args) {
        //input - parametry obrazku
        int height = 15;
        int width = 20;
        //barva pozadi
        final String RED = "\u001B[41m-";
        final String GREEN = "\u001B[42m-";
        final String YELLOW = "\u001B[43m-";
        final String WHITE = "\u001B[47m-";
        //barva pismo
        final String RED_P = "\u001B[31m";
        final String YELLOW_P = "\u001B[33m";
        final String RESET = "\u001B[0m";

        //ocko
        for (int i = 0; i <= Math.floor(height / 3); i++) {
            for (int j = 0; j <= Math.floor((width * 2) / 3); j++) { //mezery
                System.out.print(WHITE + ". ");
            }
            for (int j = 1; j <= Math.floor((width * 2) / 3); j++) {
                if (i <= Math.floor((height / 3) / 4) || j == 1 || j == Math.floor((width * 2) / 3)) {
                    System.out.print(GREEN + "| ");
                } else {
                    System.out.print(WHITE + ". ");
                }
            }
            for (int j = 0; j <= Math.floor((width * 2) / 3); j++) { //mezery
                System.out.print(WHITE + ". ");
            }
            System.out.println();
        }

        //bambulka
        for (int i = -width; i <= width; i++) {
            for (int j = -width; j <= width; j++) {
                if (i * i + j * j <= width * width) {
                    if (i * i == j * j || j == 0 || i == 0) {  //dekorace bambulky
                        System.out.print(YELLOW + RED_P + "X " + RESET);
                    } else {
                        System.out.print(RED + YELLOW_P + "+ " + RESET); //telo bambulky
                    }
                } else if (i == -width && j != 0 && (i + 1) * (i + 1) + (j + 1) * (j + 1) <= width * width) {
                    System.out.print(GREEN + "| "); //uchyt ocka
                } else {
                    System.out.print(WHITE + ". ");
                }
            }
            System.out.println();
        }
    }

}
