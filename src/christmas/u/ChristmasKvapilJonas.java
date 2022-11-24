package christmas.u;

import java.util.Scanner;

public class ChristmasKvapilJonas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej 1 pokud chces klobouk, jestli ne tak 0");
        int x = sc.nextInt();
        System.out.println("Zadej 3 nebo 4 podle toho kolik chces aby shenulak mel kouli");
        int y = sc.nextInt();

        if(x == 1){

            for(int i=0; i<3; i++){
                for(int k = 0;k <10;k++){
                    System.out.print(" ");
                }
                for(int j=0;j<5;j++){
                    System.out.print("□ ");
                }
                System.out.println("");
            }
            for(int i=0; i<2; i++){
                for(int k = 0;k <8;k++){
                    System.out.print(" ");
                }
                for(int j=0;j<7;j++){
                    System.out.print("■ ");
                }
                System.out.println("");
            }
        }
        if(y == 3){
            int a;
            int b;
            for(int i = 1; i<=5;i++){
                switch(i){
                    case 1: case 5:
                        a = 3;
                        b = 7;
                        break;


                    case 2: case 4:
                        a=5;
                        b=6;
                        break;
                    case 3:
                        a=7;
                        b=5;
                        break;
                    default:
                        a=9;
                        b=3;
                }

                for(int j=1;j<=b;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=a;k++){
                    System.out.print("X ");
                }
                System.out.println("\n");
            }
            for(int i = 1; i<=7;i++){
                switch(i){
                    case 1: case 7:
                        a = 5;
                        b = 6;
                        break;


                    case 2: case 6:
                        a=9;
                        b=4;
                        break;
                    case 3: case 5:
                        a=11;
                        b=3;
                        break;
                    default:
                        a=13;
                        b=2;
                }

                for(int j=1;j<=b;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=a;k++){
                    System.out.print("X ");
                }
                System.out.println("\n");
            }
            for(int i = 1; i<=9;i++){
                switch(i){
                    case 1: case 9:
                        a = 5;
                        b = 6;
                        break;


                    case 2: case 8:
                        a=9;
                        b=4;
                        break;
                    case 3: case 7:
                        a=11;
                        b=3;
                        break;
                    default:
                        a=13;
                        b=2;
                }

                for(int j=1;j<=b;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=a;k++){
                    System.out.print("X ");
                }
                System.out.println("\n");
            }
        }
        if(y ==4){
            int a;
            int b;
            for(int i = 1; i<=5;i++){
                switch(i){
                    case 1: case 5:
                        a = 3;
                        b = 7;
                        break;


                    case 2: case 4:
                        a=5;
                        b=6;
                        break;
                    case 3:
                        a=7;
                        b=5;
                        break;
                    default:
                        a=9;
                        b=3;
                }

                for(int j=1;j<=b;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=a;k++){
                    System.out.print("X ");
                }
                System.out.println("\n");
            }
            for(int i = 1; i<=7;i++){
                switch(i){
                    case 1: case 7:
                        a = 5;
                        b = 6;
                        break;


                    case 2: case 6:
                        a=9;
                        b=4;
                        break;
                    case 3: case 5:
                        a=11;
                        b=3;
                        break;
                    default:
                        a=13;
                        b=2;
                }

                for(int j=1;j<=b;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=a;k++){
                    System.out.print("X ");
                }
                System.out.println("\n");
            }
            for(int i = 1; i<=9;i++){
                switch(i){
                    case 1: case 9:
                        a = 5;
                        b = 6;
                        break;


                    case 2: case 8:
                        a=9;
                        b=4;
                        break;
                    case 3: case 7:
                        a=11;
                        b=3;
                        break;
                    default:
                        a=13;
                        b=2;
                }

                for(int j=1;j<=b;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=a;k++){
                    System.out.print("X ");
                }
                System.out.println("\n");
            }
            for(int i = 1; i<=11;i++){
                switch(i){
                    case 1: case 11:
                        a = 7;
                        b = 5;
                        break;


                    case 2: case 10:
                        a=11;
                        b=3;
                        break;
                    case 3: case 9:
                        a=13;
                        b=2;
                        break;
                    default:
                        a=15;
                        b=1;
                }

                for(int j=1;j<=b;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=a;k++){
                    System.out.print("X ");
                }
                System.out.println("\n");
            }
        }
        System.out.println("\n" +
                "                                                       ***                          ***                                             \n" +
                "***       ***                                 ***      **         ***       ***     **                                              \n" +
                "***       ***                                 ***     **          ***       ***    **                                               \n" +
                " ***     ***                                  ***                  ***     ***                                                      \n" +
                " ***     ***    *****     ******     *****    ***    *****         ***     ***    *****   *** ****     *****      ****      *****   \n" +
                " ***     ***   *******   ********   *******   ***   *******        ***     ***   *******  *********   *******    ******    *******  \n" +
                "  ***   ***   ***   ***  ***  ***  ***   ***  ***  ***   ***        ***   ***   **   ***  ****  ***  **** ****  **** ***  ***   *** \n" +
                "  ***   ***   ***   ***  ****      ***   ***  ***  ***   ***        ***   ***       ****  ***   ***  ***   ***  ***   *   ***   *** \n" +
                "   *** ***    *********   *****    *********  ***  *********         *** ***      ******  ***   ***  ***   ***  ***       ********* \n" +
                "   *** ***    *********    *****   *********  ***  *********         *** ***     *** ***  ***   ***  ***   ***  ***       ********* \n" +
                "   *** ***    ***            ****  ***        ***  ***               *** ***    ***  ***  ***   ***  ***   ***  ***   *   ***       \n" +
                "    *****     ***   ***  ***  ***  ***   ***  ***  ***   ***          *****     ***  ***  ***   ***  **** ****  **** ***  ***   *** \n" +
                "    *****      *******   ********   *******   ***   *******           *****     ********  ***   ***   *******    ******    *******  \n" +
                "    *****       *****     ******     *****    ***    *****            *****      **** *** ***   ***    *****      ****      *****   ");
    }
    }

