
package christmas.s;

/**
 *
 * @author dominika.strecanska
 */
import java.util.Scanner;
public class ChristmasStrecanskaDominika {

   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Zadaj velkost darceka");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x / 4; i++) {
            vypisZnak(' ',i);
            System.out.print('\\');
            vypisZnak(' ',x/4);
            vypisZnak(' ',x+x/4-i-i-2);
            System.out.println('/');  
        }
        vypisZnak(' ',x/4);
        vypisZnak('-', x);
        System.out.println();
        int a = y / 5 * 4;
        for (int i = 0; i < y; i++) {
            vypisZnak(' ',x/4);
            System.out.print('|');
            if (i == a) {
                vypisZnak('-', x - 2);
            } else {
                vypisZnak(' ', x - 2);
            }
            System.out.println('|');
        }
        vypisZnak(' ',x/4);
        vypisZnak('-', x);
        System.out.println();
        System.out.println("JEJDA!! Darcek je prazdny! Asi si neposluchal. Vesele Vianoce.");
        System.out.println();
    }

    static void vypisZnak(char c, int pocet) {
        for (int i = 0; i < pocet; i++) {
            System.out.print(c);
        }
    }
}
