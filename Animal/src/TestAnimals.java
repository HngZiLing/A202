import java.util.InputMismatchException;
import java.util.Scanner;

public class TestAnimals
{
    public static void main(String[] args)
    {
        String option, name, sound, colour;
        int numOfLegs = 0;

        Animal[] animal = new Animal[3];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < animal.length; i++)
        {
            do {
                System.out.println("1. Bear");
                System.out.println("2. Cat");
                System.out.println("3. Elephant");

                System.out.print("Choose the preferred animal (1-3) : ");
                option = scan.next();

                if (option.equals("1"))
                    System.out.println("You choosed Bear");

                else if (option.equals("2"))
                    System.out.println("You choosed Cat");

                else if (option.equals("3"))
                    System.out.println("You choosed Elephant");

                else
                    System.out.println("Invalid input!!1-3 ONLY\n");

            } while (!option.equals("1") && !option.equals("2") && !option.equals("3"));

            boolean continueLoop;

            if(option.equals("1"))
            {
                System.out.print("Name            : ");
                name = scan.next() + scan.nextLine();

                do {
                    continueLoop = true;
                    try
                    {
                        System.out.print("Number of Legs  : ");
                        numOfLegs = scan.nextInt();
                        continueLoop = false;
                    }
                    catch (InputMismatchException e)
                    {
                        scan.nextLine();
                        System.out.println("You should enter an integer. Please try again");
                    }
                } while (continueLoop);

                System.out.print("Sound           : ");
                sound = scan.next() + scan.nextLine();

                System.out.print("Color           : ");
                colour = scan.next() + scan.nextLine();

                animal[i] = new Bear(sound, colour);
                animal[i].setName(name);
                animal[i].setNumOfLegs(numOfLegs);
            }

            if(option.equals("2"))
            {
                System.out.print("Name            : ");
                name = scan.next() + scan.nextLine();

                do {
                    continueLoop = true;
                    try
                    {
                        System.out.print("Number of Legs  : ");
                        numOfLegs = scan.nextInt();
                        continueLoop = false;
                    }
                    catch (InputMismatchException e)
                    {
                        scan.nextLine();
                        System.out.println("You should enter an integer. Please try again");
                    }
                } while (continueLoop);

                System.out.print("Sound           : ");
                sound = scan.next() + scan.nextLine();

                System.out.print("Color           : ");
                colour = scan.next() + scan.nextLine();

                animal[i] = new Cat(sound, colour);
                animal[i].setName(name);
                animal[i].setNumOfLegs(numOfLegs);
            }

            if(option.equals("3"))
            {
                System.out.print("Name            : ");
                name = scan.next() + scan.nextLine();

                do {
                    continueLoop = true;

                    try
                    {
                        System.out.print("Number of Legs  : ");
                        numOfLegs = scan.nextInt();
                        continueLoop = false;
                    }
                    catch (InputMismatchException e)
                    {
                        scan.nextLine();
                        System.out.println("You should enter an integer. Please try again");
                    }
                } while (continueLoop);

                System.out.print("Sound           : ");
                sound = scan.next() + scan.nextLine();

                System.out.print("Color           : ");
                colour = scan.next() + scan.nextLine();

                animal[i] = new Elephant(sound, colour);
                animal[i].setName(name);
                animal[i].setNumOfLegs(numOfLegs);
            }
            System.out.println();
        }

        System.out.println("\n---------LIST OF ANIMALS---------\n");

        for(int i = 0; i < animal.length; i++)
        {
            if(animal[i] instanceof Bear)
            {
                animal[i].displayAnimal();
                ((Bear) animal[i]).displayEatH();
                ((Bear) animal[i]).displayEatC();
            }

            if(animal[i] instanceof Cat)
            {
                animal[i].displayAnimal();
                ((Cat) animal[i]).displayEatC();
            }

            if(animal[i] instanceof Elephant)
            {
                animal[i].displayAnimal();
                ((Elephant) animal[i]).displayEatH();
            }
        }
    }
}