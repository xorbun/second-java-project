package esercizio2;

import java.util.Scanner;

public class main5
{
    public static void countdown()
    {
        System.out.println("scrivi un numero per il conto alla rovescia");
        Scanner input=new Scanner(System.in);
        int counter=input.nextInt();
        for(int i=counter;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}
