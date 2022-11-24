package christmas.u;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
class ChME {

    static void starLeft (int X)
    {
        for (int R = 0; R < X; R++) 
        {
            for (int V = 0; V < X; V++) 
            {
                if (R == V || R + V == X - 1 || V == X / 2 || R == X / 2) 
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    static void starRight (int Y)
    {

        for (int R = 0; R < Y; R++) 
        {
            for (int V = 0; V < Y; V++) 
            {
                if (R == V || R + V == Y - 1 || V == Y || R == Y ) 
                {
                    System.out.print("       *       ");
                } 
                else 
                {
                    System.out.print("                 ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte rok: ");
            String text = sc.next();
        System.out.println("Zadejte velikost hvězdy: ");
            int X = sc.nextInt();

        int width = 100;
        int height = 50;
        int Y = 7;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("ComicSans", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("PF "+ text, 9, 17);

        starLeft(X);  
        starRight(Y);
        

        for (int y = 0; y < height; y++) 
        {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) 
            {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "*");

            }
            if (sb.toString().trim().isEmpty()) 
            {
                continue;
            }

            System.out.println(sb);
        }
        starRight(Y);
        starLeft(X);

    }

}

