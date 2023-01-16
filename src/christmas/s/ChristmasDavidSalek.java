package christmas.s;

import java.util.Scanner;

public class ChristmasDavidSalek {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLACKB = "\u001B[40m";
	// pT prints tree
	public static void pT(int x) {
		String print[] = {
				"         ",
				"         ",
				"    o    ",
				"   }^{   ",
				"   /|\\   ",
				"  //|\\\\  ",
				"  //|\\\\  ",
				".///|\\\\\\."
		};
		System.out.print(print[x]);
	}
	// pS prints snowman
	public static void pS(int x) {
		String print[] = {
				"       ",
				"       ",
				"       ",
				"       ",
				"       ",
				" _.O./ ",
				"  (^)  ",
				"..(^).."
		};
		System.out.print(print[x]);
	}
	// pH prints house
	public static void pH(int x) {
		String print[] = {
				"             ",
				"             ",
				"    \\        ",
				"    ))       ",
				"  .-#-----.  ",
				" /_________\\ ",
				"  |[] _ []|  ",
				"..|  |*|  |.."
		};
		System.out.print(print[x]);
	}
	// pB prints barn
	public static void pB(int x) {
		String print[] = {
				"                   ",
				"                   ",
				"                   ",
				"                   ",
				"        .-------.  ",
				"   ___ /_________\\ ",
				"  /___\\ |       |  ",
				"..|\"#\"|.|   |*| |.."
		};
		System.out.print(print[x]);
	}
	// pC prints church
	public static void pC(int x) {
		String print[] = {
				"       |       ",
				"      -+-      ",
				"      _|_      ",
				"     /___\\     ",
				"  .---'-'---.  ",
				" /___________\\ ",
				"  | A /^\\ A |  ",
				"..|   |\"|   |.."
		};
		System.out.print(print[x]);
	}
	// pM prints moon
	public static void pM(int x) {
		String print[] = {
				" .-.",
				"( ( ",
				" '-`",
				"    ",
				"    ",
				"    ",
				"    ",
				"...."
		};
		System.out.print(print[x]);
	}
	
	// Christmas village generator
	public static void village() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Postav si svoji vlastni vanocni vesnicku!\n"
				+ "Muzes stavet: \nh = house\nb = barn\nt = tree\ns = snowman\nc = church\nm - moon\n"
				+ "Poradi je libovolne a neomezene, zadejte vzdy prvni pismena objektu \"x,x,x,...\"\n");
		System.out.printf("----------------------------\n");
		System.out.print("Vase volba: ");
		String in = sc.nextLine();
		System.out.printf("----------------------------\n");
		char[] inFormated = in.toLowerCase().replace(",", "").replace(" ", "").toCharArray();
		/*
		System.out.printf("Debug: %S", edit);
		for(int z = 0; z<inFormated.length; z++) {
		System.out.print(inFormated[z]);	
		}
		System.out.printf("\n");
		*/
		for(int i = 0; i<8; i++) {
			for(int x = 0; x<inFormated.length; x++) {
				if(inFormated[x]=='h') {
					pH(i);
				}
				if(inFormated[x]=='b') {
					pB(i);
				}
				if(inFormated[x]=='t') {
					pT(i);
				}
				if(inFormated[x]=='s') {
					pS(i);
				}
				if(inFormated[x]=='c') {
					pC(i);
				}
				if(inFormated[x]=='m') {
					pM(i);
				}
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// hlavni funkce, menu programu
		
		String usr = System.getProperty("user.name");
		
		// menu programu
		int menu = 0;
		System.out.printf("Vitejte uzivateli %S!\nCo si prejete udelat?\n", usr);
		do{
			System.out.printf("----------------------------\n");
			System.out.printf("1 - Spust vanocni ulohu\n");
			System.out.printf("0 - Ukoncit program\n");
			System.out.printf("----------------------------\n");
			System.out.print("Vase volba: ");
			menu = sc.nextInt();
			System.out.printf("----------------------------\n");
			
			if(menu==1) {village();}
			
		}while(menu>0);
		
		System.out.printf("\nPreji hezky den %S!\n", usr);
	}

}
