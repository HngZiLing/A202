package project.dsa.g3;

public class Customer 
{
    private String name;
    private String email;
    private String phone_number;
    private String date;
    private String time;
    private String place_departure;
    private String place_arrive;
    private int numberOfSeat;
    private double price;
    private String user;
    private String pass;
    private String mail;
    private String pnumber;

    public Customer(String name, String email, String phone_number, String date, String time, String place_departure, String place_arrive, int numberOfSeat)
    {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.date = date;
        this.time = time;
        this.place_departure = place_departure;
        this.place_arrive = place_arrive;
        this.numberOfSeat = numberOfSeat;
    }
    
    public Customer(String user, String pass, String mail, String pnumber)
    {
        this.user = user;
        this.pass = pass;
        this.mail = mail;
        this.pnumber = pnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPlace_departure(String place_departure) {
        this.place_departure = place_departure;
    }

    public void setPlace_arrive(String place_arrive) {
        this.place_arrive = place_arrive;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getPlace_departure() {
        return place_departure;
    }

    public String getPlace_arrive() {
        return place_arrive;
    }
    
    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public double getPrice() {
        return price;
    }
    
        public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getMail() {
        return mail;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }
}