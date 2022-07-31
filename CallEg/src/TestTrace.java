public class TestTrace
{
    public static void main ( String[] args )
    {
        CallEg eg = new CallEg();

        try
        {
            eg.methodA();
        }

        catch ( Exception oops )
        {
            System.out.println("I'm here");
            oops.printStackTrace();
        }
    }
}
