import java.util.Scanner;

/**
 *
 * @author miroslav kramar
 */
public class VanocniUlohaKramar {

    public static void main(String[] args) {
        //variables: parameters
        int diameter;
        int radius;
        int numOfCircles;
        int maxEffectiveNumOfCircles = 0;

        //variables: degs and rads
        int deg = 0;
        double rad;

        //variables: canvas properties
        int xCoord, yCoord;
        int verticalOffset = 0, horizontalOffset = 0, handsOffset = 0;
        int currentDiameter;
        int currentRadius;
        int canvasVerticalSize = 0, canvasHorizontalSize;
        int tempVerticalSize;

        //help variables
        boolean firstCharFound = false, secondCharFound = false, drawHands = true, drawCarrot = true, beforeLastCircleFound = false;
        int tempDiameter;
        int beforeLastCircleDiameter = 0;

        //scanner
        Scanner sc = new Scanner(System.in);

        //diameter value input (most important value)
        System.out.println("+-------------------+");
        System.out.println("| SNOWMAN GENERATOR |");
        System.out.println("+-------------------+\n");
        System.out.println("Zadej prosim prumer nejspodnejsi koule snehulaka: ");
        diameter = sc.nextInt();
        while(diameter < 1){
            System.out.println("To nemuzes! Zkus to znovu:");
            diameter = sc.nextInt();
        }
        while(diameter > 500){
            System.out.println("To nebude vypadat dobre, zkus neco mensiho:");
            diameter = sc.nextInt();
        }

        //diameter value assignment
        radius = diameter / 2;
        currentDiameter = diameter;
        canvasHorizontalSize = diameter;
        tempVerticalSize = diameter;
        currentRadius = radius;
        tempDiameter = diameter;

        //calculating the before last circle radius and effective number of circles
        while (tempDiameter > 0) {
            tempDiameter = (tempDiameter / 5) * 4;
            maxEffectiveNumOfCircles += 1;
            if ((((tempDiameter / 5) * 4) / 5) * 4 == 0 && !beforeLastCircleFound) {
                beforeLastCircleDiameter = tempDiameter;
                beforeLastCircleFound = true;
            }
        }

        //numOfCircles value input
        System.out.format("Zadej prosim, kolik chces, aby mel snehulak kouli (VAROVANI: maximalni smysluplny pocet kouli pro prumer %d je %d):\n", diameter, maxEffectiveNumOfCircles);
        numOfCircles = sc.nextInt();
        while(diameter < 1){
            System.out.println("To nemuzes! Zkus to znovu:");
            diameter = sc.nextInt();
        }

        //check if number of circles is greater than maximal efective number of circles
        if (numOfCircles > maxEffectiveNumOfCircles) {
            numOfCircles = maxEffectiveNumOfCircles; //set numOfCircles to maxEffectiveNumOfCircles because it is pointless to try to draw more circles that it's possible
        }

        //canvas size calculation
        for (int i = 0; i < numOfCircles; i++) {
            canvasVerticalSize += tempVerticalSize;
            tempVerticalSize = (tempVerticalSize / 5) * 4;
        }

        //vertical offset calculation
        if (numOfCircles > 1) {
            verticalOffset = canvasVerticalSize - diameter;
        }

        //adjusting canvas size
        if (diameter % 2 == 0) {
            canvasHorizontalSize += 1;
            canvasVerticalSize += 1;
            if ((canvasHorizontalSize - (beforeLastCircleDiameter + 1)) / 2 < 4) {
                handsOffset = 4 - (canvasHorizontalSize - beforeLastCircleDiameter) / 2;
            }
        } else {
            if ((canvasHorizontalSize - beforeLastCircleDiameter) / 2 < 4) {
                handsOffset = 4 - (canvasHorizontalSize - beforeLastCircleDiameter) / 2;
            }
        }

        //variables: canvas declaration and definition
        char[][] canvas;
        canvas = new char[canvasVerticalSize][canvasHorizontalSize + (handsOffset * 2)];

        //initialize canvas
        for (char[] field1 : canvas) {
            for (int j = 0; j < field1.length; j++) {
                field1[j] = '.'; //fill canvas with spaces
            }
        }

        //image generation
        for (int i = 0; i < numOfCircles; i++) {
            for (int j = 0; j < 360; j++) {
                rad = Math.toRadians(deg); //convert degrees to radians
                xCoord = (int) Math.round(Math.sin(rad) * currentRadius) + currentRadius + verticalOffset; //set new x axis position of character that makes the circle
                yCoord = (int) Math.round(Math.cos(rad) * currentRadius) + currentRadius + horizontalOffset + handsOffset; //set new y axis position of character that makes the circle
                if (canvas[xCoord][yCoord] == '.') {
                    canvas[xCoord][yCoord] = '@'; //set array cell value to '@'
                }

                //drawing hands and buttons
                if (drawHands && i == numOfCircles - 2 && j == 359) {
                    drawHands = false;
                    for (int k = 0; k < canvasHorizontalSize + (handsOffset * 2); k++) {
                        if (canvas[xCoord][k] == '@' && firstCharFound == false) {
                            firstCharFound = true;
                        } else if (canvas[xCoord][k] == '@' && firstCharFound == true && secondCharFound == false) {
                            secondCharFound = true;
                            continue;
                        }

                        if (firstCharFound == false && secondCharFound == false) {
                            canvas[xCoord][k] = '=';
                        } else if (firstCharFound == true && secondCharFound == true) {
                            canvas[xCoord][k] = '=';
                        }
                    }
                }
                //drawing carrot (nose)
                if (drawCarrot && i == numOfCircles - 1 && j == 359) {
                    drawCarrot = false;
                    for (int k = 0; k < canvas[0].length && k < 4; k++) {
                        canvas[xCoord][(canvas[0].length / 2) + k] = '>';
                    }

                    //draw buttons
                    System.out.format("currentDiameter: %d\n", currentDiameter);
                    for (int k = 0; k < canvasVerticalSize - currentDiameter - 1; k++) {
                        if (canvas[currentDiameter+1 + k][(canvas[0].length / 2)] == '.' && k % 2 == 0) {
                            canvas[currentDiameter + 1 + k][(canvas[0].length / 2)] = '*';
                        }
                    }
                }
                deg += 1; //increase the degrees value by 1

                //reset degrees value if it's greater than 359
                if (deg > 359) {
                    deg = 0;
                }
            }
            currentDiameter = (currentDiameter / 5) * 4; //decrease current value of radius to 80% of original value
            currentRadius = currentDiameter / 2;
            verticalOffset -= currentRadius * 2;
            horizontalOffset = (canvasHorizontalSize - currentDiameter) / 2;
        }

        //output
        for (char[] canvas1 : canvas) {
            for (int j = 0; j < canvas1.length; j++) {
                System.out.format("%c ", canvas1[j]);
            }
            System.out.println("");
        }
    }
}
