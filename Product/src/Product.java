/*
Name            : H'NG ZI LING
Matric Number   : 281895
Course Code     : STIA 2024
Course Name     : Data Structure and Algorithm Analysis
Title           : Assignment 1 - Product
 */

public class Product
{
    private String name;
    private int quantity;
    private double price;
    private double total;

    public Product(String name, int quantity, double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void setTotal(double total)
    {
        this.total = total;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public double getDouble()
    {
        return total;
    }
}

