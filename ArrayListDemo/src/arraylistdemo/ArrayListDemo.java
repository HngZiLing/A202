package arraylistdemo;

import java.util.ArrayList; 
import java.util.Scanner; 
 
public class ArrayListDemo 
{ 
    public static void main(String[] args)
    { 
        ArrayList <String>toDoList = new ArrayList <String>(); 
        System.out.println("Enter items for the list, when prompted."); 
        boolean done = false; 
        Scanner keyboard = new Scanner(System.in); 

        while (!done) 
        { 
            System.out.print("Type an entry : "); 
            String entry = keyboard.nextLine( ); 
            toDoList.add(entry); 
            System.out.print("More items for the list? "); 
            String ans = keyboard.nextLine( );

            if (!ans.equalsIgnoreCase("yes")) 
            done = true; 
        } 

        /* System.out.println("The list contains:"); 
        int listSize = toDoList.size( ); 
        for (int position = 0; position < listSize; position++) 
        System.out.println(toDoList.get(position)); */
        //Alternate code for displaying the list

        System.out.println("The list contains : "); 
        for (String element : toDoList) 
            System.out.println(element); 

        System.out.print("Enter a String to search for : ");
        String search = keyboard.nextLine();

        if (toDoList.contains(search))
        {
            System.out.println(search + " found!");
            int index = toDoList.indexOf(search);
            toDoList.remove(search);

            System.out.print("Enter a String to replace with : ");
            String entry = keyboard.nextLine();
            toDoList.add(index, entry);
        }

        else
            System.out.println(search + " not found!");

        System.out.println("The list contains : ");
        for (String element : toDoList)
            System.out.println(element);
    } 
}
