/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chrismas.s;


/**
 *
 * @author vyhli
 */
public class ChristmasJanVyhlidko {

    public static void main(String[] args) {
        int polomer = 8;
        int sirka = 8;
        int pomer1; //int pomer2;
        int pozice;
        int navic = 0;
        if (sirka >= 15 && polomer >= 15) {
            navic++;
        }
        int horniPozice = sirka / 2 + sirka % 2;
        int pomocna = sirka - horniPozice;
        
        pomocna = pomocna / 2;
        int mezera = pomocna;
        int pocitani;
        int n = 0;
        int rozdil = 0;

        pomer1 = 1;

        /*if (sirka > polomer) {
            pomer2 = sirka / polomer;
        } else {
            pomer2 = 1;
        }*/
        while (n < 4) {
            pozice = mezera;
            pomocna = mezera;
            pocitani = 1;
            if (n > 0) {
                sirka = sirka + 2; //(pomer*2);
                rozdil = rozdil + 2; //(pomer*2);
                polomer = polomer + pomer1;
            }
            for (int i = 1; i < polomer + 1; i++) {
                /* if (i == polomer /2 && pomer2>1)
                {
                  
                    for (int l = 1; l <= pomer2; l++)
                    {
                        for (int j = 1; j < sirka; j++)
                            System.out.print("* ");
                    }
                }*/
                for (int j = -sirka + (rozdil * 2); j < sirka + 1; j++) {
                    if (j < 1) {
                        for (int k = 1; k <= pomer1; k++) {
                            System.out.print(" ");
                        }
                    }
                    if (j >= 1) {
                        if (pozice > 0) {
                            for (int k = 1; k <= pomer1; k++) {
                                System.out.print("  ");     // prvnihorni mezery
                            }
                            pozice = pozice - 1;
                        } else if (j > (sirka - pomocna)) {
                            for (int k = 1; k <= pomer1; k++) {
                                System.out.print("  ");
                            }
                        } else if (j == mezera + 1 && i == polomer / 3 + polomer % 2 && n == 0 || j == sirka - mezera && i == polomer / 3 + polomer % 2 && n == 0) {
                            for (int k = 1; k <= pomer1; k++) {
                                System.out.print("\u2599");
                                if (sirka % 2 == 0) {
                                    System.out.print(" ");
                                }
                            }

                        } else if (n == 0 && i == polomer / 2 && j >= sirka / 2 && j <= (sirka / 2) + sirka % 2 + 1) {
                            for (int k = 1; k <= pomer1; k++) {
                                System.out.print("@ ");
                            }
                        } else if (n == 0 && i == 2 * polomer / 3 && j > (sirka / 4) && j <= (sirka - mezera)) {
                            for (int k = 1; k <= pomer1; k++) {
                                System.out.print("_ ");
                            }
                        } else if (n == 0 && i == 2 * polomer / 3 && j == (sirka / 4)) {
                            System.out.print("\\ ");
                        } else if (n == 0 && i == 2 * polomer / 3 && j == (sirka - mezera) + 1) {
                            System.out.print("/ ");
                        } else if (n >= 1 && (i >= 2 * polomer / 3 && i <= 2 * polomer / 3 + navic || i >= polomer / 3 && i <= polomer / 3 + navic) && j >= sirka / 2 - navic && j <= (sirka / 2) + sirka % 2 + 1 + navic) {
                            System.out.print("8 ");
                        } else if (i > (polomer - mezera) && j < pocitani + 1 || i > (polomer - mezera) && j > sirka - pocitani) {
                            for (int k = 1; k <= pomer1; k++) {
                                System.out.print("  ");
                            }
                        } else {
                            if (i <= mezera - 1 + navic && n == 0) {
                                System.out.print("^ ");
                            } else//System.out.print("\u2588");
                            {
                                for (int k = 1; k <= pomer1; k++) {
                                    System.out.print("* ");
                                }
                            }
                        }
                    }
                }
                if (i > (polomer - mezera)) {
                    pocitani++;
                }
                pomocna = pomocna - 1;
                pozice = pomocna;

                System.out.println();
            }
            n++;
        }
    }
}
