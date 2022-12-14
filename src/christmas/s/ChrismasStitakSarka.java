/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chrismas.s;

import java.util.Scanner;

/**
 *
 * @author sarka
 */
public class ChrismasStitakSarka {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pocetPonozek, sirkaKrbu,svicky, datum;
        String ohen ;
        System.out.println("Kolik si vás doma zaslouží dárky?");
        pocetPonozek = sc.nextInt();
        System.out.println("Máte rádi oheň? A/N");
        ohen = sc.next();
        System.out.println("Jaký je dneska den? (pouze číslo)");
        datum = sc.nextInt();
        String mezery="            ";
        String mezery2="          ";
        svicky = 4;
        sirkaKrbu = pocetPonozek*9 + 22;
        svickyOhen("     |    ","     O    ", svicky, sirkaKrbu, datum);
        svicky("     ))   ", svicky,sirkaKrbu);
        svicky("     ||   ", svicky,sirkaKrbu);
        svicky("     ||   ", svicky,sirkaKrbu);
        svicky("   __||_  ", svicky,sirkaKrbu);
        svicky("  (_)__(  ", svicky,sirkaKrbu);
        svicky("   /    \\ ", svicky,sirkaKrbu);
        //vrchní část římsy
        for(int j=0; j<sirkaKrbu+4; j++){
            if (j==0){
                System.out.print(" "+"_");
            }
            else{
                System.out.print("_");
            }
        }
        System.out.println();
        //spodní část římsy
        for(int j=0; j<sirkaKrbu+4; j++){
            if (j==0){
                System.out.print("|_");
            }
            else if (j==sirkaKrbu+3){
                System.out.print("_|");
            }
            else {
                System.out.print("_");
            }
        }
        System.out.println();
        //ponozky
        ponozky("   __(/  ", pocetPonozek, mezery, mezery2);
        ponozky("  [___]  ", pocetPonozek, mezery, mezery2);
        ponozky(" _|   |  ", pocetPonozek, mezery, mezery2);
        ponozky("(|___/)  ", pocetPonozek, mezery, mezery2);
        prazdnePole(sirkaKrbu);
        prazdnePole(sirkaKrbu);
        if (ohen.equals("A")){
            krbSOhnem(pocetPonozek, sirkaKrbu);
        }
        else if (ohen.equals("N")) {
            krbBezOhne(pocetPonozek,sirkaKrbu);
        }
        System.out.println("Štastné a veselé Vánoce");
        //konec
    }
    public static void ponozky(String x, int pocetPonozek, String mezery, String mezery2) {
        for (int i=0; i<pocetPonozek; i++){
            if(i==0){
                System.out.print("  |"+ mezery +x);
            }
            else if(i==pocetPonozek-1){
                System.out.print(x + mezery2 + "|");
            }
            else{
                System.out.print(x);
            }
        }
        System.out.println();
    }
    public static void svicky(String x, int svicky, int sirkaKrbu) {
        String mezery = "";
        for (int i=0; i<svicky; i++){
            if(i==0){
                for(int j=0; j<(sirkaKrbu-(svicky*10))/2; j++){
                    mezery = mezery + " ";
                }
                System.out.print("  "+mezery + x);
            }
            else {
                System.out.print(x);
            }
        }        
        System.out.println();
    }
    public static void svickyOhen(String x, String y, int svicky, int sirkaKrbu, int datum) {
        String mezery = "";
        int pocetSvicek = 0;
        if (datum>=27 && datum<=30 || datum>0 && datum<=3){
            pocetSvicek = 1;
        }
        else if (datum>=4&&  datum<=10){
            pocetSvicek = 2;
        }
        else if (datum>=11&&  datum<=17){
            pocetSvicek = 3;
        }
        else if (datum>=18&&  datum<=26){
            pocetSvicek = 4;
        }
        for (int i=0; i<svicky; i++){
            if (i==0){
                for(int j=0; j<(sirkaKrbu-(svicky*10))/2; j++){
                    mezery = mezery + " ";
                }
                System.out.print("  "+mezery + y);
            }
            else if (i!=0 && i<pocetSvicek){
                System.out.print(y);
            }
            else {
                System.out.print(x);
            }
        }
        System.out.println();
    }
    public static void prazdnePole(int sirkaKrbu){
    for(int i = 0; i<sirkaKrbu; i++){
            if(i==0){
                System.out.print("  | ");
            }
            else if (i==sirkaKrbu-1){
                System.out.print(" |");
            }
            else {
                System.out.print(" ");
            }
                
        }
    System.out.println();
    }
    public static void krbBezOhne(int pocetPonozek, int sirkaKrbu){
        String mezeryOhen = "";
        String mezeryOhen2 = "";
        if (pocetPonozek%2 != 0){
            for (int i=0; i<=(sirkaKrbu-33)/2; i++){
                mezeryOhen = mezeryOhen + " ";
            }
            for (int i=0; i<(sirkaKrbu-33)/2-1; i++)
                mezeryOhen2 = mezeryOhen2 + " ";
            }
        
        else 
            {
            for (int i=0; i<=(sirkaKrbu-33)/2; i++){
                mezeryOhen = mezeryOhen + " ";
            }
            for (int i=0; i<(sirkaKrbu-33)/2; i++){
                mezeryOhen2 = mezeryOhen2 + " ";
            }
        }
        System.out.print("  |"+mezeryOhen+"  .---------------------------.  "+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+" /|                            \\ "+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"| |                             |"+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"| |_____________________________|"+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"| /                             |"+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"|/                              |"+mezeryOhen2+"|");
        System.out.println();
        String pomlcky = "";
        String pomlcky2 = "";
        if (pocetPonozek%2 != 0){
            for (int i =0; i<=(sirkaKrbu-33)/2; i++){
                pomlcky = pomlcky + "-";
            }
            for (int i =0; i<(sirkaKrbu-33)/2-1; i++){
                pomlcky2 = pomlcky2 + "-";
            }
        }
        else{
            for (int i =0; i<=(sirkaKrbu-33)/2; i++){
                pomlcky = pomlcky + "-";
            }
            for (int i =0; i<(sirkaKrbu-33)/2; i++){
                pomlcky2 = pomlcky2 + "-";
            }
        }
            
        System.out.print("   "+ pomlcky + "=================================" + pomlcky2);
        System.out.println();
}
    public static void krbSOhnem(int pocetPonozek, int sirkaKrbu){
            String mezeryOhen = "";
        String mezeryOhen2 = "";
        if (pocetPonozek%2 != 0){
            for (int i=0; i<=(sirkaKrbu-33)/2; i++){
                mezeryOhen = mezeryOhen + " ";
            }
            for (int i=0; i<(sirkaKrbu-33)/2-1; i++)
                mezeryOhen2 = mezeryOhen2 + " ";
            }
        
        else 
            {
            for (int i=0; i<=(sirkaKrbu-33)/2; i++){
                mezeryOhen = mezeryOhen + " ";
            }
            for (int i=0; i<(sirkaKrbu-33)/2; i++){
                mezeryOhen2 = mezeryOhen2 + " ";
            }
        }
        System.out.print("  |"+mezeryOhen+"  .---------------------------.  "+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+" /|              )             \\ "+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"| |             ((              |"+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"| |____________))((_____________|"+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"| /       (___(_(())__()        |"+mezeryOhen2+"|");
        System.out.println();
        System.out.print("  |"+mezeryOhen+"|/        (          ()         |"+mezeryOhen2+"|");
        System.out.println();
        String pomlcky = "";
        String pomlcky2 = "";
        if (pocetPonozek%2 != 0){
            for (int i =0; i<=(sirkaKrbu-33)/2; i++){
                pomlcky = pomlcky + "-";
            }
            for (int i =0; i<(sirkaKrbu-33)/2-1; i++){
                pomlcky2 = pomlcky2 + "-";
            }
        }
        else{
            for (int i =0; i<=(sirkaKrbu-33)/2; i++){
                pomlcky = pomlcky + "-";
            }
            for (int i =0; i<(sirkaKrbu-33)/2; i++){
                pomlcky2 = pomlcky2 + "-";
            }
        }
            
        System.out.print("   "+ pomlcky + "=================================" + pomlcky2);
        System.out.println();
}
}


