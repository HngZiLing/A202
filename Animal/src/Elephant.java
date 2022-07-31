public class Elephant extends Animal implements Herbivore
{
    private String sound;
    private String colour;

    public Elephant(String sound, String color)
    {
        this.sound = sound;
        colour = color;
    }

    public void displayEatH()
    {
        System.out.println("Elephant likes to eat grasses, small plants,");
        System.out.println("bushes, fruit, twigs, tree bark, and roots.");
        System.out.println("-------------------------------------\n");
    }

    public void displayAnimal()
    {
        System.out.println("Name            : " + getName());
        System.out.println("Number of Legs  : " + getNumOfLegs());
        System.out.println("Sound           : " + sound);
        System.out.println("Color           : " + colour + "\n");

        System.out.println(name + " is a " + typeH + " and eats " + foodH + ".");
    }
}
