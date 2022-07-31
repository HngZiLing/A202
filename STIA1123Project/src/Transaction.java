public class Transaction implements Currency, Customer
{   
    String name, phone, id, address, fromCurrency, toCurrency;
    double convertedRate, convertValue, conversionValue;
    
    public Transaction(String name, String phone, String id, String address, String fCu, String tCu, double consValue, double convertValue)
    {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.address = address;
        fromCurrency = fCu;
        toCurrency = tCu;
        conversionValue = consValue;
        this.convertValue = convertValue;
    }
    
    public Transaction(String fCu, String tCu, double consValue)
    {
        fromCurrency = fCu;
        toCurrency = tCu;
        conversionValue = consValue;
    }
    
    public void setName(String a){
        name = a;
    }

    public void setPhone(String a){
        phone = a;
    }

    public void setID(String a){
        id = a;
    }

    public void setAddress(String a){
        address = a;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getID(){
        return id;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setFromCurrency(String c){
        fromCurrency = c;
    }
    
    public void setToCurrency(String c){
        toCurrency = c;
    }
    
    public void setConversionValue(double d){
        conversionValue = d;
    }
    
    public double setConvertedRate()
    {
        double rate = 1.0;
        
        if(fromCurrency.equals("USD") && toCurrency.equals("RM")) {
            rate =  4.12;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("Rupiah")) {
           rate =  14255.05;
        } else if (fromCurrency.equals("RM") && toCurrency.equals("USD")) {
            rate = 0.24;
        } else if (fromCurrency.equals("RM") && toCurrency.equals("Rupiah")) {
           rate =  3456.19;
        } else if (fromCurrency.equals("Rupiah") && toCurrency.equals("USD")) {
            rate = 0.000070;
        } else if (fromCurrency.equals("Rupiah") && toCurrency.equals("RM")) {
            rate = 0.00029;
        }
        return rate;
    }
    
    public double setConvertValue()
    {
        double rateTemp = setConvertedRate();
        return convertValue = conversionValue * rateTemp;  
    }
    
    public String getFromCurrency(){
        return fromCurrency;
    }
    
    public String getToCurrency(){
       return toCurrency; 
    }
    
    public double getConversionValue(){
        return conversionValue;
    }
    
    public double getConvertedValue(){
        return convertValue;  
    }
    
    public String toString()
    {
        return "\nName \t: " + getName() +
                "\nPhone \t: " + getPhone() + 
                "\nID \t: " + getID() +
                "\nAddress \t: " + getAddress() + 
                String.format("\nConversion \t: %s %.4f", getFromCurrency(), getConversionValue()) +                 
                String.format("\nConverted \t: %s %.4f \n", getToCurrency(), getConvertedValue());
    }
}