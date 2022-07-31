public class ShippedOrder extends Order
{
    private String location;

    public ShippedOrder(String customerName, String orderID, String itemName, int quantity, double uniPrice, String location)
    {
        super (customerName, orderID, itemName, quantity, uniPrice);
        this.location = location;
    }

    public double computePrice(int quantity, double uniPrice)
    {
        return super.computePrice(quantity, uniPrice) + 4.00;
    }
}
