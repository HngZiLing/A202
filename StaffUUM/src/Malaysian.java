public class Malaysian extends StaffUUM
{
    private String icNum;
    private String residentialStatus;

    public Malaysian(String name, String staffID, String school, double salary, String icNum, String residentialStatus)
    {
        super(name, staffID, school, salary);
        this.icNum = icNum;
        this.residentialStatus = residentialStatus;
    }

    public void setIcNum(String icNum)
    {
        this.icNum = icNum;
    }

    public void setResidentialStatus(String residentialStatus)
    {
        this.residentialStatus = residentialStatus;
    }

    public String getIcNum()
    {
        return icNum;
    }

    public String getResidentialStatus()
    {
        return residentialStatus;
    }

    public double calculateAllowance(int noOfYear)
    {
        return super.calculateAllowance(noOfYear) + 500.00;
    }

    public String toString()
    {
        return super.toString() +
                "\nIC Number is " + getIcNum() +
                "\nResidential status is " + getResidentialStatus();
    }
}