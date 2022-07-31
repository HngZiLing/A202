import java.util.Scanner;

public class UseOrder
{
    public static void main(String[] args)
    {
        String customerName, orderID, itemName, location;
        int quantity;
        double uniPrice;

        Scanner scan = new Scanner (System.in);

        System.out.println("-------------- Order --------------");

        System.out.print("Enter customer name     : ");
        customerName = scan.next() + scan.nextLine();

        System.out.print("Enter order ID          : ");
        orderID = scan.next() + scan.nextLine();

        System.out.print("Enter item name         : ");
        itemName = scan.next() + scan.nextLine();

        System.out.print("Enter quantity ordered  : ");
        quantity = scan.nextInt();

        System.out.print("Enter uni price         : RM ");
        uniPrice = scan.nextDouble();

        Order order = new Order(customerName, orderID, itemName, quantity, uniPrice);
        order.computePrice(quantity, uniPrice);
        System.out.println();
        order.displayInfo();

        System.out.println("\n---------- Shipped Order ----------");

        System.out.print("Enter customer name     : ");
        customerName = scan.next() + scan.nextLine();

        System.out.print("Enter order ID          : ");
        orderID = scan.next() + scan.nextLine();

        System.out.print("Enter item name         : ");
        itemName = scan.next() + scan.nextLine();

        System.out.print("Enter quantity ordered  : ");
        quantity = scan.nextInt();

        System.out.print("Enter uni price         : RM ");
        uniPrice = scan.nextDouble();

        System.out.print("Enter customer location : ");
        location = scan.next() + scan.nextLine();

        ShippedOrder shippedOrder = new ShippedOrder(customerName, orderID, itemName, quantity, uniPrice, location);
        shippedOrder.computePrice(quantity, uniPrice);
        System.out.println();
        order.displayInfo();
        System.out.println("Customer location       : " + location);
    }
}









