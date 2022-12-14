
package christmas.s;

import java.util.Scanner;

/**
 * This is my own program for parameterized christmas drawing
 * I am trying to draw multiple christmas apples in matrix structure
 * @author jan.dostal
 */
public class ChristmasDostalJan 
{
    //constants
    private static final Scanner SCANNER = new Scanner (System.in);
    
    private static final String BLACK_FOREGROUND = "\u001B[30m";
    private static final String PURPLE_FOREGROUND = "\u001B[35m";
    private static final String BLUE_FOREGROUND = "\u001B[34m";
    
    private static final int APPLE_CENTER_X = 0;
    private static final int APPLE_CENTER_Y = 0;
    
    private static final String GAP_UNIT = "  ";
    
    //in variables
    private static int appleRadius; //minimalni hodnota 6
    private static int amountOfCols; //minimalni hodnota 1
    private static int amountOfRows; //minimalni hodnota 1
    private static int gapSizeBetweenApples; //minimalni hodnota 1
    private static boolean isAppleWithStem;
    
    //out variables
    private static int amountOfApples;
    
    public static void main(String[] args) 
    {
        //local variables
        boolean endOfProgram = false;
        char choice;
        boolean isInputInvalid;
       
        while (!endOfProgram) 
        {            
            //in
            printIntroductionText();
        
            System.out.print(BLUE_FOREGROUND + "Zadej polomer jablka "
                    + "(vetsi nebo rovno 6): ");
            appleRadius = SCANNER.nextInt();
        
            System.out.print(BLUE_FOREGROUND + "Zadej pocet sloupcu "
                    + "(vetsi nebo rovno 1): ");
            amountOfCols = SCANNER.nextInt();
        
            System.out.print(BLUE_FOREGROUND + "Zadej pocet radku "
                    + "(vetsi nebo rovno 1): ");
            amountOfRows = SCANNER.nextInt();
        
            System.out.print(BLUE_FOREGROUND + "Zadej velikost prostoru mezi jablky "
                    + "(vetsi nebo rovno 1, jednotkou dvě mezery): ");
            gapSizeBetweenApples = SCANNER.nextInt();
        
            System.out.print(BLUE_FOREGROUND 
                    + "Chcete vykreslit jablka se stopkami[a/n]: ");
            isAppleWithStem = SCANNER.next().toUpperCase().charAt(0) == 'A';
        
            isInputInvalid = appleRadius <= 5 || 
                             amountOfCols <= 0 || 
                             amountOfRows <= 0 ||
                             gapSizeBetweenApples <= 0;
                             
            if (isInputInvalid) 
            {
                //out
                System.out.println("");
                System.out.println(PURPLE_FOREGROUND 
                        + "Jedna nebo vice vstupnich hodnot jsou neplatne");
                System.out.println("");
            }
            else 
            {
                //cal
                calculateAmountOfApples();
            
                //out
                printAmountOfApples();
                drawPicture();
            }
        
            System.out.println();
            System.out.print(BLUE_FOREGROUND + "Chcete pokracovat [a/n]: ");
            choice = SCANNER.next().toUpperCase().charAt(0);
        
            endOfProgram = choice != 'A';
        }
    }
    
    private static void printIntroductionText () 
    {
        System.out.println("");
        System.out.println(PURPLE_FOREGROUND + "Vanocni rozkrojena jablka");
        System.out.println("");
        System.out.println(PURPLE_FOREGROUND 
                + "Vitej, muzes si nechat vykreslit vanocni rozkrojena "
                + "jablka v mrizkove strukture.");
        System.out.println("");        
    }
    
    private static void calculateAmountOfApples () 
    {
        amountOfApples = amountOfRows * amountOfCols;
    }
    
    private static void printAmountOfApples () 
    {
        System.out.println("");
        System.out.println(PURPLE_FOREGROUND + "Celkovy pocet jablek: " 
                + BLACK_FOREGROUND + amountOfApples);        
    }
    
    private static void drawPicture () 
    { 
        System.out.println(PURPLE_FOREGROUND + "Vysledny obrazek:");
        System.out.println(); 
        
        int appleStarLength = appleRadius / 3; //pomer 1:3 = hvezda:jablko
        int appleStemLength = appleRadius / 3; //pomer 1:3 = stopka:jablko
        
        for (int currentRow = 1; currentRow <= amountOfRows; currentRow++) 
        {
            if (isAppleWithStem) createAppleStems(appleStemLength);
            
            createApples(appleStarLength);
            createHorizontalGapsBetweenApples();
        }
    }
    
    private static void createAppleStems (int appleStemLength) 
    {
        for (int currentCol = 1; currentCol <= amountOfCols; currentCol++) 
        {
            for (int x = 0; x < appleRadius; x++) 
            {
                System.out.print(GAP_UNIT);
            }
            
            System.out.print("U ");
            
            for (int x = 0; x < appleRadius + gapSizeBetweenApples; x++) 
            {
                System.out.print(GAP_UNIT);
            }
        }      
            
        System.out.println();
        
        for (int y = 0; y < appleStemLength; y++) 
        {
            for (int currentCol = 1; currentCol <= amountOfCols; currentCol++) 
            {
                for (int x = 0; x < appleRadius; x++) 
                {
                    System.out.print(GAP_UNIT);
                }
            
                System.out.print("| ");
                
                for (int x = 0; x < appleRadius + gapSizeBetweenApples; x++) 
                {
                    System.out.print(GAP_UNIT);
                }
            }
            
            System.out.println();
        }
    }
    
    private static void createApples (int appleStarLength) 
    {
        boolean isInUpperLeftStarPosition, isInUpperRightStarPosition,
                isInLowerLeftStarPosition, isInLowerRightStarPosition,
                isInUpperMiddleStarPosition;
          
        int xMin = APPLE_CENTER_X - appleRadius;
        int xMax = APPLE_CENTER_X + appleRadius;
        
        int yMin = APPLE_CENTER_Y - appleRadius;
        int yMax = APPLE_CENTER_Y + appleRadius;
        
        for (int y = yMax; y >= yMin; y--) 
        {
            for (int currentCol = 1; currentCol <= amountOfCols; currentCol++) 
            {
                for (int x = xMin; x <= xMax + gapSizeBetweenApples; x++) 
                {
                    //definicni obory, obory hodnot a předpisy funkci
                    isInUpperLeftStarPosition = 
                            y <= APPLE_CENTER_Y + appleStarLength && //obor h.
                            x >= APPLE_CENTER_X - appleStarLength && //def. obor
                            x < APPLE_CENTER_X &&  //def. obor
                            y > APPLE_CENTER_Y && // obor h.
                            y - APPLE_CENTER_X == -x + APPLE_CENTER_Y; //predpis
                    
                    isInUpperRightStarPosition = 
                            y <= APPLE_CENTER_Y + appleStarLength &&
                            x <= APPLE_CENTER_X + appleStarLength &&
                            x > APPLE_CENTER_X &&
                            y > APPLE_CENTER_Y && 
                            y + APPLE_CENTER_X == x + APPLE_CENTER_Y;
                    
                    isInLowerLeftStarPosition = 
                            y >= APPLE_CENTER_Y - appleStarLength &&
                            x >= APPLE_CENTER_X - appleStarLength &&
                            x < APPLE_CENTER_X &&
                            y < APPLE_CENTER_Y &&
                            y + APPLE_CENTER_X == x + APPLE_CENTER_Y;
                    
                    isInLowerRightStarPosition = 
                            y >= APPLE_CENTER_Y - appleStarLength &&
                            x <= APPLE_CENTER_X + appleStarLength &&
                            x > APPLE_CENTER_X && 
                            y < APPLE_CENTER_Y &&
                            y - APPLE_CENTER_X == -x + APPLE_CENTER_Y;
                    
                    isInUpperMiddleStarPosition = 
                            y <= APPLE_CENTER_Y + appleStarLength + 1 && //obor h.
                            y > APPLE_CENTER_Y && //obor h.
                            x == APPLE_CENTER_X; //def. obor
                    
                    //souradnice na na kruznici
                    if ((int) Math.sqrt(Math.pow((x - APPLE_CENTER_X), 2) 
                            + Math.pow((y - APPLE_CENTER_Y), 2)) == appleRadius)
                    {
                        System.out.print("O ");
                    }
                    
                    //Souradnice na středu kruznice
                    else if (x == APPLE_CENTER_X && y == APPLE_CENTER_Y) 
                    {
                        System.out.print("X ");
                    }
                    
                    //Souradnice v definicim oboru a oboru hodnot hvezdice
                    else if (isInUpperMiddleStarPosition || 
                            isInUpperRightStarPosition ||
                            isInUpperLeftStarPosition || 
                            isInLowerRightStarPosition || 
                            isInLowerLeftStarPosition )
                    {
                        System.out.print("+ ");
                    } 
                    else 
                    {
                        System.out.print(GAP_UNIT);
                    }
                }
            }
            
            System.out.println();
        }
    }
    
    private static void createHorizontalGapsBetweenApples() 
    {
        for (int i = 0; i < gapSizeBetweenApples; i++) 
        {
            System.out.println();
        }
    }
}
