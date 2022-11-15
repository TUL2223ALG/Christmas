

import java.util.Scanner;

public class ChristmasNovakJakub {
    static Scanner sc = new Scanner(System.in);
    static int n; // pocet sloupcu
    static int m; // pocet radku
    static int giftColour;
    static int ribbonColour;
    public static final String resetC = "\u001B[0m";
    public static final String greenC ="\u001B[32m";
    public static final String redC ="\u001B[31m";
    public static final String yellowC ="\u001B[33m";
    public static final String blueC ="\u001B[34m";
    public static final String purpleC ="\u001B[35m";
    public static final String cyanC ="\u001B[36m";
    public static void main(String[] args) {
        System.out.println("Zadej šířku (min 8)");
        n = sc.nextInt();
        System.out.println("Zadej výšku (min 8)");
        m = sc.nextInt();
        System.out.println("Zadej jaká bude barva dárku? (0-bílá, 1-zelená, 2-červená, 3-žlutá, 4-modrá, 5-fialová, 6-tyrkysová)");
        giftColour = sc.nextInt();
        System.out.println("Zadej jaká bude barva stuhy? (0-bílá, 1-zelená, 2-červená, 3-žlutá, 4-modrá, 5-fialová, 6-tyrkysová)");
        ribbonColour = sc.nextInt();
        
        giftPrint();
    }

    private static void giftPrint() {
        //výpočet šířek stuh
        int x = n/4;
        if (n%2 == 0 && x%2 == 1 ) {
            x = x-1;
        } else if (n%2 ==1 && x%2 == 0) {
            x = x-1;
        }
        int y =(m/2)/3;
        if (m/2%3 == 0 ) {
            y = y-1;
        } else if (m/2%3 == 2) {
            y = y+1;
        }
    
        for (int i = 0; i<m/2; i++){
            for(int k =0; k<m/2-i ;k++){ // mezery před horní stranou
                System.out.print("  ");
            }
            for(int a = 0; i==0 && a < n-3; a++){ //vrchní řada nul
                if (a<(n-x)/2 | a>=(n+x)/2){
                    egePrint();
                } else {
                    ribbonPrint();
                }

            }
            if ((i<=(m/2-1-y)/2 | i>(m/2-1+y)/2)){ //horní strana
                egePrint();
                for(int j =0; i!=0 & j<n-2 ; j++){
                    if (j<(n-2-x)/2 | j>=(n-2+x)/2){
                        insidePrint();
                    } else {
                        ribbonPrint();
                    }
                }
                egePrint();
            }else{
                ribbonPrint();
                for(int j =0; i!=0 & j<n-2 ; j++){
                    ribbonPrint();
                }
                ribbonPrint();
            }
            
            for(int l = m/2; l>m/2-i+1; l--){ //pravá strana horní část
                if((l-(m/2-i+1)<=((m/2-1-y)/2)) | (l-(m/2-i+1)>((m/2-1+y)/2))){
                    insidePrint();
                }else {
                    ribbonPrint();
                }
            }
            egePrint();
            System.out.println("");
        }
        for(int i= 0;i<n;i++){ //hrana horníXpřední strana
            if (i<(n-x)/2 | i>=(n+x)/2){
                egePrint();
            } else {
                ribbonPrint();
            }
        }
        for(int i=0; i<m/2-1; i++){ //pravá strana vedle horníXpřední strany
            if(i<(m/2-1-y)/2 | i>=(m/2-1+y)/2){
                insidePrint();
            }else {
                ribbonPrint();
            }
            
        }
        egePrint();
        System.out.println("");
        for (int i = 0; i < m-2; i++){ //čelo
            //čelo
            egePrint();
            for (int j = 0; j < n-2; j++){
                if (j<(n-2-x)/2 | j>=(n-2+x)/2){
                    insidePrint();
                } else {
                    ribbonPrint();
                }
            }
            egePrint();
            //pravá strana 
            for(int j=0;i <m-2-m/2 && j<m/2-1; j++){
                if(j<(m/2-1-y)/2 | j>=(m/2-1+y)/2){
                    insidePrint();
                }else {
                    ribbonPrint();
                }
            }
            //pravá strana spodní zkosení
            for(int j=m/2; i>=m-2-m/2 && j>i+3-m/2-m%2; j--){
                if(j<(m/2-1-y)/2+2 | j>=(m/2-1+y)/2+2){
                    insidePrint();
                }else {
                    ribbonPrint();
                }
            }
            
            egePrint();
            System.out.println("");
        } 
        for(int i= 0;i<n;i++){ //spodní hrana
            egePrint();
        }
        System.out.println("");
    }

    private static void egePrint() {
        switch (giftColour) {
            case 0: System.out.print("0 "); break;
            case 1: System.out.print(greenC + "0 " + resetC); break;
            case 2: System.out.print(redC + "0 " + resetC); break;
            case 3: System.out.print(yellowC + "0 " + resetC); break;
            case 4: System.out.print(blueC + "0 " + resetC); break;
            case 5: System.out.print(purpleC + "0 " + resetC); break;
            case 6: System.out.print(cyanC + "0 " + resetC); break;
        }
    }

    private static void insidePrint() {
        switch (giftColour) {
            case 0: System.out.print("* "); break;
            case 1: System.out.print(greenC + "* " + resetC); break;
            case 2: System.out.print(redC + "* " + resetC); break;
            case 3: System.out.print(yellowC + "* " + resetC); break;
            case 4: System.out.print(blueC + "* " + resetC); break;
            case 5: System.out.print(purpleC + "* " + resetC); break;
            case 6: System.out.print(cyanC + "* " + resetC); break;
        }
    }

    private static void ribbonPrint() {
        switch (ribbonColour) {
            case 0: System.out.print("X ");; break;
            case 1: System.out.print(greenC + "X " + resetC); break;
            case 2: System.out.print(redC + "X " + resetC); break;
            case 3: System.out.print(yellowC + "X " + resetC); break;
            case 4: System.out.print(blueC + "X " + resetC); break;
            case 5: System.out.print(purpleC + "X " + resetC); break;
            case 6: System.out.print(cyanC + "X " + resetC); break;
            
        }
    }
}
