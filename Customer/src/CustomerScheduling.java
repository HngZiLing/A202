public class CustomerScheduling
{
    Node head;

    public CustomerScheduling()
    {
        Customer [] customer;
    }

    public void addCustomerDetails(Customer customer)
    {
        Node newNode = new Node(customer);
        Node current = head;

        if (head == null)
            head = newNode;

        else {
            while (current.getLink() != null)
                current = current.getLink();

            current.setLink(newNode);
            current.getCustomer().setTotal(calculateTotalPrice(customer));
        }
    }

    public double calculateTotalPrice(Customer customer)
    {
        int distance;

        switch (customer.getPlace_departure())
        {
            case "Penang" : distance = 1;
            case ""

        }
    }

    public void searchSchedule(String target)
    {
        Node current;
        current = head;

        if(current.getCustomer().getName().equals(target))
            System.out.println("The price of " + target + " = " + current.getCustomer().getPrice());

        else
            System.out.println("Sorry, the product " + target + " does not exist");
    }

    public void updateCustomerDetails(String target)
    {

    }

    public void deleteSchedule(String target)
    {
        if(head == null)
            System.out.println("Cannot delete schedule");

        else if(head.getCustomer().getName().equals(target))
        {
            System.out.println("The customer is found");
            head = head.getLink();
            System.out.println("The customer of " + target + " has been deleted successfully");
        }

        else {
            Node before = null;
            Node current = head;

            while ((!current.getCustomer().getName().equals(target)) && (current != null))
            {
                before = current;
                current = current.getLink();
            }

            if (current.getCustomer().getName().equals(target))
            {
                System.out.println("The customer is found");
                before.setLink(current.getLink());
                System.out.println("The customer of " + target + " has been deleted successfully");
            }

            else
                System.out.println("The target is not exists");
        }
    }

    public void displayScheduleInfo()
    {
        Node current;
        current = head;

        while (current != null)
        {
            System.out.printf("%10s", current.getCustomer().getName());
            System.out.printf("%10s", current.getCustomer().getEmail());
            System.out.printf("%10s", current.getCustomer().getPhone_number());
            System.out.printf("%10s", current.getCustomer().getDate());
            System.out.printf("%10s", current.getCustomer().getTime());
            System.out.printf("%10s", current.getCustomer().getPlace_departure());
            System.out.printf("%10s", current.getCustomer().getPlace_arrive());
            System.out.printf("%10s", current.getCustomer().getNumberOfSeat());
            System.out.printf("%10s", current.getCustomer().getPrice());
            System.out.printf("%10s \n", current.getCustomer().getTotal());

            current = current.getLink();
        }
    }
}
