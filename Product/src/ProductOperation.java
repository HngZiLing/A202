/*
Name            : H'NG ZI LING
Matric Number   : 281895
Course Code     : STIA 2024
Course Name     : Data Structure and Algorithm Analysis
Title           : Assignment 1 - Product
 */

public class ProductOperation
{
    private Node head;

    public ProductOperation()
    {
        Product [] product;
    }

    public void addProduct(Product product)
    {
        Node newNode = new Node(product);

        if (head == null)
            head = newNode;

        else
        {
            Node current = head;
            while(current.getLink() != null)
                current = current.getLink();

            current.setLink(newNode);
            current.getProduct().setTotal(calculateTotalPrice(product));
        }
    }

    public double calculateTotalPrice(Product product)
    {
        return product.getPrice() * product.getQuantity();
    }

    public void searchProduct(String target)
    {
        Node current;
        current = head;

        if(current.getProduct().getName().equals(target))
            System.out.println("The price of " + target + " = " + current.getProduct().getPrice());

        else
            System.out.println("Sorry, the product " + target + " does not exist");
    }

    public void deleteProduct(String target)
    {
        if(head == null)
            System.out.println("Cannot delete data");

        else if(head.getProduct().getName().equals(target))
        {
            System.out.println("The product is found");
            head = head.getLink();
            System.out.println("The product of " + target + " has been deleted successfully");
        }

        else
        {
            Node before = null;
            Node current = head;

            while((!current.getProduct().equals(target)) && (current != null))
            {
                before = current;
                current = current.getLink();
            }

            if(current.getProduct().getName().equals(target))
            {
                System.out.println("The product is found");
                before.setLink(current.getLink());
                System.out.println("The product of " + target + " has been deleted successfully");
            }

            else
                System.out.println("The target is not exists");
        }
    }

    public void displayAllProducts()
    {
        Node current;
        current = head;

        System.out.println();
        System.out.printf("%-11s%10s%16s%11s \n", "Name", "Price", "Quantity", "Total");
        System.out.println("================================================");

        while (current != null)
        {
            System.out.printf("%-11s", current.getProduct().getName());
            System.out.printf("%10.2f", current.getProduct().getPrice());
            System.out.printf("%16d", current.getProduct().getQuantity());
            System.out.printf("%11.2f \n", calculateTotalPrice(current.getProduct()));

            current = current.getLink();
        }
    }
}
