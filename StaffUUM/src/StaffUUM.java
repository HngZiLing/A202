public class StaffUUM
{
    private String name, staffID, school;
    private double salary;

    public StaffUUM(String name, String staffID, String school, double salary)
    {
        this.name = name;
        this.staffID = staffID;
        this.school = school;
        this.salary = salary;
    }

    public double calculateAllowance(int noOfYear)
    {
        return noOfYear * 200.00 ;
    }

    public void setName(String staffName)
    {
        name = staffName;
    }

    public void setStaffID(String ID)
    {
        staffID = ID;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public void setSalary(double staffSalary)
    {
        salary = staffSalary;
    }

    public String getName()
    {
        return name;
    }

    public String getStaffID()
    {
        return staffID;
    }

    public String getSchool()
    {
        return school;
    }

    public double getSalary()
    {
        return salary;
    }

    public String toString()
    {
        return "Name is " + getName() +
                "\nStaff ID is " + getStaffID() +
                "\nSchool is " + getSchool() +
                "\nSalary is RM " + getSalary();
    }
}