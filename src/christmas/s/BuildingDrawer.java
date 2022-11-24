/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas.s.smutny;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author smutn
 */
public class BuildingDrawer {

    private ArrayList<ArrayList<String>> Demands = new ArrayList<>();
    private ArrayList<Integer> Widths = new ArrayList<>();
    private Random rand = new Random();

    public void AddDemand(int size, char wallChar, char roofChar, Colors.Color roofColor, Colors.Color roofBackgroundColor, Colors.Color wallColor, Colors.Color wallBackgroundColor, int localSnowChance) {
        Widths.add(size + 1); // přidání znaků + jedna mezera
        ArrayList<String> newDemand = new ArrayList<>();
        int roofHeight = size / 2 + (size % 2);

        String roofColorCode = Colors.GetColorCode(roofColor);
        String wallColorCode = Colors.GetColorCode(wallColor);
        String roofBackgroundCode = Colors.GetBackgroundCode(roofBackgroundColor);
        String wallBackgroundCode = Colors.GetBackgroundCode(wallBackgroundColor);
        String RESET = Colors.GetColorCode(Colors.Color.RESET);

        String row = "";
        for (int i = 1; i <= roofHeight; i++) {
            int lengthOfSpaces = roofHeight - i;
            row = "";
            for (int j = 1; j <= size; j++) {
                if (rand.nextInt(100) < localSnowChance) {
                    row += RESET + "*" + RESET;
                } else {
                    if (j - lengthOfSpaces > 0 && j + lengthOfSpaces <= size) {
                        row += roofBackgroundCode + roofColorCode + roofChar + RESET;
                    } else {
                        row += " ";
                    }
                }

            }
            newDemand.add(row + " ");
        }

        row = "";
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                if (rand.nextInt(100) < localSnowChance) {
                    row += RESET + "*" + RESET;
                } else {
                    row += wallBackgroundCode + wallColorCode + wallChar + RESET;

                }
            }
            newDemand.add(row + " ");
            row = "";
        }

        Demands.add(newDemand);
    }

    public void Execute(int localSnowChance) throws InterruptedException {
        int maxHeight = GetMaxHouseHeight();
        for (int currentRow = 0; currentRow < maxHeight; currentRow++) {
            String row = "";
            for (int currentDemand = 0; currentDemand < Demands.size(); currentDemand++) {
                if (maxHeight - currentRow < Demands.get(currentDemand).size()) {
                    row += Demands.get(currentDemand).get(currentRow - (maxHeight - Demands.get(currentDemand).size() + 1));
                } else {
                    int widthOfHouse = Widths.get(currentDemand);
                    for (int i = 0; i < widthOfHouse; i++) {
                        if (rand.nextInt(100) < localSnowChance) {
                            row += "*";
                        } else {
                            row += " ";
                        }

                    }

                }
            }
            System.out.println(row);
            Thread.sleep(100);
            
        }
    }

    private int GetMaxHouseHeight() {
        int max = Demands.get(0).size();
        for (int i = 0; i < Demands.size(); i++) {
            int currentHeight = Demands.get(i).size();
            if (currentHeight > max) {
                max = currentHeight;
            }
        }

        return max;
    }
}
