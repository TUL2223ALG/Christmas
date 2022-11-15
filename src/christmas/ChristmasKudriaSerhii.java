package christmas;

import java.util.Scanner;

public class ChristmasKudriaSerhii {
public static void main(String[] args) {
final String ANSI_GREEN = "\u001B[32m";
final String ANSI_RESET = "\u001B[0m";
Scanner sc = new Scanner(System.in);
System.out.println("Zadej vysku stromu");
int výška = sc.nextInt();
System.out.println("Zadej sirku stromu");
int šířka = sc.nextInt();
System.out.println("Zadej z ceho bude strom");
char znak = sc.next().charAt(0);
int mezera = šířka * výška;
int i, j, k, m, n = 1;
for (i = 1; i <= výška; i++ )
{
for (j = n; j <= šířka; j++ )
{
for(k = mezera; k >= j; k--)
{
System.out.print(" ");
}
for(m = 1; m <= j; m++)
{
System.out.print(ANSI_GREEN + znak + " " + ANSI_RESET);
}
System.out.println();
}
n = n + 2;
šířka = šířka + 2;
} int t = 4;
if (mezera%2==0){
t = 5;
}
for (int p = 1;p < mezera;p++){
System.out.print(" ");
}
for (int o = 1;o < t ;o++){
System.out.print(znak);
}
System.out.println();
for (int p = 1;p < mezera;p++){
System.out.print(" ");
}
for (int o = 1;o < t ;o++){
System.out.print(znak);
}
System.out.println();
for (int p = 1;p < mezera;p++){
System.out.print(" ");
}
for (int o = 1;o < t ;o++){
System.out.print(znak);
}
System.out.println();
for (int p = 1;p < mezera;p++){
System.out.print(" ");
}
for (int o = 1;o < t ;o++){
System.out.print(znak);
}
}
}
