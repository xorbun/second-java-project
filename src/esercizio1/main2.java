package esercizio1;

public class main2
{
    public static boolean happynewyear(int anno)
    {
        if (anno % 4 == 0)
        {
            return true;
        }
        else if (anno % 100 == 0 && anno % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
