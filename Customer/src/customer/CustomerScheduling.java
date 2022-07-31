package customer;

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

        else 
        {
            while (current.getLink() != null)
                current = current.getLink();

            current.setLink(newNode);
        }
    }

    public double calculateTotalPrice(Customer customer)
    {
        int num1 = 0;
        int num2 = 0;
        
        switch (customer.getPlace_departure())
        {
            case "Perlis"           : num1 = 0; break;
            case "Kedah"            : num1 = 1; break;     
            case "Penang"           : num1 = 2; break;
            case "Perak"            : num1 = 3; break;
            case "Kelantan"         : num1 = 4; break;
            case "Terengganu"       : num1 = 5; break;
            case "Pahang"           : num1 = 6; break;
            case "Selangor"         : num1 = 7; break;
            case "Kuala Lumpur"     : num1 = 8; break;
            case "Negeri Sembilan"  : num1 = 9; break;
            case "Melaka"           : num1 = 10; break;
            case "Johor"            : num1 = 11; break;
        }
        
        switch (customer.getPlace_arrive())
        {
            case "Perlis"           : num2 = 1; break;
            case "Kedah"            : num2 = 2; break;           
            case "Penang"           : num2 = 3; break;
            case "Perak"            : num2 = 4; break;
            case "Kelantan"         : num2 = 5; break;
            case "Terengganu"       : num2 = 6; break;
            case "Pahang"           : num2 = 7; break;
            case "Selangor"         : num2 = 8; break;
            case "Kuala Lumpur"     : num2 = 9; break;
            case "Negeri Sembilan"  : num2 = 10; break;
            case "Melaka"           : num2 = 11; break;
            case "Johor"            : num2 = 12; break;
        }
        double price = 10 + ((num2 - num1) * 2);
        
        return price * customer.getNumberOfSeat();
    }

    public void searchSchedule(String target)
    {
        Node currentNode = head;

        if ((currentNode.getCustomer().getPlace_arrive() == target) && (currentNode != null))
        {
            System.out.println("The bus to " + target + " = " + currentNode.getCustomer().getPrice());
            currentNode = currentNode.getLink();
        } 
        
        else if ((currentNode.getCustomer().getPlace_arrive() != target) && (currentNode != null)) 
        {
            System.out.println("Sorry, the bus to " + target + " does not exist");
        } 
        
        else 
        {
            System.out.println("Data cannot be search");
        }
    }

    public void updateCustomerDetails(String target)
    {

    }

    public void deleteSchedule(String name, String place_departure, String place_arrive)
    {
        if(head == null)
            System.out.println("Cannot delete schedule");

        else if(head.getCustomer().getName().equals(name) && head.getCustomer().getPlace_departure().equals(place_departure) && head.getCustomer().getPlace_arrive().equals(place_arrive))
        {
            head = head.getLink();
        }

        else 
        {
            Node before = null;
            Node currentNode = head;

            while (!currentNode.getCustomer().getName().equals(name) && !currentNode.getCustomer().getPlace_departure().equals(place_departure) && !currentNode.getCustomer().getPlace_arrive().equals(place_arrive) && (currentNode != null))
            {
                before = currentNode;
                currentNode = currentNode.getLink();
            }

            if (currentNode.getCustomer().getName().equals(name) && currentNode.getCustomer().getPlace_departure().equals(place_departure) && currentNode.getCustomer().getPlace_arrive().equals(place_arrive))
            {
                before.setLink(currentNode.getLink());
            }

            else
                System.out.println("The target is not exists");
        }
    }

    public String displayScheduleInfo()
    {
        Node current;
        current = head;
        
        String info = null;
        
        if(head == null)
        {
            info = "List is empty";
        }
        
        while (current != null)
        {   
            info = "Name = " + current.getCustomer().getName() +
                    "\nEmail = " + current.getCustomer().getEmail() + 
                    "\nPhone Number = " + current.getCustomer().getPhone_number() +
                    "\nData = " + current.getCustomer().getDate() +
                    "\nTime = " + current.getCustomer().getTime() +
                    "\nPlace Departure = " + current.getCustomer().getPlace_departure() + 
                    "\nPlace Arrive = " + current.getCustomer().getPlace_arrive() +
                    "\nNumber Of Seat = " + current.getCustomer().getNumberOfSeat() + 
                    "\nTotal Price = RM " + calculateTotalPrice(current.getCustomer());
            
            current = current.getLink();        
        }
        return info;
    }
}
