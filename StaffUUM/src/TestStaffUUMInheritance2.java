public class TestStaffUUMInheritance2
{
    public static void main(String[] args)
    {
        StaffUUM staffUUM = new StaffUUM("Lucky", "1986", "SOL", 5500.00);

        Malaysian malaysian = new Malaysian("Ahmad", "2022", "SQS", 3800.00,
                                            "000608-07-0741", "Citizen");

        International international = new International("Xiao Qi", "1890", "SOC", 9000.00,
                                                        "G9970688", "China");

        System.out.println("----------------------UUM STAFF----------------------");

        System.out.println("UUM Staff name is " + staffUUM.getName());
        System.out.println("UUM Staff Staff ID is " + staffUUM.getStaffID());
        System.out.println("UUM Staff School is " + staffUUM.getSchool());
        System.out.println("UUM Staff salary is RM " + staffUUM.getSalary());
        System.out.println("UUM Staff Allowance is RM " + staffUUM.calculateAllowance(8));

        System.out.println("\n-----------------MALAYSIAN UUM STAFF-----------------");

        System.out.println("Malaysian UUM Staff name is " + malaysian.getName());
        System.out.println("Malaysian UUM Staff ID is " + malaysian.getStaffID());
        System.out.println("Malaysian UUM Staff School is " + malaysian.getSchool());
        System.out.println("Malaysian UUM Staff Salary is RM " + malaysian.getSalary());
        System.out.println("Malaysian UUM Staff IC number is " + malaysian.getIcNum());
        System.out.println("Malaysian UUM Staff residential status is " + malaysian.getResidentialStatus());
        System.out.println("Malaysian UUM Staff Allowance is RM " + malaysian.calculateAllowance(10));

        System.out.println("\n---------------INTERNATIONAL UUM STAFF----------------");

        System.out.println("International UUM Staff name is " + international.getName());
        System.out.println("International UUM Staff Staff ID is " + international.getStaffID());
        System.out.println("International UUM Staff School is RM " + international.getSchool());
        System.out.println("International UUM Staff salary is RM " + international.getSalary());
        System.out.println("International UUM Staff passport number is " + international.getPassportNum());
        System.out.println("International UUM Staff origin country is " + international.getOriginCountry());
        System.out.println("International UUM Staff Allowance is RM " + international.calculateAllowance(6));
    }
}

