package esercizio2;

import java.util.Scanner;

public class main3
{
    public static void numbertotext()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Scrivi un numero da 1 a 3");
        int num=input.nextInt();
        switch (num)
        {
            case 1:
            {
                String num1="uno";
                System.out.println(num1);
                break;
            }
            case 2:
            {
                String num1="due";
                System.out.println(num1);
                break;
            }
            case 3:
            {
                String num1="tre";
                System.out.println(num1);
                break;
            }
        }
    }
}
