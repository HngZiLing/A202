import java.util.Scanner;

public class TestMyFCStaff
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        MyFCStaff[] staffList = new MyFCStaff[5];

        for (int i = 0; i < staffList.length; i++)
        {
            System.out.print("Enter staff " + (i+1) + " name        : ");
            String name = scan.nextLine();

            System.out.print("Enter staff " + (i+1) + " ID          : ");
            String staffID = scan.nextLine();

            System.out.print("Enter total hours work    : ");
            int totalHoursWork = scan.nextInt();

            System.out.print("Enter total sale          : ");
            double totalSale = scan.nextDouble();

            scan.nextLine();
            System.out.println();

            staffList[i] = new MyFCStaff(name, staffID, totalHoursWork, totalSale);
        }

        for (int i = 0; i < staffList.length; i++)
        {
            System.out.println("-----------Staff " + (i+1) + "-----------");
            System.out.println(staffList[i].toString());
            System.out.println();
        }
//
//        MyFCStaff myFCStaff = new MyFCStaff(name, staffID, totalHoursWork, totalSale);
//        myFCStaff.displaySalary();
//        System.out.println(myFCStaff.toString());
    }
}




