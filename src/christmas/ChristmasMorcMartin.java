package christmas;

import java.util.Scanner;

public class ChristmasMorcMartin {
    
    static Scanner sc = new Scanner(System.in);
    static String[][] shelf = new String[24][81]; //shelves - 11, 22
    static String[][] shelfPart = new String[11][41];

    static int shelfRow;
    static int columnHalf;
    static int startpoint1, startpoint2;

    public static final String ANSI_RED_BRIGHT = "\u001B[31m";
    public static final String ANSI_RED = "\033[41m";
    public static final String ANSI_YELLOW = "\033[43m";
    public static final String ANSI_RESET = "\u001B[0m";

    static final int SHELF_COL_LENGTH = shelf[0].length;
    static final int SHELF_ROW_LENGTH = shelf.length;
    static final int SHELFPART_COL_LENGTH = (shelfPart[0].length) ;
    static final int SHELFPART_ROW_LENGTH = shelfPart.length;

    public static void main(String[] args) {
        makeShelves();
        int choice1;
        do{
            System.out.println("User, please choose from the menu: ");
            System.out.println("1 - Add a gift");
            System.out.println("2 - Remove a gift");
            System.out.println("3 - End");
            choice1 = sc.nextInt();
            userMenu(choice1);
        }while(choice1 != 3);
    }

    public static void generateBox(){
        for(int rows = 0; rows < SHELFPART_ROW_LENGTH; rows++) {
            for (int columns = 0; columns < SHELFPART_COL_LENGTH; columns++) {
                for (int i = 0; i < SHELFPART_COL_LENGTH-1; i++) {
                    if(i == Math.floor((SHELFPART_COL_LENGTH/2))){
                        shelfPart[rows][i] = (ANSI_YELLOW + "#" + ANSI_RESET);
                    }
                }
                for (int j = 0; j < SHELFPART_ROW_LENGTH-1; j++) {
                    if(j == Math.floor((SHELFPART_ROW_LENGTH/2))){
                        shelfPart[j][columns] = (ANSI_YELLOW + "#" + ANSI_RESET);
                    }
                }
                if (rows == 0 || rows == SHELFPART_ROW_LENGTH-1)
                    shelfPart[rows][columns] = (ANSI_RED + "#" + ANSI_RESET);
                else if (columns == 0 || columns == SHELFPART_COL_LENGTH-2)
                    shelfPart[rows][columns] = (ANSI_RED + "#" + ANSI_RESET);
                else
                    shelfPart[rows][columns] = (ANSI_RED_BRIGHT + "*" + ANSI_RESET);
            }
        }
    }

    public static void removeShelf(int choice2, int choice3){
        shelfRow = 12*choice2-1;
        columnHalf = 40*choice3;
        startpoint1 = (shelfRow == 11)?0:12;
        startpoint2 = (columnHalf == 40)?0:41;
        columnHalf = (columnHalf == 40)?columnHalf-1:columnHalf;

        for(int i = startpoint1; i <= shelfRow-1; i++){
            for (int j = startpoint2; j < columnHalf+1; j++) {
                shelf[i][j] = ".";
            }
        }

        displayShelves();

    }

    public static void fillShelf(int choice2, int choice3){
        shelfRow = 12*choice2-1;
        columnHalf = 40*choice3;
        startpoint1 = (shelfRow == 11)?0:12;
        startpoint2 = (columnHalf == 40)?0:41;
        columnHalf = (columnHalf == 40)?columnHalf-1:columnHalf;
        
        generateBox();

        for(int i = startpoint1, k = 0; i <= shelfRow-1; i++, k++){
            for(int j = startpoint2, l = 0; j <= columnHalf; j++, l++){             
                shelf[startpoint1 + k][startpoint2 + l] = shelfPart[k][l];
            }
        }   

        displayShelves();
    }

    public static void userMenu(int choice1){
        int choice2, choice3;
        System.out.println("User, choose a shelf ( 1 - 2 )");
        choice2 = sc.nextInt();
        System.out.println("User, choose a side on the shelf ( left - right ) ( 1 - 2 )");
        choice3 = sc.nextInt();
        if(choice1 == 1) fillShelf(choice2, choice3);
        if(choice1 == 2) removeShelf(choice2, choice3);
    }

    public static void makeShelves(){     
        for(int rows = 0; rows < SHELF_ROW_LENGTH; rows++){
            for(int columns = 0; columns < SHELF_COL_LENGTH; columns++){
                shelf[rows][columns] = ".";
            }
        }

        for(int i = 0; i < SHELF_ROW_LENGTH; i++){
            shelf[i][SHELF_COL_LENGTH/2] = "║";
        }

        for(int rows = 11; rows < SHELF_ROW_LENGTH; rows+=12){
            for(int columns = 0; columns < SHELF_COL_LENGTH; columns++){
                shelf[rows][columns] = "═";
            }
        }
        shelf[11][40] = "╬";
        shelf[23][40] = "╩";
    }

    public static void displayShelves(){
        for(int rows = 0; rows < SHELF_ROW_LENGTH; rows++){
            for(int columns = 0; columns < SHELF_COL_LENGTH; columns++){
                System.out.print(shelf[rows][columns]);
            }
            System.out.println();
        }
    }
}
