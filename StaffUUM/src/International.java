public class International extends StaffUUM
{
    private String passportNum;
    private String originCountry;

    public International(String name,String staffID, String school, double salary, String passportNum, String originCountry)
    {
        super (name,staffID, school, salary);
        this.passportNum = passportNum;
        this.originCountry = originCountry;
    }

    public void setPassportNum(String passportNum)
    {
        this.passportNum = passportNum;
    }

    public void setOriginCountry(String originCountry)
    {
        this.originCountry = originCountry;
    }

    public String getPassportNum()
    {
        return passportNum;
    }

    public String getOriginCountry()
    {
        return originCountry;
    }

    public double calculateAllowance(int noOfYear)
    {
        return calculateAllowance(noOfYear) + 900.00;
    }

    public String toString()
    {
        return super.toString() +
                "\nPassport number is " + getPassportNum() +
                "\nOrigin country is " + getOriginCountry();
    }
}