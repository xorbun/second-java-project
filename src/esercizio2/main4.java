package esercizio2;

import java.util.Scanner;

public class main4
{
   public static void dividestring()
   {

       while(true)
       {
           System.out.println("inserisci un messaggio, :q per uscire");
           Scanner input=new Scanner(System.in);
           String text=input.nextLine();
           if(text.equals(":q"))
           {
               System.out.println("fine");
               break;
           }
           String [] lettere= text.split("");
           String finalresult=String.join(",",lettere);
           System.out.println(finalresult);
       }




   }

}
