public class TestPolymorphismArray
{
    public static void main(String [] args)
    {
        StaffUUM[] arrayStaff = new StaffUUM[10];

        arrayStaff[0] = new Malaysian("Lucky", "3006", "SOC", 6000.00, "990730-07-0608", "Citizen");
        arrayStaff[1] = new Malaysian("Kyle", "3011", "SOG", 7000.00, "970824-01-7757", "Citizen");
        arrayStaff[2] = new Malaysian("Louis", "2985", "SQS", 9000.00, "950223-08-5555", "Citizen");
        arrayStaff[3] = new International("Sky", "3512", "SOC", 4000.00, "G0004241", "Thailand");
        arrayStaff[4] = new International("Xiao Wen", "1111", "SOC", 12000.00, "G9911111", "China");

        int numOfMalaysian = 0;
        int numOfInternational = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.println(arrayStaff[i]);
            arrayStaff[i].calculateAllowance(10);
            System.out.println();

            if (arrayStaff[i] instanceof Malaysian)
            {
                numOfMalaysian++;
            }

            if (arrayStaff[i] instanceof International)
            {
                numOfInternational++;
            }
        }
        System.out.println("Number of Malaysian Staff       : " + numOfMalaysian);
        System.out.println("Number of International Staff   : " + numOfInternational);
    }
}
