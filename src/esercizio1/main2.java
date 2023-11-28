package esercizio1;

public class main2
{
    public static boolean happynewyear(int anno)
    {
        if (anno % 400 == 0 || anno % 4 == 0 && anno%100!=0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
