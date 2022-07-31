/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilab2;

/**
 *
 * @author Acer
 */
public class CustomerBill 
{
    private String custType;
    private String acctNum;
    private int numOfConnections;
    private int numOfPremChannels;
    
    public CustomerBill(String custType, String acctNum, int numOfConnections, int numOfPremChannels)
    {
        this.custType = custType;
        this.acctNum = acctNum;
        this.numOfConnections = numOfConnections;
        this.numOfPremChannels = numOfPremChannels;
    }
    
    public double calcResidentialCustomer()
    {
        return 20.0 + (7.5 * numOfPremChannels);
    }
    
    public double calcBusinessCustomer()
    {
        double charge = 0.0;
        
        if (numOfConnections <= 10)
          charge = 75.0 + (20.0 * numOfPremChannels);
        
        if (numOfConnections > 10)
            charge = 75.0 + (5.0 * (numOfConnections - 10)) + (20.0 * numOfPremChannels);
    
        return charge;
    }
    
    public String toString()
    {
        String billInfo = "";
        double charge = 0.0;
        
        if (custType.equals("Residential"))
        {
            charge = calcResidentialCustomer();
            billInfo =  "Account Number : " + acctNum + "\n" + 
                        "Number of premium channels = " + numOfPremChannels + "\n" + 
                        String.format("Amount Due = RM%.2f", charge);
        }
        
        else 
        {
            charge = calcBusinessCustomer();
            billInfo =  "Account Number  : " + acctNum + "\n" + 
                        "Number of service connections = " + numOfConnections + "\n" + 
                        "Number of premium channels = " + numOfPremChannels + "\n" + 
                        String.format("Amount Due = RM%.2f", charge);
        }
        
        return billInfo;
    }
}
