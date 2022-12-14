package christmas.u;

import java.util.Random;
import java.util.Scanner;

public class ChristmasGermanSemin {
    private static final char SNOWFLAKE_CHAR = '*';
    private static float snowflakeChance = 0.1f;

    private static final Random R = new Random();
    private static final Scanner S = new Scanner(System.in);

    private static boolean prevSnowflake = false;

    private static int width;
    private static int height;

    private static int boxX;
    private static int boxWidth;
    private static int boxY;
    private static int boxHeight;

    private static int curX = 1;
    private static int curY = 1;

    private static String zprava;

    public static void main(String[] args) throws InterruptedException {
        input();
        render();
    }

    private static void input() {
        System.out.print("Zadej vysku: ");
        height = S.nextInt();
        System.out.print("Zadej sirku: ");
        width = S.nextInt(); S.nextLine();
        System.out.print("Zadej zpravu: ");
        zprava = S.nextLine();
        System.out.print("Zadej intenzitu snehu (1-10): ");
        snowflakeChance = 0.05f * S.nextInt();

        boxWidth = 6 + zprava.length();
        boxHeight = (int) (9 + zprava.lines().count());
        boxX = (width / 2) - (boxWidth / 2);
        boxY = (height / 2) - (boxHeight / 2);
    }

    private static void render() {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if (curY == 1) {
                    if (curX == 1) printb('.');
                    else if (curX == width) printbln('.');
                    else printb('-');
                } else if (curY == height) {
                    if (curX == 1) printb('\'');
                    else if (curX == width) printbln('\'');
                    else printb('-');
                } else if (curY > 1 && curY < height) {
                    if (curX == 1) printb('|');
                    else if (curX == width) printbln('|');
                    else {
                        if (curX == boxX + boxWidth / 2 - 2 && curY == boxY - 2) printb("__  __");
                        else if (curX == boxX + boxWidth / 2 - 3 && curY == boxY - 1) printb("/  \\/  \\");
                        else if (curY == boxY && curX >= boxX && curX <= boxX + boxWidth) {
                            if (curX == boxX || curX == boxX + boxWidth) printb('.');
                            else if (curX == boxX + boxWidth / 2 - 3) printb("\\__/\\__/");
                            else printb('-');
                        } else if (curY == boxY + boxHeight) {
                            if (curX == boxX || curX == boxX + boxWidth) printb('\'');
                            else if (curX >= boxX && curX <= boxX + boxWidth) printb('-');
                            else print(' ');
                        } else if (curY > boxY && curY < boxY + boxHeight) {
                            if (curX == boxX || curX == boxX + boxWidth) printb('|');
                            else if (curX > boxX + 3 && curX < boxX + boxWidth - 5 && curY == boxY + 5)
                                printb(zprava);
                            else if (curX == boxX + boxWidth / 2 && curX != boxY + 5) printb("||");
                            else if ((curX > boxX && curX <= boxX + 3 || curX > boxX + boxWidth - 5 && curX < boxX + boxWidth) && curY == boxY + 5)
                                printb('=');
                            else if (curX >= boxX && curX <= boxX + boxWidth) printb(' ');
                            else print(' ');
                        } else {
                            print(' ');
                        }
                    }
                }
            }
        }

        System.out.println();
        curX = 1;
        curY = 1;
    }

    private static void printb(char c) {
        System.out.print(c);
        curX++;
    }

    private static void print(char c) {
        if (R.nextFloat() < snowflakeChance && !prevSnowflake) {
            c = SNOWFLAKE_CHAR;
            prevSnowflake = true;
        } else prevSnowflake = false;
        printb(c);
    }

    private static void printb(String s) {
        System.out.print(s);
        curX += s.length();
    }

    private static void printbln(char c) {
        printb(c);
        System.out.print('\n');
        curX = 1;
        curY++;
    }
}