/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakubkonerza
 */
import java.util.Scanner;
import java.util.ArrayList; 

public class vanocni_uloha_final {

    public static void VytiskniDarecek(String[][] jmenoDarecku) {
        for (int i = 0; i < jmenoDarecku.length; i++) {;
            for (int j = 0; j < jmenoDarecku[i].length; j++) {
                System.out.print(jmenoDarecku[i][j]);
            }

            System.out.println("");
        }
    }
            
    public static void VytiskniRadky(int x, int y){
        ArrayList<ArrayList<ArrayList<String>>> darecky = new ArrayList<>(x);
        for (int i = 0; i < 10; i++) {
            
        }
        
    } 

    public static String[][] returnDarecek() {
        // Dárečky
        String[][] darecekBlank = {
            {"_", "_", "_", "_", "_", "∞", "_", "_", "_", "_", "_"},
            {"#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"},};

        String[][] darecekKrizek = {
            {"_", "_", "_", "_", "_", "∞", "_", "_", "_", "_", "_"},
            {"#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", " ", " ", " ", "+", "+", "+", " ", " ", " ", "#"},
            {"#", " ", " ", "+", " ", "*", " ", "+", " ", " ", "#"},
            {"#", " ", " ", " ", "+", "+", "+", " ", " ", " ", "#"},
            {"#", "_", "_", "_", "_", "_", "_", "_", "_", "_", "#"},};

        String[][] darecekJmeno = {
            {"_", "_", "_", "_", "_", "∞", "_", "_", "_", "_", "_"},
            {"#", " ", " ", " ", " ", "j", " ", " ", " ", " ", "#"},
            {"#", " ", " ", " ", " ", "a", " ", " ", " ", " ", "#"},
            {"#", " ", " ", "j", "a", "k", "u", "b", " ", " ", "#"},
            {"#", " ", " ", " ", " ", "u", " ", " ", " ", " ", "#"},
            {"#", "_", "_", "_", "_", "b", "_", "_", "_", "_", "#"},};

        String[][] darecekSachovnice = {
            {"_", "_", "_", "_", "_", "∞", "_", "_", "_", "_", "_"},
            {"#", "□", "■", "□", "■", "□", "■", "□", "■", "□", "#"},
            {"#", "■", "□", "■", "□", "■", "□", "■", "□", "■", "#"},
            {"#", "□", "■", "□", "■", "□", "■", "□", "■", "□", "#"},
            {"#", "■", "□", "■", "□", "■", "□", "■", "□", "■", "#"},
            {"#", "□", "■", "□", "■", "□", "■", "□", "■", "□", "#"},};
        
        String[][] darecekSix = {
            {"_", "_", "_", "_", "_", "∞", "_", "_", "_", "_", "_"},
            {"#", "■", "■", "■", "□", "□", "■", "■", "■", "□", "#"},
            {"#", "■", "□", "□", "□", "□", "■", "□", "■", "□", "#"},
            {"#", "■", "■", "■", "□", "□", "■", "■", "■", "□", "#"},
            {"#", "■", "□", "■", "□", "□", "□", "□", "■", "□", "#"},
            {"#", "■", "■", "■", "□", "□", "■", "■", "■", "□", "#"},};

        // Seznam dárečků
        String[] seznamDarecku = {"darecekBlank", "darecekKrizek", "darecekJmeno", "darecekSachovnice", "darecekSix"};

        // Náhodná generace čísla dárečku
        int cisloDarecku = (int) (Math.random() * (double) (seznamDarecku.length));

        // Výběr dárečku
        switch (cisloDarecku) {
            case 0:
                return darecekBlank;
            case 1:
                return darecekKrizek;
            case 2:
                return darecekJmeno;
            case 3:
                return darecekSachovnice;
            case 4:
                return darecekSix;    
            default:
                return null;
        }

    }

    public static void main(String[] args) {

        // Vstup uživatele
        System.out.println("Zadejte počet dárečků");
        Scanner sc = new Scanner(System.in);
        int vstup1 = sc.nextInt();
        
        //int vstup2 = sc.nextInt();
        for (int i = 0; i < vstup1; i++) {
            System.out.print("");
          VytiskniDarecek(returnDarecek());  
        }
   
        
    }
}
