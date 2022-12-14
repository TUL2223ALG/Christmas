/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s;

import java.util.Scanner;

/**
 *
 * @author hsodo
 */
public class ChristmasSodomkaJan {
    public static void main(String[] args) {   
        System.out.println("Zadej výšku sněhuláka. Dále napiš 1 pro pokrývku hlavy ve tvaru klobouku nebo 2 pro tvar hrnce");
        Scanner sc=new Scanner (System.in);
 int vyska=sc.nextInt();
 int sirka=(int) Math.floor(4*vyska/5);
 int cepice=sc.nextInt();
 int stred = sirka/2;
        for (int i = 1; i <= vyska; i++) {
            //klobouk
            if (i<Math.floor(10*vyska/100)&&cepice==1) {
                for (int j = 1; j <= sirka; j++) {
                    if (j<=Math.floor(sirka/3) || j>Math.floor(2*sirka/3)){
                        System.out.print("□");}
                    else {System.out.print("■");
                    } 
                } 
                System.out.println("");
                }
            if (i==Math.floor(10*vyska/100)&&cepice==1)
                {
                for (int j = 1; j <= sirka; j++) {
                    if (j<=Math.floor(sirka/3)-vyska/10 || j>Math.floor(2*sirka/3)+vyska/10){
                        System.out.print("□");}
                    else {System.out.print("■");
                    } 
                } 
                System.out.println("");
                }
            
             //hrnec
            if (i<Math.floor(10*vyska/100)/2&&cepice==2) {
                for (int j = 1; j <= sirka; j++) {
                    if (j<=Math.floor(sirka/3) || j>Math.floor(2*sirka/3)){
                        System.out.print("□");}
                    else {System.out.print("■");
                    } 
                } 
                System.out.println("");
                }
               if (i==Math.floor(10*vyska/100/2)&&cepice==2)
                {
                for (int j = 1; j <= sirka; j++) {
                    if (j<=Math.floor(sirka/3)-vyska/20 || j>Math.floor(2*sirka/3)+vyska/20){
                        System.out.print("□");}
                    else {System.out.print("■");
                    } 
                } 
                System.out.println("");
                }
            if (i>Math.floor(10*vyska/100)/2&&i<Math.floor(10*vyska/100)&&cepice==2)
                {
                for (int j = 1; j <= sirka; j++) {
                    if (j<=Math.floor(sirka/3) || j>Math.floor(2*sirka/3)){
                        System.out.print("□");}
                    else {System.out.print("■");
                    } 
                } 
                System.out.println("");
                }
            
            //hlava
            if (i>Math.floor(10*vyska/100) && i<=Math.floor(20*vyska/100)) {
                for (int j = 1; j <=sirka; j++) {
                    if (j<=Math.floor(sirka/3)-Math.floor(i-vyska/10-1)||(j>Math.floor(2*sirka/3)+Math.floor(i-vyska/10-1)))
                    {System.out.print("□");
                    }
                    else{System.out.print("▩");
                    }
                }
            System.out.println("");
            }
            if (i>Math.floor(20*vyska/100) && i<=Math.floor(30*vyska/100)) {
                for (int j = 1; j <=sirka; j++) {
                    if (j<=Math.floor(sirka/3)-Math.floor(3*vyska/10-i)||(j>Math.floor(2*sirka/3)+Math.floor(3*vyska/10-i)))
                    {System.out.print("□");
                    }
                    else{System.out.print("▩");
                    }
                }
            System.out.println("");
            }
            
            //telo
                        if (i>Math.floor(30*vyska/100) && i<=Math.floor(45*vyska/100)) {
                for (int j = 1; j <=sirka; j++) {
                    if (j<=Math.floor(sirka/3)-Math.floor(i-3*vyska/10-1)||(j>Math.floor(2*sirka/3)+Math.floor(i-3*vyska/10-1)))
                    {System.out.print("□");
                    }
                    else{System.out.print("▩");
                    }
                }
            System.out.println("");
            }
            if (i>Math.floor(45*vyska/100) && i<=Math.floor(60*vyska/100)) {
                for (int j = 1; j <=sirka; j++) {
                    if (j<=Math.floor(sirka/3)-Math.floor(6*vyska/10-i)||(j>Math.floor(2*sirka/3)+Math.floor(6*vyska/10-i)))
                    {System.out.print("□");
                    }
                    else{System.out.print("▩");
                    }
                }
            System.out.println("");
            }
            
            //nohy
            
                                    if (i>Math.floor(60*vyska/100) && i<=Math.floor(80*vyska/100)) {
                for (int j = 1; j <=sirka; j++) {
                    if (j<=Math.floor(sirka/3)-Math.floor(i-6*vyska/10-1)||(j>Math.floor(2*sirka/3)+Math.floor(i-6*vyska/10-1)))
                    {System.out.print("□");
                    }
                    else{System.out.print("▩");
                    }
                }
            System.out.println("");
            }
            if (i>Math.floor(80*vyska/100) && i<=Math.floor(100*vyska/100)) {
                for (int j = 1; j <=sirka; j++) {
                    if (j<=Math.floor(sirka/3)-Math.floor(10*vyska/10-i)||(j>Math.floor(2*sirka/3)+Math.floor(10*vyska/10-i)))
                    {System.out.print("□");
                    }
                    else{System.out.print("▩");
                    }
                }
            System.out.println("");
            }
}
}   
}  


