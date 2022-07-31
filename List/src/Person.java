public class Person
{
    private String name;
    private String tel;
    private int age;

    public Person(String name, String tel, int age)
    {
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    public String toString()
    {
        return "Your name : " + name + "\nYour age : " + age + "\nYour telephone number : " + tel + "\n";
    }
}
