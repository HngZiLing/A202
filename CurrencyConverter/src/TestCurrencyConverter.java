import java.util.Scanner;

public class TestCurrencyConverter
{
    public static void main(String[] args)
    {
        String fromCurrency, toCurrency;
        double conversionValue;

        Scanner scan = new Scanner (System.in);

        System.out.println("CURRENCY CONVERTER");
        System.out.println("-------------------");
        System.out.println("Choose Currency to be Converted");

        System.out.print("From [1-RM  2-Euro  3-Indonesia Rupiah]: ");
        fromCurrency = scan.nextLine();

        System.out.print("To   [1-RM  2-Euro  3-Indonesia Rupiah]: ");
        toCurrency = scan.nextLine();

        System.out.print("Enter conversion amount: ");
        conversionValue = scan.nextDouble();

        CurrencyConverter currencyConverter = new CurrencyConverter(fromCurrency, toCurrency, conversionValue);

        currencyConverter.setConvertedValue();
        currencyConverter.convertValue();
        currencyConverter.displayInfo();
    }
}