import java.util.ArrayList;
import java.util.Scanner;

//public class TestPersonList
//{
//    public static void main(String[] args)
//    {
//        ArrayList <Person> arrayList = new ArrayList <Person> ();
//        Person person = null;
//
//        Scanner scan = new Scanner(System.in);
//
//        boolean done = false;
//
//        while(!done)
//        {
//            System.out.print("Name : ");
//            String name = scan.nextLine();
//            System.out.print("Tel : ");
//            String tel = scan.nextLine();
//            System.out.print("Age : ");
//            int age = scan.nextInt();
//
//            person = new Person(name, tel, age);
//            arrayList.add(person);
//
//            System.out.print("More items for the list? (yes or no) ");
//            String ans = scan.next() + scan.nextLine();
//
//            if (!ans.equalsIgnoreCase("yes"))
//                done = true;
//        }
//
//        System.out.println("\nName list : \n");
//        for(Person element : arrayList)
//            System.out.println(element.toString());
//    }
//}