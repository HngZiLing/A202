public interface Currency 
{
    public void setFromCurrency(String c);
    public void setToCurrency(String c);
    public void setConversionValue(double d);
    public abstract double setConvertedRate();
    public abstract double setConvertValue();
    
    public String getFromCurrency();
    public String getToCurrency();
    public double getConversionValue();
    public double getConvertedValue();
    
    @Override
    public abstract String toString();
}