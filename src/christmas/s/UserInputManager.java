/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s.smutny;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author smutn
 */
public class UserInputManager {

    private Scanner _sc;

    public UserInputManager(InputStream source) {
        _sc = new Scanner(source);
    }

    public int UserNumberInput(String promptMessage, String failMessage, Predicate<Integer> condition) {
        System.out.print(promptMessage);
        int numberUserInput;
        while (true) {
            try {
                numberUserInput = Integer.parseInt(_sc.nextLine());
                if (condition != null && !condition.test((numberUserInput))) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println(failMessage);
                System.out.print(promptMessage);
            }
        }
        return numberUserInput;
    }

    public char UserCharInput(String promptMessage) {
        System.out.print(promptMessage);
        return _sc.next().charAt(0);
    }
}
