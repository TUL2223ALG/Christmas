package christmas.s;

import java.util.Scanner;

/**
 *
 * @author michal.pokorny
 */
public class ChristmasMichalPokorny {

    public static void main(String[] args) {
    //input
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej sirku:");
        int x = sc.nextInt();
        System.out.println("zadej vysku:");
        int y = sc.nextInt();
        System.out.println("zadej hloubku:");
        int z = sc.nextInt();
        System.out.println();
        
        // first line
        for (int i = 0; i < x; i++) {
            System.out.print("X ");
        }
        System.out.println("");
        
        //upper side
        for (int k = 0; k < z - 2; k++) {
            System.out.print("X ");
            for (int l = 0; l < k; l++){
                System.out.print("  ");
            }
            System.out.print("X ");
            // O | + bow
            int bow = (k == Math.round((z-2)/2))? 1 : 0;
            for (int j = 0; j < (x-2)/2-bow; j++) {
                System.out.print("  ");
            }
            if(bow==1){
                System.out.print("\\_+_/ ");
            }else{
                System.out.print("O ");
            }
            for (int j = 0; j < Math.round((x-2)/2.0-1)-bow; j++) {
                System.out.print("  ");
            }
            System.out.println("X ");
        }
        
        //front side first line
        System.out.print("X ");
        for (int l = 0; l < z-2; l++){
            System.out.print("  ");
        }
        for (int i = 0; i < x; i++) {
            System.out.print("X ");
        }
        
        //front side middle
        System.out.println("");
        int sideO = 0;
        for (int i = 0; i < y - 2 - z + 1; i++) {
            //O \
            System.out.print("X ");
            if (y >= 2 * z && i < Math.round((y - 2)/2.0 -1) && i > Math.round((y - 2) / 2.0 - z + 1 -1)) {
                for (int l = 0; l < sideO; l++) {
                    System.out.print("  ");
                }
                System.out.print("O ");
                for (int l = 0; l < z - sideO - 3; l++) {
                    System.out.print("  ");
                }
                sideO += 1;
            } else {
                for (int l = 0; l < z - 2; l++) {
                    System.out.print("  ");
                }
            }
            System.out.print("X ");
            // O |
            for (int j = 0; j < (x-2)/2; j++) {
                if (i == Math.round((y-2)/2.0-1)){
                    System.out.print("O ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("O ");
            for (int j = 0; j < Math.round((x-2)/2.0-1); j++) {
                if (i == Math.round((y-2)/2.0-1)){
                    System.out.print("O ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("X ");
        }
        //front side near bottom 
        for (int k = 0; k < z - 2; k++) {
            System.out.print("  ");
            for (int l = 0; l < k; l++){
                System.out.print("  ");
            }
            System.out.print("X ");
            for (int l = 0; l < z - k - 3; l++){
                System.out.print("  ");
            }
            System.out.print("X ");
            // O |
            for (int j = 0; j < (x-2)/2; j++) {
                System.out.print("  ");
            }
            System.out.print("O ");
            for (int j = 0; j < Math.round((x-2)/2.0-1); j++) {
                System.out.print("  ");
            }
            System.out.println("X ");
        }
        
        //front line last line
        for (int l = 0; l < z-1; l++){
            System.out.print("  ");
        }
        for (int i = 0; i < x; i++) {
            System.out.print("X ");
        }
        System.out.println("");
    }

}
