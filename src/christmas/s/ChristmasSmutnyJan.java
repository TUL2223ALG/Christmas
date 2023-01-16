/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package christmas.s.smutny;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import christmas.s.smutny.Colors.Color;

/**
 *
 * @author smutn
 */
public class ChristmasSmutnyJan {

    // Main driver method
    public static void main(String[] args) throws Exception {
        UserInputManager userInputManager = new UserInputManager(System.in);
        TextCreator txtCreator = new TextCreator();
        txtCreator.WriteText("vesele vanoce");
        boolean userWantsContinue = true;
        do {
            BuildingDrawer bd = new BuildingDrawer();
            int numberOfHouses = userInputManager.UserNumberInput("Zadej počet domků: ", "Zadej kladné číslo: ", x -> x > 0);
            int snowChance = userInputManager.UserNumberInput("Zadej procentuální výskyt sněhu: ", "Zadej číslo mezi 0 - 100", x -> x >= 0 && x <= 100);
            Color[] colorsValues = Colors.Color.values();
            String colorsListString = "Možné barvy:\n";
            for (int j = 0; j < colorsValues.length - 1; j++) {
                colorsListString += j + " : " + colorsValues[j] + "\n";
            }
            for (int i = 0; i < numberOfHouses; i++) {
                int sizeOfHouse = userInputManager.UserNumberInput("Zadej velikost domu: ", "Zadej kladné číslo: ", x -> x > 0);
                char roofChar = userInputManager.UserCharInput("Zadej znak střechy: ");
                char wallChar = userInputManager.UserCharInput("Zadej znak stěny: ");

                Colors.Color roofColor = colorsValues[userInputManager.UserNumberInput("Zadej barvu znaků střechy: \n" + colorsListString, "Zadej kladné číslo v rozmezí 0-" + (colorsValues.length - 2) + ": ", x -> x < colorsValues.length - 1 && x >= 0)];
                Colors.Color roofBackgroundColor = colorsValues[userInputManager.UserNumberInput("Zadej barvu pozadí střechy: \n" + colorsListString, "Zadej kladné číslo v rozmezí 0-" + (colorsValues.length - 2) + ": ", x -> x < colorsValues.length - 1 && x >= 0)];
                Colors.Color wallColor = colorsValues[userInputManager.UserNumberInput("Zadej barvu znaků stěny: \n" + colorsListString, "Zadej kladné číslo v rozmezí 0-" + (colorsValues.length - 2) + ": ", x -> x < colorsValues.length - 1 && x >= 0)];
                Colors.Color wallBackgroundColor = colorsValues[userInputManager.UserNumberInput("Zadej barvu pozadí stěny: \n" + colorsListString, "Zadej kladné číslo v rozmezí 0-" + (colorsValues.length - 2) + ": ", x -> x < colorsValues.length - 1 && x >= 0)];

                bd.AddDemand(sizeOfHouse, wallChar, roofChar, roofColor, roofBackgroundColor, wallColor, wallBackgroundColor, snowChance);
                System.out.println("-------------------------------------------------------------------");

            }
            bd.Execute(snowChance);
            
            int userChoice = userInputManager.UserNumberInput("Chceš zadat znovu? 1 = ano,2 = ne: ", "Zadej 1 pro „Ano“ nebo 2 pro „Ne“: ", x -> x == 1 || x == 2);
            if(userChoice == 2) {
                userWantsContinue = false;
            }

        } while (userWantsContinue);

        URL joke = new URL("https://v2.jokeapi.dev/joke/christmas");
        URLConnection jokeConnection = joke.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(jokeConnection.getInputStream()));
        String inputLine;
        String delivery = "";
        String setup = "";
        int iterator = 0;
        //4 5
        while ((inputLine = in.readLine()) != null) {
            if (iterator == 4) {
                setup = inputLine.split(":")[1].substring(0, inputLine.split(":")[1].length() - 1);
            } else if (iterator == 5) {
                delivery = inputLine.split(":")[1].substring(0, inputLine.split(":")[1].length() - 1);
            }
            iterator++;
        }
        in.close();

        System.out.println();
        System.out.println("Vtípek k pokukání na závěr: ");
        System.out.println(setup);
        System.out.println(delivery);
    }

}
