/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package christmas.u;

import java.util.Scanner;

/**
 *
 * @author stepan.moc
 */
public class ChristmasMocStepan {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int christmasTree, bfTree = 0, afTree = 0, gifts = 0;
        System.out.println("Kolik budete chtít stromečků");
        christmasTree = sc.nextInt();
        if (christmasTree >= 1) {
            System.out.println("Kolik dárků bude před stromečkem");
            bfTree = sc.nextInt();
            System.out.println("Kolik dárků bude za stromečkem");
            afTree = sc.nextInt();
        } else {
            System.out.println("Kolik dárků budete chít");
            gifts = sc.nextInt();
        }
        if (christmasTree >= 1) {
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@          @@                                      @@@   @@              @@          @@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@@        @@@                                     @@   @@ @@                          @@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@@@      @@@@   @@@@  @@ @@@  @@ @@@ @@      @@  @@       @@ @@@  @@ @@@  @@   @@@@ @@@@@@  @@ @@  @@      @@@    @@@@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@ @@    @@ @@  @@  @@ @@@  @@ @@@  @@ @@    @@   @@       @@@  @@ @@@  @@ @@  @@      @@    @@@  @@  @@  @@  @@  @@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@  @@  @@  @@ @@@@@@  @@      @@       @@  @@    @@       @@   @@ @@      @@   @@@    @@    @@   @@  @@ @@   @@   @@@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@   @@@@   @@  @@     @@      @@        @@@@      @@   @@ @@   @@ @@      @@     @@   @@ @@ @@       @@ @@   @@     @@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@    @@    @@   @@@@  @@      @@         @@         @@@   @@   @@ @@       @@ @@@@     @@   @@       @@  @@@@ @@ @@@@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("                                             @@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("                                        @@  @@");
            for (int i = 1; i <= (40 + christmasTree * 16 + bfTree * 15 + afTree * 15) / 2 - 63; i++) {
                System.out.print(" ");
            }
            System.out.println("                                         @@@@");

            System.out.println("[__][__][(******)__][__](******)[__][] |");
            System.out.print("[][__][__(******)][__][_(******)_][__] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("               ");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("        ()      ");
            }
            System.out.println("");
            System.out.print("[__][__][_|    |[__][__][|    |][__][] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("               ");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("        /\\\\     ");
            }
            System.out.println("");
            System.out.print("[][__][__]|   .|_][__][__]   .|__][__] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("               ");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("       ///\\\\    ");
            }
            System.out.println("");
            System.out.print("[__][__][/   <_)[__][__]/   <_)][__][] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("               ");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("      //o\\\\\\\\   ");
            }
            System.out.println("");
            System.out.print("[][__][ /..,/][__][__][/..,/_][__][__] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("               ");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("      /i//\\*\\   ");
            }
            System.out.println("");
            System.out.print("[__][__(__/][__][__][_(__/_][__][__][] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("               ");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("     //o/*\\\\i\\  ");
            }
            System.out.println("");

            System.out.print("[__][__]] |     ,  , .      [__][__][] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("   ____(|)____ ");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("    ///i//o\\\\\\\\ ");
            }
            for (int i = 1; i <= afTree; i++) {
                System.out.print("   ____(|)____ ");
            }
            System.out.println("");

            System.out.print("[][__][_] |   . i. '/ ,     [][__][__] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("  |_____|_____|");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("    //o//i\\\\*\\\\ ");
            }
            for (int i = 1; i <= afTree; i++) {
                System.out.print("  |_____|_____|");
            }
            System.out.println("");

            System.out.print("[__][__]] |  O \\ / /, O     [__][__][] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("  |     |     |");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("   //i//o/\\\\\\\\\\\\");
            }
            for (int i = 1; i <= afTree; i++) {
                System.out.print("  |     |     |");
            }
            System.out.println("");

            System.out.print("[][__][_] |__|======='=|____[][__][__] |");
            for (int i = 1; i <= bfTree; i++) {
                System.out.print("__|_____|_____|");
            }
            for (int i = 1; i <= christmasTree; i++) {
                System.out.print("_________||_____");
            }
            for (int i = 1; i <= afTree; i++) {
                System.out.print("__|_____|_____|");
            }
            System.out.println("");

            System.out.println("[__][__]]/  /|\\-------/|\\   [__][__][]/ ");
        } else {
            for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@          @@                                      @@@   @@              @@          @@");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@@        @@@                                     @@   @@ @@                          @@");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@@@      @@@@   @@@@  @@ @@@  @@ @@@ @@      @@  @@       @@ @@@  @@ @@@  @@   @@@@ @@@@@@  @@ @@  @@      @@@    @@@@");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@ @@    @@ @@  @@  @@ @@@  @@ @@@  @@ @@    @@   @@       @@@  @@ @@@  @@ @@  @@      @@    @@@  @@  @@  @@  @@  @@");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@  @@  @@  @@ @@@@@@  @@      @@       @@  @@    @@       @@   @@ @@      @@   @@@    @@    @@   @@  @@ @@   @@   @@@");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@   @@@@   @@  @@     @@      @@        @@@@      @@   @@ @@   @@ @@      @@     @@   @@ @@ @@       @@ @@   @@     @@");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    @@    @@    @@   @@@@  @@      @@         @@         @@@   @@   @@ @@       @@ @@@@     @@   @@       @@  @@@@ @@ @@@@");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("    *       *         *             *         @@    *         *      *                *        *         *        *    *");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("       *        *             *      *  @@  @@  *               *          *          *          *          *      *    ");
             for (int i = 1; i <= (40+gifts*15)/2-63; i++) {
                System.out.print(" ");
            }
            System.out.println("     *  *        *      *            *   @@@@        *     *           *      *            *         *         *       *");
            System.out.println("                      *    *       *           *         *       *         *      *           *   *         *   *    *       *    *       *");
            System.out.println("                     *         *          *        *          *        *        *     *     *       *      *        *    *       *    *    ");
            System.out.println("                        *         * *          *       *    *       *        *     *     *     *        *     *         *            *     ");
            
            System.out.println("[__][__][(******)__][__](******)[__][] |     *           *         *         *            *      *           *        *        *        *  ");
            System.out.println("[][__][__(******)][__][_(******)_][__] |  *        *       *     *                  *       *           *                   *         *    ");
            System.out.println("[__][__][_|    |[__][__][|    |][__][] |         *                 *         *                  *             *                 *          ");
            System.out.println("[][__][__]|   .|_][__][__]   .|__][__] |       *         *             *            *              *               *     *            *    ");
            System.out.println("[__][__][/   <_)[__][__]/   <_)][__][] |    *          *         *           *             *          *           *            *          *");
            System.out.println("[][__][ /..,/][__][__][/..,/_][__][__] |  *       *                *               *             *          *                       *      ");
            System.out.println("[__][__(__/][__][__][_(__/_][__][__][] |      *         *                 *                *         *               *         *        *  ");
            System.out.print("[__][__]] |     ,  , .      [__][__][] |");
            for (int i = 1; i <= gifts; i++) {
                System.out.print("   ____(|)____ ");
            }
            System.out.println("");

            System.out.print("[][__][_] |   . i. '/ ,     [][__][__] |");
            for (int i = 1; i <= gifts; i++) {
                System.out.print("  |_____|_____|");
            }
            System.out.println("");

            System.out.print("[__][__]] |  O \\ / /, O     [__][__][] |");
            for (int i = 1; i <= gifts; i++) {
                System.out.print("  |     |     |");
            }
            System.out.println("");

            System.out.print("[][__][_] |__|======='=|____[][__][__] |");
            for (int i = 1; i <= gifts; i++) {
                System.out.print("__|_____|_____|");
            }
            System.out.println("");
            System.out.println("[__][__]]/  /|\\-------/|\\   [__][__][]/ ");
        }
    }
    
}
