package javaapplication1;

/**
 *
 * @author jiri.seps
 */
public class ChristmasSepsJiri {
    public static void main(String[] args) {
       int n = 10; // velikost koule
       for(int i = n; i <= 1*n;i++){ System.out.printf("%33s %n", "_---_"); }
       for(int i = n; i <= 1.1*n;i++){ System.out.printf("%34s %n", "|     |"); }
       for(int i = n; i <= 1.1*n;i++){ System.out.printf("%33s %n", "/"); }
       // velikost a usazeni háčku
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) 
                    System.out.print(" $$");
                else                  
                    System.out.print("   ");
            }
            
            System.out.println("");
        }   
    }
}

