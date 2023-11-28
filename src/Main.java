import esercizio1.main1;
import esercizio1.main2;
import esercizio2.main3;
import esercizio2.main4;
import esercizio2.main5;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Scrivi una parola");
        String parola=input.nextLine();
        boolean pariodispari=main1.strincounter(parola);
        System.out.print(main1.strincounter(parola));
        System.out.println("Inserisci un anno");
        int anno=input.nextInt();
        boolean annobisestile=main2.happynewyear(anno);
        System.out.print(annobisestile);
        main3.numbertotext();
        main4.dividestring();
        main5.countdown();
        input.close();
    }
}