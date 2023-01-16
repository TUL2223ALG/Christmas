/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s;

import java.util.Random;
import java.util.Scanner;

/**
 * test in: m c 3 3
 * test out: bohuzel nelze ukazat, ale funguje
 * @author jan
 */
public class ChristmasReisiegelJan {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    //Colors
    public static final String RESET = "\033[0m";  // Text Reset
    
    public static final String BLACK = "\033[40m ";  // BLACK nevykresluje se jako cerna barva, ackoli BLACK_ORNAMENT ano
    public static final String RED = "\033[41m ";    // RED
    public static final String GREEN = "\033[42m ";  // GREEN
    public static final String YELLOW = "\033[43m "; // YELLOW
    public static final String BLUE = "\033[44m ";   // BLUE
    public static final String PURPLE = "\033[45m "; // PURPLE
    public static final String CYAN = "\033[46m ";   // CYAN
    public static final String WHITE = "\033[47m ";  // WHITE

    public static final String BLACK_ORNAMENT = "\033[1;30m";  // BLACK
    public static final String RED_ORNAMENT = "\033[1;31m";    // RED
    public static final String GREEN_ORNAMENT = "\033[1;32m";  // GREEN
    public static final String YELLOW_ORNAMENT = "\033[1;33m"; // YELLOW
    public static final String BLUE_ORNAMENT = "\033[1;34m";   // BLUE
    public static final String PURPLE_ORNAMENT = "\033[1;35m"; // PURPLE
    public static final String CYAN_ORNAMENT = "\033[1;36m";   // CYAN
    public static final String WHITE_ORNAMENT = "\033[1;37m";  // WHITE

    public static void main(String[] args) {
        boolean end = false;
        do {
            startDisplay();
            int choice = sc.nextInt();
            switch (choice) {
                case 0 ->
                    end = true;
                case 1 ->
                    printGift();
                default ->
                    System.out.println("Nevalidni vstup");
            }
        } while (!end);

    }

    private static void startDisplay() {
        System.out.println("Vytejte ve vanocnim programu.");
        System.out.println("Jdeme balit darky?");
        System.out.println("    1 - Ano, jdeme balit");
        System.out.println("    0 - Ne, chci skoncit");
    }

    private static void printGift() {
        System.out.println("Zadejte parametry darku: ");
        System.out.println("Zadejte barvu baliciho papiru ");
        System.out.printf("(C - cervena, M - modra, Z - zelena, Y - zluta, F - fialova, T - tyrkysova, W - bila, B - cerna (nefunguje), N - nahodna): ");
        String papirIn = sc.next().toLowerCase();
        System.out.println("Zadejte barvu stuhy na darek ");
        System.out.printf("(C - cervena, M - modra, Z - zelena, Y - zluta, F - fialova, T - tyrkysova, W - bila, B - cerna (nefunguje), N - nahodna): ");
        String stuhaIn = sc.next().toLowerCase();
        System.out.println("Zadejte vysku darku: (nejmene 3)");
        int vyskaDarku = sc.nextInt();
        System.out.println("Zadej sirku darku (nejmene 3)");
        int sirkaDarku = sc.nextInt();
        sirkaDarku = sirkaDarku * 2; //Aby obrázek vypadal hezčeji

        String darek = "";

        String stuha, okrasa;
        if (stuhaIn.equals("n")) {
            int a = rnd.nextInt(7/*8*/);
            switch (a) {
                case 0 ->
                    stuhaIn = "c";
                case 1 ->
                    stuhaIn = "m";
                case 2 ->
                    stuhaIn = "z";
                case 3 ->
                    stuhaIn = "y";
                case 4 ->
                    stuhaIn = "f";
                case 5 ->
                    stuhaIn = "t";
                case 6 ->
                    stuhaIn = "w";
                //case 7 ->
                  //  stuhaIn = "b";
                default ->
                    stuhaIn = "m";
            }
        }

        switch (stuhaIn) {
            case "c" -> {
                stuha = RED;
                okrasa = RED_ORNAMENT;
            }
            case "m" -> {
                stuha = BLUE;
                okrasa = BLUE_ORNAMENT;
            }
            case "z" -> {
                stuha = GREEN;
                okrasa = GREEN_ORNAMENT;
            }
            case "y" -> {
                stuha = YELLOW;
                okrasa = YELLOW_ORNAMENT;
            }
            case "f" -> {
                stuha = PURPLE;
                okrasa = PURPLE_ORNAMENT;
            }
            case "t" -> {
                stuha = CYAN;
                okrasa = CYAN_ORNAMENT;
            }
            case "w" -> {
                stuha = WHITE;
                okrasa = WHITE_ORNAMENT;
            }
            case "b" -> {
                stuha = BLACK;
                okrasa = BLACK_ORNAMENT;
            }
            default -> {
                stuha = BLUE;
                okrasa = BLUE_ORNAMENT;
            }
        }

        String papir;
        if (papirIn.equals("n")) {
            int a = rnd.nextInt(7/*8*/);
            switch (a) {
                case 0 ->
                    papirIn = "c";
                case 1 ->
                    papirIn = "m";
                case 2 ->
                    papirIn = "z";
                case 3 ->
                    papirIn = "y";
                case 4 ->
                    papirIn = "f";
                case 5 ->
                    papirIn = "t";
                case 6 ->
                    papirIn = "w";
                //case 7 ->
                  //  papirIn = "b";
                default ->
                    papirIn = "m";
            }
        }

        switch (papirIn) {
            case "c" ->
                papir = RED;
            case "m" ->
                papir = BLUE;
            case "z" ->
                papir = GREEN;
            case "y" ->
                papir = YELLOW;
            case "f" ->
                papir = PURPLE;
            case "t" ->
                papir = CYAN;
            case "w" ->
                papir = WHITE;
            case "b" ->
                papir = BLACK;
            default ->
                papir = RED;
        }
        for (int i = 1; i <= sirkaDarku; i++) {
            if (sirkaDarku % 2 == 0) {
                if (i == (sirkaDarku / 2) || i == (sirkaDarku / 2) + 1) {
                    darek = darek + okrasa + "|";
                }
                else if ( i == (sirkaDarku / 2) + 2) {
                    darek = darek + okrasa + "/";
                }
                else if (i == (sirkaDarku / 2) - 1) {
                    darek = darek + okrasa + "\\";
                }  
                else {
                    darek = darek + BLACK_ORNAMENT + " ";
                }
            } else {
                if (i == sirkaDarku + 1) {
                    darek = darek + okrasa + "|";
                } else {
                    darek = darek + RESET + " ";
                }
            }
        }
        darek += "\n";
        for (int i = 1; i <= vyskaDarku; i++) {
            for (int j = 1; j <= sirkaDarku; j++) {
                if ((vyskaDarku % 2 == 0) && ((vyskaDarku / 2) == i)) {
                    darek += stuha;
                } else if ((vyskaDarku / 2) + 1 == i) {
                    darek += stuha;
                } else if ((sirkaDarku % 2 == 0) && ((sirkaDarku / 2) == j)) {
                    darek += stuha;
                } else if ((sirkaDarku / 2) + 1 == j) {
                    darek += stuha;
                } else {
                    darek += papir;
                }
            }
            darek += "\n";
        }
        System.out.printf(darek + RESET);
    }
}
