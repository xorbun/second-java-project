package esercizio1;

import java.util.Scanner;

public class main1
{
   public static boolean strincounter(String parola1)
    {
        if(parola1.length()%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean happynewyear(int anno)
    {
        if(anno%4==0)
        {
            return true;
        }
        else if (anno%100==0 && anno%400==0)
        {

            return true;
        }
        else
        {
            return  false;
        }


    }


}

