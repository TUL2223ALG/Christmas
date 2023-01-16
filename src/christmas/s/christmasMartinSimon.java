package christmas.s;


import java.util.Scanner;
//@author marts
 
public class christmasSimon {


    public static void main(String[] args) {
        	
                int d,x,y,r,temp;
		//in
		Scanner sc = new Scanner(System.in);
		System.out.print("Zadejte poloměr ozdoby:");
		r = sc.nextInt();
		d=2*r;

		//print
		for (int rad = 0; rad <= d; rad++) {
			for (int slo = 0; slo <= d; slo++) {
                                //urceni smeru
				x = r - rad;
				y = r - slo;

				temp=x*x+y*y;
				//zjisteni kde je temp
				if (temp<=r*r+1) {
					System.out.print("/#");
				} else {
					System.out.print("  ");
				}
			}
			//preskok na dalsi radek
			System.out.println();
		}
                System.out.println();
                System.out.println();
                System.out.println("Veselé Vánoce :)");
    }

    
}
