public abstract class Animal
{
    protected String name;
    protected int numOfLegs;

    public void setName(String name)
    {
       this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setNumOfLegs(int legs)
    {
        numOfLegs = legs;
    }

    public int getNumOfLegs()
    {
        return numOfLegs;
    }

    public abstract void displayAnimal();
}