/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author eliska
 */
public class ChristmasJunkovaEliska {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        // vstup 1
        System.out.println("Should a snowman wear a hat?");
        System.out.println("Write Yes or No.");
        String odpoved1 = sc.nextLine();
        odpoved1 = odpoved1.toLowerCase();
        //vstup 2
        System.out.println("Should the snowman have buttons?");
        System.out.println("Write Yes or No.");
        String odpoved2 = sc.nextLine();
        odpoved2 = odpoved2.toLowerCase();
        //podminky
        // YES    YES
        if ("yes".equals(odpoved1) && "yes".equals(odpoved2)) {
            System.out.println("....");
            for (int step = 1; step <= 4; step++) {
                Clear();
                Snehulak1(step);
                TimeUnit.MILLISECONDS.sleep(220);
                if (step == 4) {
                    step = 0;
                }
            }
        // YES      NO
        } else if ("yes".equals(odpoved1) && "no".equals(odpoved2)) {

            for (int step = 1; step <= 4; step++) {
                Clear();
                Snehulak2(step);
                TimeUnit.MILLISECONDS.sleep(220);
                if (step == 4) {
                    step = 0;
                }
            }

        } // NO     YES
        else if ("no".equals(odpoved1) && "yes".equals(odpoved2)) {

            for (int step = 1; step <= 4; step++) {
                Clear();
                Snehulak3(step);
                TimeUnit.MILLISECONDS.sleep(220);
                if (step == 4) {
                    step = 0;
                }
            }
            // NO      NO
        } else if ("no".equals(odpoved1) && "no".equals(odpoved2)) {

            for (int step = 1; step <= 4; step++) {
                Clear();
                Snehulak4(step);
                TimeUnit.MILLISECONDS.sleep(220);
                if (step == 4) {
                    step = 0;
                }
            }

        }
    }
    
            // VYSTUPY
    public static void Snehulak1(int step) {
        switch (step) {
            case 1 -> {
                System.out.println("   *                       *              *              ");//1
                System.out.println("                                                         ");//2
                System.out.println("                                                 *       ");//3
                System.out.println("             *        * * * * * * *                      ");//4
                System.out.println("    *                 * * * * * * * *    *               ");//5
                System.out.println("                      * * * * * * *  *                   ");//6
                System.out.println("         *            * * * * * * * *                    ");//7
                System.out.println("       *   *          * * * * * * *          *   *    *  ");//8
                System.out.println("         * *          *   •   •   *          * *         ");//9
                System.out.println("  *    * * *         *      |      *         * * *       ");//10
                System.out.println("             *       *    \\___/    *       *            ");//11
                System.out.println("     *         *      *           *      *           *   ");//12
                System.out.println(" *               *      * * * * *      *     *           ");//13
                System.out.println("            *      * *      °      * *                   ");//14
                System.out.println("                    *              *                    ");//15
                System.out.println("       *            *       °       *              *     ");//16
                System.out.println("                     *             *     *               ");//17
                System.out.println("              *         * * * * *                        ");//18
                System.out.println("     *                *           *                      ");//19
                System.out.println("                   *        °       *         *         ");//20
                System.out.println("          *       *                   *                  ");//21
                System.out.println("                 *          °          *             *   ");//22
                System.out.println("                 *                     *    *            ");//23
                System.out.println("    *             *         °         *                  ");//24
                System.out.println("                    *               *           *        ");//25
                System.out.println("             *        * * * * * * *                    * ");//26
            }
            case 2 -> {
                System.out.println("          *             *                                ");//1
                System.out.println("                                                     *   ");//2
                System.out.println("                                            *            ");//3
                System.out.println("    *                 * * * * * * *                      ");//4
                System.out.println("                      * * * * * * * *           *        ");//5
                System.out.println("             *        * * * * * * *  *                 * ");//6
                System.out.println("   *                  * * * * * * * *  *                 ");//7
                System.out.println("                      * * * * * * *                      ");//8
                System.out.println("                      *   •   •   *              *       ");//9
                System.out.println("             *       *      |      *                     ");//10
                System.out.println("    *                *    \\___/    *   *                ");//11
                System.out.println("    **                *           *                 *    ");//12
                System.out.println("      *  *              * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *      °      * *  *  *  *  * * **  ");//14
                System.out.println("      *             *               *             *      ");//15
                System.out.println("  * *               *       °       *               *    ");//16
                System.out.println("                     *             *                     ");//17
                System.out.println("                        * * * * *                    *   ");//18
                System.out.println(" *                    *           *          *           ");//19
                System.out.println("            *      *        °        *                   ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("       *         *          °          *           *     ");//22
                System.out.println("                 *                     * *               ");//23
                System.out.println("                * *         °         *                  ");//24
                System.out.println("     *              *               *                    ");//25
                System.out.println("                      * * * * * * *            *         ");//26
            }
            case 3 -> {
                System.out.println("                             *                           ");//1
                System.out.println("       *                                           *     ");//2
                System.out.println("                                         *               ");//3
                System.out.println("                      * * * * * * *                      ");//4
                System.out.println("                *     * * * * * * * *                    ");//5
                System.out.println("     *                * * * * * * *  *         *         ");//6
                System.out.println("          *           * * * * * * * *                    ");//7
                System.out.println("                      * * * * * * *                  *   ");//8
                System.out.println("                      *   •   •   *         *            ");//9
                System.out.println("    *                *      |      *                     ");//10
                System.out.println("                     *    \\___/    *           *        ");//11
                System.out.println("              *       *           *                    * ");//12
                System.out.println("   *                    * * * * *         *              ");//13
                System.out.println("                   * *      °      * *                   ");//14
                System.out.println("                 *  *               *  *         *       ");//15
                System.out.println("              **    *       °       *    *               ");//16
                System.out.println("             *       *             *    *  *             ");//17
                System.out.println("    *  * * *            * * * * *            * * *       ");//18
                System.out.println("         * *          *           *          * *         ");//19
                System.out.println("       *   *       *        °        *       *   *    *  ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("  *              *          °          *                 ");//22
                System.out.println("                 *                     *                 ");//23
                System.out.println("                  *         °         *              *   ");//24
                System.out.println(" *                  *               *         *          ");//25
                System.out.println("            *         * * * * * * *                      ");//26
            }
            case 4 -> {
                System.out.println("                                                         ");//1
                System.out.println("  *                                                      ");//2
                System.out.println("               *                                         ");//3
                System.out.println("                      * * * * * * *                  *   ");//4
                System.out.println(" *                    * * * * * * * *         *          ");//5
                System.out.println("            *         * * * * * * *  *                   ");//6
                System.out.println("                      * * * * * * * *                    ");//7
                System.out.println("       *              * * * * * * *                *     ");//8
                System.out.println("                      *   •   •   *      *               ");//9
                System.out.println("                     *      |      *                     ");//10
                System.out.println("                *    *    \\___/    *                    ");//11
                System.out.println("    **                *           *            *    *    ");//12
                System.out.println("      *   *             * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *      °      * *  *  *  *  * * *   ");//14
                System.out.println("      *             *               *       *     *      ");//15
                System.out.println("    *               *       °       *               *    ");//16
                System.out.println("                     *             *            *        ");//17
                System.out.println("              *         * * * * *                      * ");//18
                System.out.println("   *                  *           *       *              ");//19
                System.out.println("                   *        °        *                   ");//20
                System.out.println("                  *                   *          *       ");//21
                System.out.println("              *  *          °          *                 ");//22
                System.out.println("                 *                     **                ");//23
                System.out.println("    *             *         °         *                  ");//24
                System.out.println("         *          *               *                    ");//25
                System.out.println("                      * * * * * * *                   *  ");//26
            }
        }
    }

    public static void Snehulak2(int step) {
        switch (step) {
            case 1 -> {
                System.out.println("   *                       *              *              ");//1
                System.out.println("                                                         ");//2
                System.out.println("                                                 *       ");//3
                System.out.println("             *        * * * * * * *                      ");//4
                System.out.println("    *                 * * * * * * * *   *                ");//5
                System.out.println("                      * * * * * * *  *                   ");//6
                System.out.println("         *            * * * * * * * *                    ");//7
                System.out.println("       *   *          * * * * * * *          *   *    *  ");//8
                System.out.println("         * *          *   •   •   *          * *         ");//9
                System.out.println("  *    * * *         *      |      *         * * *       ");//10
                System.out.println("             *       *    \\___/    *       *            ");//11
                System.out.println("     *         *      *           *      *           *   ");//12
                System.out.println(" *               *      * * * * *      *     *           ");//13
                System.out.println("            *      * *             * *                   ");//14
                System.out.println("                    *               *                    ");//15
                System.out.println("       *            *               *              *     ");//16
                System.out.println("                     *             *     *               ");//17
                System.out.println("              *         * * * * *                        ");//18
                System.out.println("     *                *           *                      ");//19
                System.out.println("                   *                 *         *         ");//20
                System.out.println("          *       *                   *                  ");//21
                System.out.println("                 *                     *             *   ");//22
                System.out.println("                 *                     *    *            ");//23
                System.out.println("    *             *                   *                  ");//24
                System.out.println("                    *               *           *        ");//25
                System.out.println("             *        * * * * * * *                   * ");//26
            }
            case 2 -> {
                System.out.println("          *             *                                ");//1
                System.out.println("                                                     *   ");//2
                System.out.println("                                            *            ");//3
                System.out.println("    *                 * * * * * * *                      ");//4
                System.out.println("                      * * * * * * * *            *       ");//5
                System.out.println("             *        * * * * * * *  *                 * ");//6
                System.out.println("   *                  * * * * * * * * *                  ");//7
                System.out.println("                      * * * * * * *                      ");//8
                System.out.println("                      *   •   •   *              *       ");//9
                System.out.println("             *       *      |      *                     ");//10
                System.out.println("    *                *    \\___/    *   *                ");//11
                System.out.println("    **                *           *                 *    ");//12
                System.out.println("      *  *              * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *             * *  *  *  *  * * **  ");//14
                System.out.println("      *             *               *             *      ");//15
                System.out.println("  * *               *               *               *    ");//16
                System.out.println("                     *             *                     ");//17
                System.out.println("                        * * * * *                    *   ");//18
                System.out.println(" *                    *           *          *           ");//19
                System.out.println("            *      *                 *                   ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("       *         *                     *           *     ");//22
                System.out.println("                 *                     * *               ");//23
                System.out.println("                * *                   *                  ");//24
                System.out.println("     *              *               *                    ");//25
                System.out.println("                      * * * * * * *            *         ");//26
            }
            case 3 -> {
                System.out.println("                             *                           ");//1
                System.out.println("       *                                           *     ");//2
                System.out.println("                                         *               ");//3
                System.out.println("                      * * * * * * *                      ");//4
                System.out.println("                *     * * * * * * * *                    ");//5
                System.out.println("     *                * * * * * * *  *         *         ");//6
                System.out.println("          *           * * * * * * * *                    ");//7
                System.out.println("                      * * * * * * *                  *   ");//8
                System.out.println("                      *   •   •   *         *            ");//9
                System.out.println("    *                *      |      *                     ");//10
                System.out.println("                     *    \\___/    *           *        ");//11
                System.out.println("              *       *           *                    * ");//12
                System.out.println("   *                    * * * * *         *              ");//13
                System.out.println("                   * *             * *                   ");//14
                System.out.println("                 *  *               *  *         *       ");//15
                System.out.println("              **    *               *    *               ");//16
                System.out.println("             *       *             *    *  *             ");//17
                System.out.println("    *  * * *            * * * * *            * * *       ");//18
                System.out.println("         * *          *           *          * *         ");//19
                System.out.println("       *   *       *                 *       *   *    *  ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("  *              *                     *                 ");//22
                System.out.println("                 *                     *                 ");//23
                System.out.println("                  *                   *              *   ");//24
                System.out.println(" *                  *               *         *          ");//25
                System.out.println("            *         * * * * * * *                      ");//26
            }
            case 4 -> {
                System.out.println("                                                         ");//1
                System.out.println("  *                                                      ");//2
                System.out.println("               *                                         ");//3
                System.out.println("                      * * * * * * *                  *   ");//4
                System.out.println(" *                    * * * * * * * *         *          ");//5
                System.out.println("            *         * * * * * * *  *                   ");//6
                System.out.println("                      * * * * * * * *                    ");//7
                System.out.println("       *              * * * * * * *                *     ");//8
                System.out.println("                      *   •   •   *      *               ");//9
                System.out.println("                     *      |      *                     ");//10
                System.out.println("                *    *    \\___/    *                    ");//11
                System.out.println("    **                *           *            *    *    ");//12
                System.out.println("      *   *             * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *             * *  *  *  *  * * *   ");//14
                System.out.println("      *             *               *       *     *      ");//15
                System.out.println("    *               *               *               *    ");//16
                System.out.println("                     *             *            *        ");//17
                System.out.println("              *         * * * * *                      * ");//18
                System.out.println("   *                  *           *       *              ");//19
                System.out.println("                   *                 *                   ");//20
                System.out.println("                  *                   *          *       ");//21
                System.out.println("              *  *                     *                 ");//22
                System.out.println("                 *                     **                ");//23
                System.out.println("    *             *                   *                  ");//24
                System.out.println("         *          *               *                    ");//25
                System.out.println("                      * * * * * * *                   *  ");//26
            }
        }

    }

    public static void Snehulak3(int step) {
        switch (step) {
            case 1 -> {
                System.out.println("   *                       *              *              ");//1
                System.out.println("                                                         ");//2
                System.out.println("                                                 *       ");//3
                System.out.println("             *                                           ");//4
                System.out.println("    *                                   *                ");//5
                System.out.println("                                                         ");//6
                System.out.println("         *                                               ");//7
                System.out.println("       *   *            * * * * *           *   *    *  ");//8
                System.out.println("         * *          *   •   •   *          * *         ");//9
                System.out.println("  *    * * *         *      |      *         * * *       ");//10
                System.out.println("             *       *    \\___/    *       *            ");//11
                System.out.println("     *         *      *           *      *           *   ");//12
                System.out.println(" *               *      * * * * *      *     *           ");//13
                System.out.println("            *      * *             * *                   ");//14
                System.out.println("                    *       °       *                    ");//15
                System.out.println("       *            *               *              *     ");//16
                System.out.println("                     *      °      *     *               ");//17
                System.out.println("              *         * * * * *                        ");//18
                System.out.println("     *                *           *                      ");//19
                System.out.println("                   *        °       *         *         ");//20
                System.out.println("          *       *                   *                  ");//21
                System.out.println("                 *          °          *             *   ");//22
                System.out.println("                 *                     *    *            ");//23
                System.out.println("    *             *         °         *                  ");//24
                System.out.println("                    *               *           *        ");//25
                System.out.println("             *        * * * * * * *                    * ");//26
            }
            case 2 -> {
                System.out.println("          *             *                                ");//1
                System.out.println("                                                     *   ");//2
                System.out.println("                                            *            ");//3
                System.out.println("    *                                                    ");//4
                System.out.println("                                                *        ");//5
                System.out.println("             *                                         * ");//6
                System.out.println("   *                                      *              ");//7
                System.out.println("                        * * * * *                         ");//8
                System.out.println("                      *   •   •   *              *       ");//9
                System.out.println("             *       *      |      *                     ");//10
                System.out.println("    *                *    \\___/    *   *                ");//11
                System.out.println("    **                *           *                 *    ");//12
                System.out.println("      *  *              * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *      °      * *  *  *  *  * * **  ");//14
                System.out.println("      *             *               *             *      ");//15
                System.out.println("  * *               *       °       *               *    ");//16
                System.out.println("                     *             *                     ");//17
                System.out.println("                        * * * * *                    *   ");//18
                System.out.println(" *                    *           *          *           ");//19
                System.out.println("            *      *        °        *                   ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("       *         *          °          *           *     ");//22
                System.out.println("                 *                     * *               ");//23
                System.out.println("                * *         °         *                  ");//24
                System.out.println("     *              *               *                    ");//25
                System.out.println("                      * * * * * * *            *         ");//26
            }
            case 3 -> {
                System.out.println("                             *                           ");//1
                System.out.println("       *                                           *     ");//2
                System.out.println("                                         *               ");//3
                System.out.println("                                                         ");//4
                System.out.println("                *                                        ");//5
                System.out.println("     *                                         *         ");//6
                System.out.println("          *                                              ");//7
                System.out.println("                        * * * * *                    *   ");//8
                System.out.println("                      *   •   •   *         *            ");//9
                System.out.println("    *                *      |      *                     ");//10
                System.out.println("                     *    \\___/    *           *        ");//11
                System.out.println("              *       *           *                    * ");//12
                System.out.println("   *                    * * * * *         *              ");//13
                System.out.println("                   * *      °      * *                   ");//14
                System.out.println("                 *  *               *  *         *       ");//15
                System.out.println("              **    *       °       *    *               ");//16
                System.out.println("             *       *             *    *  *             ");//17
                System.out.println("    *  * * *            * * * * *            * * *       ");//18
                System.out.println("         * *          *           *          * *         ");//19
                System.out.println("       *   *       *        °        *       *   *    *  ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("  *              *          °          *                 ");//22
                System.out.println("                 *                     *                 ");//23
                System.out.println("                  *         °         *              *   ");//24
                System.out.println(" *                  *               *         *          ");//25
                System.out.println("            *         * * * * * * *                      ");//26
            }
            case 4 -> {
                System.out.println("                                                         ");//1
                System.out.println("  *                                                      ");//2
                System.out.println("               *                                         ");//3
                System.out.println("                                                     *   ");//4
                System.out.println(" *                                            *          ");//5
                System.out.println("            *                                            ");//6
                System.out.println("                                                         ");//7
                System.out.println("       *                * * * * *                  *     ");//8
                System.out.println("                      *   •   •   *      *               ");//9
                System.out.println("                     *      |      *                     ");//10
                System.out.println("                *    *    \\___/    *                    ");//11
                System.out.println("    **                *           *            *    *    ");//12
                System.out.println("      *   *             * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *      °      * *  *  *  *  * * *   ");//14
                System.out.println("      *             *               *       *     *      ");//15
                System.out.println("    *               *       °       *               *    ");//16
                System.out.println("                     *             *            *        ");//17
                System.out.println("              *         * * * * *                      * ");//18
                System.out.println("   *                  *           *       *              ");//19
                System.out.println("                   *        °        *                   ");//20
                System.out.println("                  *                   *          *       ");//21
                System.out.println("              *  *          °          *                 ");//22
                System.out.println("                 *                     **                ");//23
                System.out.println("    *             *         °         *                  ");//24
                System.out.println("         *          *               *                    ");//25
                System.out.println("                      * * * * * * *                   *  ");//26
            }
        }
    }

    public static void Snehulak4(int step) {
        switch (step) {
            case 1 -> {
                System.out.println("   *                       *              *              ");//1
                System.out.println("                                                         ");//2
                System.out.println("                                                 *       ");//3
                System.out.println("             *                                           ");//4
                System.out.println("    *                                   *                ");//5
                System.out.println("                                                         ");//6
                System.out.println("         *                                               ");//7
                System.out.println("       *   *            * * * * *            *   *    *  ");//8
                System.out.println("         * *          *   •   •   *          * *         ");//9
                System.out.println("  *    * * *         *      |      *         * * *       ");//10
                System.out.println("             *       *    \\___/    *       *            ");//11
                System.out.println("     *         *      *           *      *           *   ");//12
                System.out.println(" *               *      * * * * *      *     *           ");//13
                System.out.println("            *      * *             * *                   ");//14
                System.out.println("                    *               *                    ");//15
                System.out.println("       *            *               *              *     ");//16
                System.out.println("                     *             *     *               ");//17
                System.out.println("              *         * * * * *                        ");//18
                System.out.println("     *                *           *                      ");//19
                System.out.println("                   *                 *         *         ");//20
                System.out.println("          *       *                   *                  ");//21
                System.out.println("                 *                     *             *   ");//22
                System.out.println("                 *                     *    *            ");//23
                System.out.println("    *             *                   *                  ");//24
                System.out.println("                    *               *           *        ");//25
                System.out.println("             *        * * * * * * *                    * ");//26
            }
            case 2 -> {
                System.out.println("          *             *                                ");//1
                System.out.println("                                                     *   ");//2
                System.out.println("                                            *            ");//3
                System.out.println("    *                                                    ");//4
                System.out.println("                                                *        ");//5
                System.out.println("             *                                         * ");//6
                System.out.println("   *                                      *              ");//7
                System.out.println("                        * * * * *                        ");//8
                System.out.println("                      *   •   •   *              *       ");//9
                System.out.println("             *       *      |      *                     ");//10
                System.out.println("    *                *    \\___/    *   *                ");//11
                System.out.println("    **                *           *                 *    ");//12
                System.out.println("      *  *              * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *             * *  *  *  *  * * **  ");//14
                System.out.println("      *             *               *             *      ");//15
                System.out.println("  * *               *               *               *    ");//16
                System.out.println("                     *             *                     ");//17
                System.out.println("                        * * * * *                    *   ");//18
                System.out.println(" *                    *           *          *           ");//19
                System.out.println("            *      *                 *                   ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("       *         *                     *           *     ");//22
                System.out.println("                 *                     * *               ");//23
                System.out.println("                * *                   *                  ");//24
                System.out.println("     *              *               *                    ");//25
                System.out.println("                      * * * * * * *            *         ");//26
            }
            case 3 -> {
                System.out.println("                             *                           ");//1
                System.out.println("       *                                           *     ");//2
                System.out.println("                                         *               ");//3
                System.out.println("                                                         ");//4
                System.out.println("                *                                        ");//5
                System.out.println("     *                                         *         ");//6
                System.out.println("          *                                              ");//7
                System.out.println("                        * * * * *                    *   ");//8
                System.out.println("                      *   •   •   *         *            ");//9
                System.out.println("    *                *      |      *                     ");//10
                System.out.println("                     *    \\___/    *           *        ");//11
                System.out.println("              *       *           *                    * ");//12
                System.out.println("   *                    * * * * *         *              ");//13
                System.out.println("                   * *             * *                   ");//14
                System.out.println("                 *  *               *  *         *       ");//15
                System.out.println("              **    *               *    *               ");//16
                System.out.println("             *       *             *    *  *             ");//17
                System.out.println("    *  * * *            * * * * *            * * *       ");//18
                System.out.println("         * *          *           *          * *         ");//19
                System.out.println("       *   *       *                 *       *   *    *  ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("  *              *                     *                 ");//22
                System.out.println("                 *                     *                 ");//23
                System.out.println("                  *                   *              *   ");//24
                System.out.println(" *                  *               *         *          ");//25
                System.out.println("            *         * * * * * * *                      ");//26
            }
            case 4 -> {
                System.out.println("                                                         ");//1
                System.out.println("  *                                                      ");//2
                System.out.println("               *                                         ");//3
                System.out.println("                                                     *   ");//4
                System.out.println(" *                                            *          ");//5
                System.out.println("            *                                            ");//6
                System.out.println("                                                         ");//7
                System.out.println("       *                * * * * *                  *     ");//8
                System.out.println("                      *   •   •   *      *               ");//9
                System.out.println("                     *      |      *                     ");//10
                System.out.println("                *    *    \\___/    *                    ");//11
                System.out.println("    **                *           *            *    *    ");//12
                System.out.println("      *   *             * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *             * *  *  *  *  * * *   ");//14
                System.out.println("      *             *               *       *     *      ");//15
                System.out.println("    *               *               *               *    ");//16
                System.out.println("                     *             *            *        ");//17
                System.out.println("              *         * * * * *                      * ");//18
                System.out.println("   *                  *           *       *              ");//19
                System.out.println("                   *                 *                   ");//20
                System.out.println("                  *                   *          *       ");//21
                System.out.println("              *  *                     *                 ");//22
                System.out.println("                 *                     **                ");//23
                System.out.println("    *             *                   *                  ");//24
                System.out.println("         *          *               *                    ");//25
                System.out.println("                      * * * * * * *                   *  ");//26
            }
        }
    }

    public static void Clear() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
    

