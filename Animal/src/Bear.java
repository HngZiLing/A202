public class Bear extends Animal implements Carnivore, Herbivore
{
    private String sound;
    private String colour;

    public Bear(String sound, String color)
    {
        this.sound = sound;
        colour = color;
    }

    public void displayEatH()
    {
        System.out.println("Bear likes to eat berries, roots, fungi, grasses, ");
    }

    public void displayEatC()
    {
        System.out.println("fish, carrion, small mammals, and insects.");
        System.out.println("-------------------------------------\n");
    }

    public void displayAnimal()
    {
        System.out.println("Name            : " + name);
        System.out.println("Number of Legs  : " + numOfLegs);
        System.out.println("Sound           : " + sound);
        System.out.println("Color           : " + colour + "\n");

        System.out.println(name + " is an Omnivore.");
        System.out.println("Omnivore is similar to both " + typeH + " and " + typeC + ".");
        System.out.println(name + " eats both " + foodH + " and also " + foodC + ".");
    }
}
