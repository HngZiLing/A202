

public class CarInfo 
{
    private String custName;
    private String mobileNum;
    private String plateNum;
    private int km;
    private boolean membership;
    private String arrivedTime;
    private String completionTime;
    private String date;
    private double totalCharges;
    
    public CarInfo(String custName, String mobileNum, String plateNum, int km, boolean membership, String arrivedTime, String completionTime, String date)
    {
        this.custName = custName;
        this.mobileNum = mobileNum;
        this.plateNum = plateNum;
        this.km = km;
        this.membership = membership;
        this.arrivedTime = arrivedTime;
        this.completionTime = completionTime;
        this.date = date;
    }
    
    @Override
    public String toString()
    {
        return "Customer Name\t : " + custName +
                "\nMobile Phone Num\t : " + mobileNum +
                "\nPlate Num\t\t : " + plateNum +
                "\nCurrent km\t\t : " + km +
                "\nHas membership\t : " + membership +
                "\nArrivedTime\t\t : " + arrivedTime +
                "\nCompletion Time\t : " + completionTime +
                "\nDate\t\t : " + date;
    }
    
    public double setCharges(double totalCharges)
    {
        return totalCharges;
    }
}