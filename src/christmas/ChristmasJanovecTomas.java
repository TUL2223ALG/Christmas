/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmas;
import java.util.Scanner;
/**
 *
 * @author tomja
 */
public class ChristmasJanovecTomas {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int height; //height of the gift (will be multiplied by 10 for better result)
        int width; //width of the fift (will be multiplied by 10 for better result)
        String colorG;//color of the Gift
        String colorB; //color of the Bow
        boolean end;
        char choice;
        welcome(); //prints out welcome menu
        do{
            System.out.println("Jak vysoky chcete darek?");
            height = sc.nextInt() * 10;
            System.out.println("Jak siroky chcete darek?");
            width = sc.nextInt() * 10;
            System.out.println("Jakou chcete barvu darku?");
            colorG = colorchoice();
            System.out.println("Jakou chcete barvu stuhy?");
            colorB = colorchoice();
            draw(height,width,colorG,colorB);
            System.out.println("");
            System.out.println("Chcete zabalit dalsi darek? (y/n)");
            sc.nextLine();
            choice = sc.next().charAt(0);
            end = (choice == 'n');
            
        }while(!end);
        
    }
    private static void welcome(){
        System.out.println("*****************************");
        System.out.println("***PROGRAM NA BALENI DARKU***");
        System.out.println("*****************************");       
    }
    //method that draws out the paramteric picture
    public static void draw(int height, int width, String colorG, String colorB){
        int mini = Math.min(height, width);
        
        int bowWidth = Math.min(height, width)/5;
        

        //loop provides drawing of the bow
        for(int i = 0;i<(2*bowWidth); i++){
            for(int j = 0; j<width;j++){
                if(i<bowWidth){
                    if ((j<=((width/2)-((3*bowWidth)/2))) || (((j>(width/2)-(bowWidth/2)))&&(j<=(width/2)+bowWidth/2)) || (j>(width/2)+((3*bowWidth)/2))) {
                        System.out.print("  ");
                    
                    }else{
                        System.out.print(colorB + "* " + "\u001B[0m");
                    }
                }
                else{
                    if((j<=((width/2)-((3*bowWidth)/2)))||(j>(width/2)+((3*bowWidth)/2))){
                        System.out.print("  ");
                    }else{
                        System.out.print(colorB + "* " + "\u001B[0m");
                    }
                }
            }
            System.out.println("");
        }
       //loop provides drawing of the Gift
        for(int i=0;i<=height+1;i++){
            for(int j = 0; j<=width+1;j++){
                if(i==0 || i==height+1 || j == 0 || j ==width+1){
                    System.out.print(". ");
                }
                else if(i>((height/2)-bowWidth/2)&&i<=(height/2)+(bowWidth/2)){
                    System.out.print(colorB + "* " + "\u001B[0m");
                }
                else if (j>((width/2)-(bowWidth/2)) && j<=((width/2)+(bowWidth/2))){
                    System.out.print(colorB + "* " + "\u001B[0m");
                }else{
                    System.out.print(colorG + "H " + "\u001B[0m");
                }
            }
            System.out.println("");
        }
    }
    //method provides the ANSI escape codes based on users input
    //if invalid input, default color is yellow
    private static String colorchoice(){
        String color;
        int choice;
        System.out.println("1. cernou");
        System.out.println("2. cervenou");
        System.out.println("3. zelenou");
        System.out.println("4. zlutou");
        System.out.println("5. modrou");
        System.out.println("6. fialovou");
        System.out.println("7. bilou");
        choice = sc.nextInt();
        switch(choice){
            case 1 : color = "\u001B[30m"; break;
            case 2 : color = "\u001B[31m"; break;
            case 3 : color = "\u001B[32m"; break;
            case 4 : color = "\u001B[33m"; break;
            case 5 : color = "\u001B[34m"; break;
            case 6 : color = "\u001B[35m"; break;
            case 7 : color = "\u001B[37m"; break;
            default: color = "\u001B[33m";
        }
        return color;
    }
    
}
