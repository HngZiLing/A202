package dsa.project;

public class Node {//variables

    private Customer info;
    private Node link;

    //constructors
    public Node(Customer customer) {
        info = customer;
        this.link = null;
    }

    //setters and getters methods
    public Customer getCustomer() {
        return info;
    }

    public Node getLink() {
        return link;
    }

    public void setProduct(Customer customer) {
        info = customer;
    }

    public void setLink(Node link) {
        this.link = link;
    }

}
