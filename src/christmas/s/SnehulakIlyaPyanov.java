package snehulak.ilya.pyanov;
 import java.util.Scanner;
public class SnehulakIlyaPyanov {


      


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte velikost snehulaka (min - 1) a jeho jmeno v jednim radku. Napr. - 1 Snehulak");
        int a = sc.nextInt();
        System.out.println("Zadejte jmeno snehulaka");
        String jmeno = sc.nextLine();

        int x = 4;
        int y = 2;

        x *= a;
        y *= a;


        for (int k = 0; k<y*2.25;k++){
            System.out.print(" ");
        }
        System.out.print(".+");
        for(int i = 0; i<x-4; i++){
            System.out.print("*");
        }
        System.out.print("+.");
        System.out.println("");

        for(int i = 0; i<y-1; i++){
            for (int k = 0; k<y*2.25;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int k = 0; k<y*2.25;k++){
            System.out.print(" ");
        }
        System.out.print("'+");
        for(int i = 0; i<x-4; i++){
            System.out.print("*");
        }
        System.out.print("+'");
        System.out.println("");


        x *= 1.5;
        y *= 1.5;

        for (int k = 0; k<y*1.2;k++){
            System.out.print(" ");
        }
        System.out.print(".+");
        for(int i = 0; i<x-4; i++){
            System.out.print("*");
        }
        System.out.print("+.");
        System.out.println("");

        for(int i = 0; i<y-1; i++){
            for (int k = 0; k<y*1.2;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int k = 0; k<y*1.2;k++){
            System.out.print(" ");
        }
        System.out.print("'+");
        for(int i = 0; i<x-4; i++){
            System.out.print("*");
        }
        System.out.print("+'");
        System.out.println("");

        x *= 1.5;
        y *= 1.5;

        for (int k = 0; k<y*0.5;k++){
            System.out.print(" ");
        }
        System.out.print(".+");
        for(int i = 0; i<x-4; i++){
            System.out.print("*");
        }
        System.out.print("+.");
        System.out.println("");

        for(int i = 0; i<y-1; i++){
            for (int k = 0; k<y*0.5;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int k = 0; k<y*0.5;k++){
            System.out.print(" ");
        }
        System.out.print("'+");
        for(int i = 0; i<x-4; i++){
            System.out.print("*");
        }
        System.out.print("+'");
        System.out.println("");

        System.out.format("Ahoj! Ja jsem%s!", jmeno);
    }
}



    
    

