package project.dsa.g3;
import javax.swing.JOptionPane;

public class CustomerScheduling 
{
    private Node head;

    public CustomerScheduling() {
        Customer [] customer;
    }

    public void addCustomer(Customer customer) {

        Node new_Node = new Node(customer);

        if (head == null) {
            head = new_Node;
        } 
        
        else
        {
            Node current = head;
            
            while (current.getLink() != null)
                current = current.getLink();
            
            current.setLink(new_Node);                
        }
    }
    
    public double calculateTotalPrice(Customer customer)
    {
        int num1 = 0;
        int num2 = 0;

        switch (customer.getPlace_departure())
        {    
            case "PENANG"           : num1 = 0; break;
            case "IPOH"             : num1 = 1; break;
            case "KUALA LUMPUR"     : num1 = 2; break;
            case "SEREMBAN"         : num1 = 3; break;
            case "MALACCA"          : num1 = 4; break;
            case "JOHOR"            : num1 = 5; break;
            case "JOHOR BAHRU"      : num1 = 6; break;
        }
        
        switch (customer.getPlace_arrive())
        {
            case "PENANG"           : num2 = 1; break;
            case "IPOH"             : num2 = 2; break;
            case "KUALA LUMPUR"     : num2 = 3; break;
            case "SEREMBAN"         : num2 = 4; break;
            case "MALACCA"          : num2 = 5; break;
            case "JOHOR"            : num2 = 6; break;
            case "JOHOR BAHRU"      : num2 = 7; break;
        }
        double price = 10 + Math.abs((num2 - num1) * 2);
        
        return price * customer.getNumberOfSeat();
    }

    public void searchSchedule(String target) 
    {
//        Node current = head;
//
//        if (current == null)
//             System.out.println("Data cannot be search");      
//        
//        while (current != null)
//        {
//            if ((current.getCustomer().getPlace_arrive().equals(target)))
//            {
//                System.out.println("The bus to " + target + " = " + current.getCustomer().getPrice());
//            }
//            
//            else 
//            {
//                current = current.getLink();                
//                System.out.println("Sorry, the bus to " + target + " does not exist");
//            }   
//        }
    }
    
    public void search(String target, String target2)
    {
        Node current = head;
        while(current != null)
        {
            if ((current.getCustomer().getUser().equals(target)) && (current != null))
            {
                if ((current.getCustomer().getPass().equals(target2)) && (current != null))
                {
                    JOptionPane.showMessageDialog(null,"Login success.");
                    GUI gui = new GUI();
                    gui.setVisible(true);
                    break;
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid username or password.");
                    break;
                }
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null,"Invalid username or password.");
                break;
            }
        }
        
        while (current == null)
        {
            JOptionPane.showMessageDialog(null,"Invalid username or password.");
            break;
        }
    }

    public void updateCustomerDetails(String target)
    {
        
    }
    
    public void deleteSchedule(String name, String place_departure, String place_arrive) {

        if (head == null){
            System.out.println("Cannot delete data");
        } 
        
        else if (head.getCustomer().getName().equals(name) && head.getCustomer().getPlace_departure().equals(place_departure) && head.getCustomer().getPlace_arrive().equals(place_arrive)) {
            head = head.getLink();
        } 
        
        else {
            Node before = null;
            Node currentNode = head;

            while (!currentNode.getCustomer().getName().equals(name) && !currentNode.getCustomer().getPlace_departure().equals(place_departure) && !currentNode.getCustomer().getPlace_arrive().equals(place_arrive) && (currentNode != null)) {
                before = currentNode;
                currentNode = currentNode.getLink();
            }

            if (currentNode.getCustomer().getName().equals(name) && currentNode.getCustomer().getPlace_departure().equals(place_departure) && currentNode.getCustomer().getPlace_arrive().equals(place_arrive)) {
                before.setLink(currentNode.getLink());
            }
            
            else {
                JOptionPane.showMessageDialog(null, "The target is not exists");
            }
        }
    }
    
    public String displayAll() 
    {
        Node current = head;  
        String output = "";

        if (head == null) 
        {
            JOptionPane.showMessageDialog(null, "List is empty");
        }

        while(current != null)
        {
            String data = "Name = " + current.getCustomer().getName() +
                    "\nEmail = " + current.getCustomer().getEmail() + 
                    "\nPhone Number = " + current.getCustomer().getPhone_number() +
                    "\nData = " + current.getCustomer().getDate() +
                    "\nTime = " + current.getCustomer().getTime() +
                    "\nPlace Departure = " + current.getCustomer().getPlace_departure() + 
                    "\nPlace Arrive = " + current.getCustomer().getPlace_arrive() +
                    "\nNumber Of Seat = " + current.getCustomer().getNumberOfSeat() +
                    String.format("\nTotal Price = RM %.2f\n\n", calculateTotalPrice(current.getCustomer()));             
            
            output += data;
            current = current.getLink();
        }
        return output;
    }
}
