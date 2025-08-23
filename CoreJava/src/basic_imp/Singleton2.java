package basic_imp;

public class Singleton2 
{
    private static Singleton2 instance;

    static
    {
        try
        {
            instance = new Singleton2();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     
    private Singleton2() {}
     
    public static Singleton2 getInstance()
    {
        return instance;
    }
}