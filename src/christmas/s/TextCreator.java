/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s.smutny;

import java.util.ArrayList;

/**
 *
 * @author smutn
 */


public class TextCreator {
    
    public void WriteText(String text) {

        String finalText = "";
        ArrayList<ArrayList<String>> Letters = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            //char currentChar = fixChar(text[i]); - odstranění diakritiky, invalidních znaků, atd.
            char currentChar = Character.toUpperCase(text.charAt(i));

            Letters.add(Characters.GetCharArray(currentChar));
        }
        int currentLetterIndex = 0;
        int currentRow = 0;
        while (currentRow < Characters.ROWS_COUNT) {
            finalText += RightPad(Letters.get(currentLetterIndex).get(currentRow), LetterMaxSize(Letters.get(currentLetterIndex)));
            currentLetterIndex++;
            currentLetterIndex = currentLetterIndex % Letters.size();

            if (currentLetterIndex == 0) {
                currentRow++;
                finalText += "\n";
            }
        }
        
        System.out.println(finalText);
    }
    
    private String RightPad(String text, int length) {
        String finalText = "";
        
        for(int i = 0; i < length; i++) {
            if(i >= text.length()) {
                finalText += " ";
            }
            else {
                finalText += text.charAt(i);
            }
        }
        
        return finalText;
    }
    
    private int LetterMaxSize(ArrayList<String> letter) {
        int maxSize = letter.get(0).length();
        for(int i = 1; i < letter.size(); i++) {
            int currentSize = letter.get(i).length();
            if(currentSize > maxSize) {
                maxSize = currentSize;
            }
        }
        
        return maxSize;
    }
}
