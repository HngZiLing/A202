package currencyconverter;

public class CurrencyConverter 
{
    private String fromCurrency;
    private String toCurrency;
    private double conversionValue;
    private double convertedValue;

    public CurrencyConverter (String fCu, String tCu, double consValue) 
    {
        fromCurrency = fCu;
        toCurrency = tCu;
        conversionValue = consValue;
    }

    public double convertValue () 
    {
        double rateTemp = setConvertedValue();
        return convertedValue = conversionValue * rateTemp;      
    }

    public double setConvertedValue() 
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
    
    public String toString()
    {
        return String.format("%.4f", convertValue ());  
    }
}
