import javax.swing.*;

public class TestPolymorphism
{
    public static void main(String[] args)
    {
        StaffUUM staffUUM, malaysianStaff, internationalStaff;

        staffUUM = new StaffUUM("Miko", "2011", "SQS", 5000.00);
        malaysianStaff = new Malaysian("Sky", "2017" , "SOC", 6600.00, "990608-01-5311", "Citizen" );
        internationalStaff = new International("Star", "2006", "SOL", 5200.00, "G9809199", "China");

        System.out.println("----------------------UUM STAFF----------------------");
        System.out.println(staffUUM.toString());

        System.out.println();

        System.out.println("-----------------MALAYSIAN UUM STAFF-----------------");
        System.out.println(malaysianStaff.toString());
        System.out.println("Allowance is RM " + malaysianStaff.calculateAllowance(7));

        System.out.println();

        System.out.println("\n---------------INTERNATIONAL UUM STAFF----------------");
        System.out.println(internationalStaff.toString());
        System.out.println("Allowance is RM " + internationalStaff.calculateAllowance(9));
    }
}