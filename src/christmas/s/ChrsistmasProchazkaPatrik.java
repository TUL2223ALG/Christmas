/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package christmas.s;

import java.util.Scanner;

/**
 *
 * @author patrik.prochazka
 */
public class ChrsistmasProchazkaPatrik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        final int X = 9;

        try {

            System.out.println("Zadej symbol:");
            char symbol = sc.next().charAt(0);

            System.out.println("Zadej počet vloček:");
            int pocet = sc.nextInt();

            System.out.println("");

            for (int k = 0; k < pocet; k++) {

                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < X; j++) {
                        if (i == j || i + j == X - 1 || j == X / 2 || i == X / 2) {
                            System.out.print(symbol + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("");
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("Někde se stala chyba");
        } finally {
            System.out.println("");
            System.out.println("Štastné a veselé");
        } 
    }
    
}
