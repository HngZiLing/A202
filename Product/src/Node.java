/*
Name            : H'NG ZI LING
Matric Number   : 281895
Course Code     : STIA 2024
Course Name     : Data Structure and Algorithm Analysis
Title           : Assignment 1 - Product
 */

public class Node
{
    private Product info;
    private Node link;

//    public Product(Product product)
//    {
//    }

    public Node(Product product)
    {
        info = product;
        link = null;
    }

    public Product getProduct()
    {
        return info;
    }

    public Node getLink()
    {
        return link;
    }

    public void setProduct(Product product)
    {
        info = product;
    }

    public void setLink(Node link)
    {
        this.link = link;
    }
}
