public class CurrencyConverter
{
    private String fromCurrency;
    private String toCurrency;
    private double conversionValue;
    private double convertedValue;

    public CurrencyConverter(String fromCurrency, String toCurrency, double conversionValue)
    {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.conversionValue = conversionValue;
    }

    public double convertValue()
    {
        return convertedValue;
    }

    public void setConvertedValue()
    {
        if (fromCurrency.equals("1") && toCurrency.equals("2"))
            convertedValue = conversionValue * 0.204;

        else if (fromCurrency.equals("1")  && toCurrency.equals("3"))
            convertedValue = conversionValue * 3500.53;

        else if (fromCurrency.equals("2") && toCurrency.equals("1"))
            convertedValue = conversionValue * 4.891;

        else if (fromCurrency.equals("2") && toCurrency.equals("3"))
            convertedValue = conversionValue * 17122.415;

        else if (fromCurrency.equals("3") && toCurrency.equals("1"))
            convertedValue = conversionValue * 0.000286;

        else if (fromCurrency.equals("3") && toCurrency.equals("2"))
            convertedValue = conversionValue * 0.0000584;
    }

    public void displayInfo()
    {
        System.out.println("---------------------");
        System.out.println("Currency Converted");
        System.out.println("---------------------");

        switch (fromCurrency)
        {
            case "1":
                System.out.printf("RM Value: %.2f \n", conversionValue);
                break;
            case "2":
                System.out.printf("Euro Value: %.2f \n", conversionValue);
                break;
            case "3":
                System.out.printf("Rupiah Value: %.2f \n", conversionValue);
                break;
        }

        switch (toCurrency)
        {
            case "1":
                System.out.printf("RM Value: %.2f \n", convertedValue);
                break;
            case "2":
                System.out.printf("Euro Value: %.2f \n", convertedValue);
                break;
            case "3":
                System.out.printf("Rupiah Value: %.2f \n", convertedValue);
                break;
        }
        System.out.println("---------------------");
    }
}
