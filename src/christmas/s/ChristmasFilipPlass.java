/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package christmas.s;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class ChristmasFilipPlass {

    public static char[][] displayArray = new char[32][128];
    public static int actualLine = 0;
    public static char[] pastColumn = new char[128];
    public static boolean stopSnow = false;

    public static void main(String[] args) throws IOException, InterruptedException {
        for (int j = 0; j < 128; j++) {
            pastColumn[j] = '~';
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Kolik cm letos nasnezilo?");
        int cm = sc.nextInt();
        System.out.println("Rychlost generovani snehu - prestavky | doporucena hodnota od 50 do 200");
        int rychlost = sc.nextInt();
        letItSnow(cm, rychlost);

        int end = sc.nextInt();

    }

    public static void displayLayers() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

            }
        }
    }

    public static void displayAnimation() {
        String str = "";
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 128; j++) {
                if (displayArray[i][j] == '*') {
                    str += "*";

                } else {
                    str += " ";

                }
            }
            str += "\n";

        }
        System.out.print(str);
    }

    public static void letItSnow(int cm, int rychlost) throws InterruptedException { //128x32 cca
        while (actualLine != cm) {
            char[] newLine = randomSnowLine(cm);
            for (int j = 0; j < displayArray.length; j++) {
                if (j != 31 && j > actualLine) {
                    displayArray[32 - j - 1] = displayArray[32 - j - 2];
                    int flakesCount = 0;
                    for (int k = 0; k < displayArray[0].length; k++) {

                        if (displayArray[32 - actualLine - 1][k] == '*' || displayArray[32 - actualLine - 2][k] == '*') {
                            displayArray[32 - actualLine - 1][k] = '*';
                            flakesCount++;
                        }
                    }
                    if (flakesCount == 128) {
                        actualLine++;
                    }
                }
            }
            if (!stopSnow) {
                displayArray[0] = newLine;
            } else {
                for (int i = 0; i < 128; i++) {
                    displayArray[0][i] = '~';
                }
            }

            displayAnimation();
            Thread.sleep(rychlost);
            if (actualLine != cm) {
                clearConsole();
            }
        }
    }

    public static char[] randomSnowLine(int cm) {

        char[] lineOfFlakes = new char[128];
        for (int j = 0; j < 128; j++) {
            lineOfFlakes[j] = '~';
        }
        int[] indexArray = new int[128];
        for (int j = 0; j < 128; j++) {
            indexArray[j] = -666;
        }
        int emptySpaces = 0;
        for (int i = 0; i < 128; i++) {
            if (pastColumn[i] == '~') {
                indexArray[i] = i;
                emptySpaces++;
            } else {
                indexArray[i] = -666;
            }
        }
        System.out.print(emptySpaces);
        System.out.print(" | ");
        System.out.print(actualLine);
        System.out.print(" | ");
        if (emptySpaces == 0 && actualLine == cm - 1) {
            stopSnow = true;
        }
        System.out.print(stopSnow);
        System.out.print(" | ");
        if (emptySpaces == 0 && !stopSnow) {
            for (int j = 0; j < 128; j++) {
                pastColumn[j] = '~';
                indexArray[j] = j;
            }
        }
        int flakes = 0;
        if (emptySpaces > 10) flakes = 10;
        else flakes = emptySpaces;
        int maxFlakes = getRandomNumber(0, flakes+1);
        boolean choosed = false;
        int randomIndex = -1;
        System.out.println(maxFlakes);
        for (int j = 0; j < maxFlakes; j++) {
            while (choosed == false) {
                randomIndex = getRandomNumber(0, 128);
                for (int i = 0; i < 128; i++) {
                    if (indexArray[randomIndex] == randomIndex) {
                        choosed = true;
                        indexArray[randomIndex] = -666;
                    }
                }

            }
            choosed = false;
            pastColumn[randomIndex] = '*';
            lineOfFlakes[randomIndex] = '*';

//            lineOfFlakes[randomIndex] = '*';
        }
        return lineOfFlakes;
    }

    public final static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
