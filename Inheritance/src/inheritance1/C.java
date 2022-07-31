package inheritance1;
public class C extends A
{
    private int number = 20;
    private int average = 5;

    public void print()
    {
        System.out.println(super.getNumber() + "" + average);
    }
}


