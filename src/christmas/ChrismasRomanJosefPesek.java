
package javaapplication2;

import java.util.Scanner;

public class ChrismasRomanJosefPesek {

    public static void main(String[] args) {
        System.out.println("Pokud má svíčka svítit zadejte 1, pokud ne zadejte 2");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int XCandle = 8;
        int YCandle = 15;
        if (k == 1) {

            for (int a = 1; a <= 1; a++) {
                for (int i = 1; i <= XCandle + 8; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 1; i++) {
                    System.out.print("*");
                }
                System.out.println("");

            }
            for (int a = 1; a <= 1; a++) {
                for (int i = 1; i <= XCandle + 8; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 3; i++) {
                    System.out.print("*");
                }
                System.out.println("");

            }

            for (int a = 1; a <= 1; a++) {
                for (int i = 1; i <= XCandle + 8; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 5; i++) {
                    System.out.print("*");
                }
                System.out.println("");

            }
            for (int a = 1; a <= 1; a++) {
                for (int i = 1; i <= XCandle + 7; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 7; i++) {
                    System.out.print("*");
                }
                System.out.println("");

            }
            for (int a = 1; a <= 1; a++) {
                for (int i = 1; i <= XCandle + 8; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 5; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        for (int a = 1; a <= 1; a++) {
            for (int i = 1; i <= XCandle + 8; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 3; i++) {
                System.out.print("|");
            }
            System.out.println("");

        }
        for (int a = 1; a <= 1; a++) {
            for (int i = 1; i <= XCandle + 7; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 3; i++) {
                System.out.print("|");
            }
            System.out.println("");

        }
        for (int a = 1; a <= 1; a++) {
            for (int i = 1; i <= XCandle + 6; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 3; i++) {
                System.out.print("|");
            }
            System.out.println("");

        }

        for (int j = 1; j <= YCandle; j++) {

            for (int i = 1; i <= XCandle; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= XCandle; i++) {
                System.out.print("+ ");

            }
            System.out.println("");
        }

    }
}
