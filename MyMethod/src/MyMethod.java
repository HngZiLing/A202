import java.util.Scanner;

public class MyMethod
{
    static String name;
    static int year, age, characters;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Please enter your name: ");
            name = scan.nextLine();

            if ((name.length() < 5))
                System.out.println("The length of the name cannot less than 5 characters, please enter again!");

        } while (name.length() < 5);

        do {
            System.out.print("Please enter your year of birth: ");
            year = scan.nextInt();

            if (year > 2021)
                System.out.println("The year of birth cannot greater than 2021, please enter again!");

        } while (year > 2021);

        characters = calculateCharacters(name);
        System.out.printf("Total character:%d\n", characters);

        age = calculateAge(year);
        System.out.printf("Age: %d", age);

    }

//    public static int calculateCharacters(String name)
//    {
//        char[] letter = name.toCharArray();
//
//        for (int i= 0; i < letter.length; i++)
//        {
//            if (letter[i] != ' ')
//                characters++;
//        }
//        return characters;
//    }

    public static int calculateCharacters(String name)
    {
        for (int i = 0; i < name.length(); i++)
        {
            char letter = name.charAt(i);

            if (letter != ' ')
                characters++;
        }
        return characters;
    }


    public static int calculateAge(int year)
    {
        age = 2021 - year;
        return age;
    }
}
