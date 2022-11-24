/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ChristmasNydrleDaniel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String[] VZOR_VOSI_HNIZDO = {
            "____ØØ____",
            "___ØØ_Ø___",
            "__ØØ___Ø__",
            "__ØØØØ_Ø__",
            "_ØØ_____Ø_",
            "_ØØØØØØ_Ø_",
            "_Ø______Ø_",
            "ØØØØØØØØ_Ø",
            "Ø________Ø",
            "ØØØØØØØØØØ"
        };

        final String[] VZOR_ROHLICEK = {
            "___ØØØØØ___",
            "_ØØ_____Ø__",
            "Ø________Ø_",
            "Ø__ØØØØ___Ø",
            "_ØØ____Ø__Ø",
            "_______Ø__Ø",
            "_______Ø__Ø",
            "_ØØ____Ø__Ø",
            "Ø__ØØØØ___Ø",
            "Ø________Ø_",
            "_ØØ_____Ø__",
            "___ØØØØØ___",};

        final String[] VZOR_SLEPOVANE = {
            "____ØØ____",
            "__ØØ__ØØ__",
            "_Ø______Ø_",
            "_Ø__ØØ__Ø_",
            "Ø__ØØØØ__Ø",
            "Ø__ØØØØ__Ø",
            "_Ø__ØØ__Ø_",
            "_Ø______Ø_",
            "__ØØ__ØØ__",
            "____ØØ____",};

        System.out.println("Kolik vosich hnizd? ");
        int pocetVosichHnizd = sc.nextInt();
        System.out.println("Kolik rohlicku? ");
        int pocetRohlicku = sc.nextInt();
        System.out.println("Kolik slepovanych? ");
        int pocetSlepovanych = sc.nextInt();

        for (String row : VZOR_VOSI_HNIZDO) {
            row = rowColor(row, RED);
            for (int i = 0; i < pocetVosichHnizd; i++) {
                System.out.printf("%s  ", row);
            }
            System.out.printf("%s%n", COLOR_RESET);
        }
        System.out.printf("%n%n");

        for (String row : VZOR_ROHLICEK) {
            row = rowColor(row, YELLOW);
            for (int i = 0; i < pocetRohlicku; i++) {
                System.out.printf("%s  ", row);
            }
            System.out.printf("%n");
        }
        System.out.printf("%s%n%n", COLOR_RESET);

        for (int i = 0; i < VZOR_SLEPOVANE.length; i++) {
            String row = VZOR_SLEPOVANE[i];
            for (int j = 0; j < pocetSlepovanych; j++) {
                switch (i) {
                    case 3, 6 -> {
                        System.out.printf(
                                "%s",
                                rowColor(
                                        row.substring(0, 4),
                                        YELLOW
                                )
                        );
                        System.out.printf(
                                "%s",
                                rowColor(
                                        row.substring(4, 6),
                                        RED
                                )
                        );
                        System.out.printf(
                                "%s  ",
                                rowColor(
                                        row.substring(6, 10),
                                        YELLOW
                                )
                        );
                    }
                    case 4, 5 -> {
                        System.out.printf(
                                "%s",
                                rowColor(
                                        row.substring(0, 3),
                                        YELLOW
                                )
                        );
                        System.out.printf(
                                "%s",
                                rowColor(
                                        row.substring(3, 7),
                                        RED
                                )
                        );
                        System.out.printf(
                                "%s  ",
                                rowColor(
                                        row.substring(7, 10),
                                        YELLOW
                                )
                        );
                    }
                    default ->
                        System.out.printf(
                                "%s  ",
                                rowColor(row, YELLOW)
                        );
                }
            }
            System.out.printf("%n");
        }
        System.out.printf("%s", COLOR_RESET);
    }

    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String WHITE = "\u001B[37m";
    public static final String COLOR_RESET = "\u001B[0m";

    public static String rowColor(String row, String color) {
        return row.replaceAll("_", WHITE + "_").replaceAll("Ø", color + "Ø");
    }
;
}
