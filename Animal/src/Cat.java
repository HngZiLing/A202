public class Cat extends Animal implements Carnivore
{
    private String sound;
    private String colour;

    public Cat(String sound, String color)
    {
        this.sound = sound;
        colour = color;
    }

    public void displayEatC()
    {
        System.out.println("Cat likes eat birds, mice, fish etc.");
        System.out.println("-------------------------------------\n");
    }

    public void displayAnimal()
    {
        System.out.println("Name            : " + name);
        System.out.println("Number of Legs  : " + numOfLegs);
        System.out.println("Sound           : " + sound);
        System.out.println("Color           : " + colour + "\n");

        System.out.println(name + " is a " + typeC + " and " + foodC + ".");
    }
}