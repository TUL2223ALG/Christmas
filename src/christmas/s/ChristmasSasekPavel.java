
package chrismas.s;
import java.util.Scanner;

/**
 *
 * @author Sasek
 */
public class ChristmasSasekPavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Zadej výšku klobouku (Doporučuji dvouciferné číslo):");
        int vk = sc.nextInt();
        System.out.println("");
        System.out.print("Zadej velikost sněhuláka (Doporučuji jednociferné číslo):");
        int Pol =sc.nextInt();
        int prum = (2*Pol)+1;
        int Pol1 = prum-2;
                             //Klobouk
         System.out.print("     ");
         for (int i = 0; i < Pol1*2; i++){
             System.out.print("=");
         }
         System.out.println("");
         for (int p = 1; p < vk; p++){
             System.out.print("    H");
             for (int i = -1; i < Pol1*2; i++){
                    System.out.print("@");
             }
             System.out.println("H");
         }
         System.out.print("  6");
         for (int i = -1; i < prum*2 ; i++){
             System.out.print("=");
         }
         System.out.print("9");
                             //První koule
        System.out.println("");
        for (int j = 2; j < prum/2; j++) {
            System.out.print("    X");
                for (int i = 0; i < Pol1; i++){
                    System.out.print("#");
                }
             for (int i = -1; i < Pol1; i++){
                    System.out.print("#");
                }
             System.out.print("X");
                System.out.println("");
        }
            System.out.print("    X");
            for (int m = 2; m < Pol1; m++){
                System.out.print("#");
            }
            System.out.print("<<<");
            for (int i = 0; i < Pol1; i++){
                    System.out.print("#");
                }
             System.out.print("X");
                System.out.println("");
            for (int j = 2; j < prum/2; j++) {
            System.out.print("    X");
                for (int i = 0; i < Pol1; i++){
                    System.out.print("#");
                }
             for (int i = -1; i < Pol1; i++){
                    System.out.print("#");
                }
             System.out.print("X");
                System.out.println("");
            }
                             //Prostřední koule
        System.out.print("    ");
        for (int j = 0; j < prum; j++) {
            System.out.print("X ");
        }
        System.out.println("");
        for (int j = 0; j < prum; j++) {
            System.out.print("  X");
                for (int i = -2; i < Pol1; i++){
                    System.out.print("#");
                }
                if (j % 2 == 0) {
                System.out.print("#");
                }
                else {System.out.print("@");
                }//ČÁST S KNOFLÍKEM
                  //  System.out.print("");
                  System.out.print("");
             for (int i = -2; i < Pol1; i++){
                    System.out.print("#");
                }
             System.out.print("X");
                System.out.println("");
                            //spodní koule
        }System.out.print("  ");
        for (int j = 0; j < prum+2; j++) {
            System.out.print("X ");
            System.out.print("");
        }
        System.out.println("");
        for (int j = 0; j < prum+2; j++) {
            System.out.print("X");
                for (int i = -4; i < Pol1; i++){
                    System.out.print("#");
                }
             for (int i = -5; i < Pol1; i++){
                    System.out.print("#");
                }
             System.out.print("X");
                System.out.println("");
    }
    for (int i = 0; i < prum+4; i++){
        System.out.print("X ");
    }
    }
    }
