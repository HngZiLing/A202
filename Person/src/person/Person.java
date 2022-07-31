package person;

public class Person 
{
    private String name;
    private String tel;
    private int age;

    public Person(String name, String telephone_num, int age)
    {
        this.name = name;
        this.tel = telephone_num;
        this.age = age;
    }

    public String toString()
    {
        return "Your name : " + name + "\nYour age : " + age + "\nYour telephone number : " + tel + "\n";
    }
}
