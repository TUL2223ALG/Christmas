    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pocitanimzdy;

/**
 *
 * @author Vitek-game
 */
public class vanocniozdoba {
    

  public static void main(String[] args) {
    int sirkaSvicky = 6;
    int vyskaSvicky = 12;
    for (int j = 1; j <= 2 ;j++){
        for(int i=1;i<=sirkaSvicky+4;i++){
                System.out.print(" ");
        }
        for(int i =1;i<=3;i++){
            System.out.print("|");}
        System.out.println("");
        
    }
    
    for (int j = 1; j <= vyskaSvicky ;j++){

        for(int i=1;i<=sirkaSvicky;i++){
                System.out.print(" ");
        }
        
        for(int i = 1; i<=sirkaSvicky; i++){
        System.out.print("# ");
        }
        
    System.out.println("");
    }
    for (int j = 1; j <= 2 ;j++){
    for(int i=1; i <= vyskaSvicky*2; i++){ 
            System.out.print("-");}
            System.out.println(" ");
    }
}
}