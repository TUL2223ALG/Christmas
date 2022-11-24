
package christmas.s;
import java.util.Scanner;

/**
 *
 * @author matej
 */

public class christmasRetychMatej {
    public static void main(String[] args) {
        int volba = 0;
        Scanner sc = new Scanner(System.in);
        while(volba != 1 && volba != 2 ){
            System.out.println("Jakou ozdobu chcete: 1-diamant, 2-koule");
            volba = sc.nextInt();
        }
        if(volba == 1){
            System.out.println("Zadej velikost: ");
            int velikost = sc.nextInt();
            
            while(velikost <= 0 ){
            System.out.println("Zadej velikost:");
            velikost = sc.nextInt();
            }
            for (int i=1; i<= velikost ; i++) { 
                for (int j = velikost; j > i ; j--) {
                    System.out.print(" ");
                }
            
                    System.out.print("♢");
                for (int k = 1; k < 2*(i -1) ;k++) {
                    System.out.print(" ");
                } 
                
                if( i==1) {
                    System.out.println("");
                } else{ 
                    System.out.println("♢");}
            } 
        
            for (int i=velikost-1; i>= 1 ; i--)
            {   
                for (int j = velikost; j > i ; j--) {
                    System.out.print(" ");
                }   System.out.print("♢");
            
                for (int k = 1; k < 2*(i -1) ;k++) {
                    System.out.print(" ");
                }
                if( i==1){
                    System.out.println("");
                }else{
                    System.out.println("♢");}
            }
        }
        else if(volba == 2){
            double vzdalenost;
            int polomer;
            System.out.print("Zadej polomer: ");
            polomer = sc.nextInt();
            while(polomer <= 0 ){
            System.out.println("Zadej polomer:");
            polomer = sc.nextInt();
            }
            for (int radek = 0; radek <= 2 * polomer; radek++) {
                for (int sloupec = 0; sloupec <= 2 * polomer; sloupec++) {
                    vzdalenost = Math.sqrt((radek - polomer) * (radek - polomer) + (sloupec - polomer) * (sloupec - polomer));
                    if (vzdalenost > polomer - 0.5 && vzdalenost < polomer + 0.5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
