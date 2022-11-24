package christmas.u;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class ChristmasMusilVitezslav {
    public static void main(String[] args) {
        String line = "";
        String finalLine = "";
        String forestLine = "";
        int forestLength = 0;
        int snowType;
        String finalForestLine = "";
        Scanner ligma = new Scanner(System.in);
        System.out.println("Zadejte prosím intenzitu sněžení (v procentech)");
        int snowIntensity = ligma.nextInt();
        System.out.println("Zadejte prosím hustotu lesa (v procentech)");
        int forestDensity = ligma.nextInt();
        System.out.println("Zadejte prosím rozlohu lesa (x,y)");
        int length = ligma.nextInt();
        int height = ligma.nextInt();
        for (int q = 0; q < height; q++) {
            forestLine = "";
            for (int f = 0; f < length; f++) {
                int treeChance = (int)(Math.random()*100);
                if (treeChance <= forestDensity) {
                    forestLine = forestLine + "`|´";
                    forestLength = (q==0)? forestLength+3:forestLength;
                } else {
                    forestLine = forestLine + "__";
                    forestLength = (q==0)? forestLength+2:forestLength;
                }
            } 
            finalForestLine = finalForestLine + forestLine + "\n";
        }
            
        while (0<1) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch(InterruptedException ex) {
                Thread.interrupted();
            }
            for (int i = 0; i < 20; i++){
                for (int k = 0; k < (forestLength); k++) {
                    int snowChance = (int) (Math.random()*100);
                    if (snowChance <= snowIntensity) {
                        snowType =(int) (Math.random()*100);
                        if (snowType < 50) {
                            line = line + "*";
                        } else {
                            line = line + "¤";
                        }
                    } else {
                        line = line + " ";
                    }
                }
                 finalLine = finalLine + line + "\n";
                 line = "";
        }
            System.out.print(finalLine + finalForestLine);
            finalLine = "";
    }
    
}
}
