package Christmas;

import java.util.Scanner;

public class ChristmasMrazekJanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte počet sněhových koulí");
        int circleCount = sc.nextInt();
        System.out.println("Zadejte velikost hlavy"); //min 6
        int height = sc.nextInt();
        ChristmasMrazekJanSnowman christmasMrazekJanSnowman = new ChristmasMrazekJanSnowman();
        christmasMrazekJanSnowman.Height = height;
        christmasMrazekJanSnowman.Width = christmasMrazekJanSnowman.Height * 3;
        christmasMrazekJanSnowman.DrawCircle(circleCount);
    }
}