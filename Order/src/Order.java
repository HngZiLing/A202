public class Order
{
    private String customerName;
    private String orderID;
    private String itemName;
    private int quantity;
    private double uniPrice;
    private double totalPrice;

    public Order(String customerName, String orderID, String itemName, int quantity, double uniPrice)
    {
        this.customerName = customerName;
        this.orderID = orderID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.uniPrice = uniPrice;
    }

    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public double computePrice(int quantity, double uniPrice)
    {
        return quantity * uniPrice;
    }

    public void displayInfo()
    {
        System.out.println("Customer name           : " + customerName);
        System.out.println("Order ID                : " + orderID);
        System.out.println("Item name               : " + itemName);
        System.out.println("Quantity ordered        : " + quantity);
        System.out.println("Uni price               : RM " + uniPrice);
        System.out.println("Total price             : RM " + computePrice(quantity, uniPrice));
    }
}