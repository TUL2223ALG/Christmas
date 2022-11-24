
package christmas.u;

import java.util.Scanner;

public class ChristmasKoptikTomas {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Zadej velikost snehulaka (pouze licha cisla a aspon 5)");
       int n = sc.nextInt();
       System.out.println("Zadej z ceho bude klobouk");
       char znak = sc.next().charAt(0);
       System.out.println("Zadej z ceho bude snehulak");
       char snih = sc.next().charAt(0);
       System.out.println("Zadej z ceho budou oci");
       char oko = sc.next().charAt(0);
       final String ANSI_BLUE = "\u001B[34m";
       final String ANSI_RESET = "\u001B[0m";
       final String ANSI_PURPLE = "\u001B[35m";
       final String ANSI_RED = "\u001B[31m";
       if (n < 5){
           n = 5;
       }
       for (int i = 1 ; i < n; i++){
           System.out.print("           ");
           for (int j = 1;j <= n;j++){
           System.out.print(ANSI_PURPLE + znak + ANSI_RESET);    
           }
        System.out.println();
        }
        System.out.print("         " + ANSI_PURPLE + znak + ANSI_RESET);
        for (int i = 1;i <= n+3;i++){
        System.out.print(ANSI_PURPLE + znak+ ANSI_RESET);
        }
        System.out.println();
        System.out.print("           ");
        for (int i = 1; i <= n;i++){
        System.out.print(snih);
        }
        System.out.println("           ");
        for (int i = 0; i <= n;i++){
            if (i < 1){
            System.out.print("           " + snih);
            } else if (i < 2){
              System.out.print(ANSI_BLUE + oko + ANSI_RESET );
            } else if (i < n-2){
              System.out.print(snih);
            } else if (i < n-1){
              System.out.print(ANSI_BLUE + oko + ANSI_RESET);
            } else if (i < n){
              System.out.print(snih);
            }
        }     
        System.out.println("           ");
        for (int i = 0; i <= n;i++){
            if (i < 1){
            System.out.print("           " + snih);
            } else if (i < n/2){
              System.out.print(snih);
            } else if (i < n/2+1){
              System.out.print(ANSI_RED + "I" + ANSI_RESET);
            } else if (i < n){
              System.out.print(snih);
            }      
        }  
        System.out.println("           ");
        for (int i = 1 ; i < n-3; i++){
           System.out.print("           ");
           for (int j = 1;j <= n;j++){
           System.out.print(snih);    
           }
        System.out.println();
        }
        for (int i = 1 ; i < n+3; i++){
           System.out.print("         " + snih);
           for (int j = 1;j <= n+3;j++){
           System.out.print(snih);    
           }
        System.out.println();
        }
        for (int i = 1 ; i < n+5; i++){
           System.out.print("       "  + snih);
           for (int j = 1;j <= n+7;j++){
           System.out.print(snih);    
           }
        System.out.println();
    } 

}  
} 
             
 


       
       
       
    
   

