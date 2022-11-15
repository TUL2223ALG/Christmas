/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package christmas;

import java.util.Scanner;

/**
 *
 * @author Lukáč Matěj
 */
public class ChristmasLukacMatej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deerNumber,housesNumber;
        System.out.println("Napiš počet santových sobů");
        deerNumber = sc.nextInt();
        System.out.println("Napiš počet domků nad kterými letí santa");
        housesNumber = sc.nextInt();
        DrawSantaDeer(deerNumber);
        DrawHouses(housesNumber);
    }
        public static void DrawSantaDeer(int num){
            System.out.println("                    _...");
            System.out.println("              o_.-\"`    `\\");
            System.out.println("       .--.  _ `'-._.-'\"\"-;     _");
            System.out.println("     .'    \\`_\\_  {_____--}  _ / \\");
            System.out.println("   _/     .-'  '. {c-._o_.){\\|`  |");
            System.out.println("  (@`-._ /       \\{    ^  } \\\\ _/");
            System.out.println("   `~\\  '-._      /'.     }  \\}  .-.");
            System.out.println("     |>:<   '-.__/   '._,} \\_/  / ())");
            System.out.print("     |     >:<   `'---. ____'-.|(`\"`     ");
            for(int i=0; i < num;i++){
                System.out.print("         { }    ");
            }
            System.out.println("");
            
            System.out.print("     \\            >:<  \\\\_\\\\_\\ | ;       ");
            for(int i=0; i < num;i++){
                System.out.print("         {^^,   ");
            }
            System.out.println("");
            
            System.out.print("      \\                 \\\\-{}-\\/  \\      ");
            for(int i=0; i < num;i++){
                System.out.print("         (   `-;");
            }
            System.out.println("");
            
            System.out.print("       \\                 '._\\\\'   /)     ");
            for(int i=0; i < num;i++){
                System.out.print("    _     `;;~~ ");
            }
            System.out.println("");
            
            System.out.print("        '.                       /(      ");
            for(int i=0; i < num;i++){
                System.out.print("   /(______);   ");
            }
            System.out.println("");
            //santa
            System.out.print("          `-._ _____ _ _____ __.'\\ \\     ");
            //reindeer
            for(int i=0; i < num;i++){
                System.out.print("  (          (  ");
            }
            System.out.println("");
            
            System.out.print("            / \\     / \\     / \\   \\ \\    ");
            for(int i=0; i < num;i++){
                System.out.print("   |:------( )  ");
            }
            System.out.println("");
            
            System.out.print("         _.'/^\\'._.'/^\\'._.'/^\\'.__) \\   ");
            for(int i=0; i < num;i++){
                System.out.print(" _//         \\ ");
            }
            System.out.println("");
            
            System.out.print("     ,=='  `---`   '---'   '---'      )  ");
            for(int i=0; i < num;i++){
                System.out.print("/ /           vv");
            }
            System.out.println("");
            System.out.println("");  
    }

    private static void DrawHouses(int num) {
        String[] domek = new String[] {
            "           .:'    .:'    .:'             ",
            "         /\\||   /\\||   /\\||              ",
            "        //\\\\|  //\\\\|  //\\\\|              ",
            "       //  \\\\ //  \\\\ //  \\\\              ",
            "      //    \\^/    \\^/    \\\\             ",
            "      |[]  []|[]  []|[]  []|             ",
            "     &|  ||  %  ||  |  ||  |%            ",
            "\"\"\"\"\"\"&%&--==--&%-==--%&\"\"\"\"\"%&%\"\"\"\"\"\"\"\"\""};
            for(int x = 0; x < domek.length;x++){
                for(int p = 0; p < num; p++){
                    System.out.print(domek[x]);
                }
                System.out.println("");
            }       
    }
    
}
/* 
  \_/       .:'    .:'    .:'
-=(_)=-  /\||   /\||   /\||
  / \   //\\|  //\\|  //\\|
       //  \\ //  \\ //  \\
      //    \^/    \^/    \\
      |[]  []|[]  []|[]  []|
     &|  ||  %  ||  |  ||  |%
  &%&--==--&%-==--%&"""""%&%""""
*/

/*
         { }
         {^^,
         (   `-;
    _     `;;~~
   /(______);
  (          (
   |:------( )
 _//         \\
/ /          vv*/