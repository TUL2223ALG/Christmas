/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s.smutny;

/**
 *
 * @author smutn
 */
public class Colors {

    public enum Color {
        BLACK,
        RED,
        GREEN,
        YELLOW,
        BLUE,
        PURPLE,
        CYAN,
        WHITE,
        RESET
    }

    public static String GetColorCode(Color color) {
        switch (color) {
            case BLACK:
                return "\u001B[30m";
            case RED:
                return "\u001B[31m";
            case GREEN:
                return "\u001B[32m";
            case YELLOW:
                return "\u001B[33m";
            case BLUE:
                return "\u001B[34m";
            case PURPLE:
                return "\u001B[35m";
            case CYAN:
                return "\u001B[36m";
            case WHITE:
                return "\u001B[37m";
            case RESET:
                return "\u001B[0m";
            default:
                return "\u001B[30m";
        }
    }

    public static String GetBackgroundCode(Color color) {
        switch (color) {
            case BLACK:
                return "\u001B[40m";
            case RED:
                return "\u001B[41m";
            case GREEN:
                return "\u001B[42m";
            case YELLOW:
                return "\u001B[43m";
            case BLUE:
                return "\u001B[44m";
            case PURPLE:
                return "\u001B[45m";
            case CYAN:
                return "\u001B[46m";
            case WHITE:
                return "\u001B[47m";
            case RESET:
                return "\u001B[0m";
            default:
                return "\u001B[40m";
        }
    }
}
