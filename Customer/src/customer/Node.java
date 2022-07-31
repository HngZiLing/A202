package customer;

public class Node 
{
    private Customer info;
    private Node link;

    public Node(Customer customer)
    {
        info = customer;
        link = null;
    }

    public Customer getCustomer()
    {
        return info;
    }

    public Node getLink()
    {
        return link;
    }

    public void setCustomer(Customer customer)
    {
        info = customer;
    }

    public void setLink(Node link)
    {
        this.link = link;
    }
}
