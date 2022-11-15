package Christmas;

import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author danke
 */
public class ChristmasKerslagerDan {

    public static void main(String[] args) {
        //in
        Scanner sc = new Scanner(System.in);
        System.out.println("kolik je domečků?");
        int domy = sc.nextInt();
        System.out.println("jak moc sněží?(číslo)");
        int sněžení = sc.nextInt();
        //assets
        String[] house = {"            ","            ","   \\         ","   ))        "," .-#-----.   ","/_________\\  "," |[] _ []|   ",".|  |*|  |.  "};
        String[][] hous={{},{},{},{},{},{},{},{}};
        String[] middle = {"                |       ","               -+-       ","    o          _|_       ","   }^{        /___\\      ","   /|\\     .---'-'---.   ","  //|\\\\   /___________\\  ","  //|\\\\    | A /^\\ A |   ",".///|\\\\\\...|   |\"|   |..."};
        String[][] middl={{},{},{},{},{},{},{},{}};
        //asset prep
        for (int i = 0;i<house.length;i++){
            hous[i] = house[i].split("");
            middl[i] = middle[i].split("");
        }
        //declarations
        int tree = (int) round(((domy-1) * Math.random()));
        int prnt;
        int snownum = 0;
        int snowfac = (int) round(sněžení*0.91);
        int[]  snowplaces =  (IntStream.generate(() -> new Random().nextInt((domy*7*13)+24)).limit(5*snowfac).toArray());
        //for (int b=0;b<snowplaces.length;b++){System.out.print(snowplaces[b]+" ");}
        boolean bol;
        //out
        for (int n=0 ; n<house.length ; n++){
            for (int dum=0 ; dum<domy+1 ; dum++){
                if (dum==tree){prnt=23;}
                else {prnt=12;}
                for (int m = 0;m<prnt;m++){
                    bol = true;
                    for (int lmao=0;lmao<snowplaces.length;lmao++){
                        if (snownum==snowplaces[lmao]){
                            snowplaces[lmao]=0;
                            bol=false;
                            System.out.print("*");break;}
                    }
                    if (bol==true){
                    if (dum==tree){  System.out.print(middl[n][m]);}
                    else {System.out.print(hous[n][m]);}
                    snownum=snownum+1;}}
                }    
                    if (n==7){System.out.print(("."));}
                    else {System.out.print((" "));}
                    snownum=snownum+1;
                
            System.out.println();}
        }
    }
    

