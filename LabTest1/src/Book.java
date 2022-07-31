public class Book
{
    private String title;
    private String field;
    private String author;
    private double price;
    private double priceTax;
    private int bonusPoint;
    private int quantity;

    public Book(String title, String field, String author, double price, int quantity)
    {
        this.title = title;
        this.field = field;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPriceTax(double priceTax)
    {
        this.priceTax = priceTax;
    }

    public void setBonusPoint(int bonusPoint)
    {
        this.bonusPoint = bonusPoint;
    }

    public double calculatePriceWithTax()
    {
        priceTax = (price * quantity + (price * quantity) * 0.03 );
        return priceTax;
    }

    public int determineBonusPoint()
    {
        if (quantity >= 2 && quantity <= 5)
            bonusPoint = 10;

        else if (quantity >= 6 && quantity <= 10)
            bonusPoint = 20;

        else if (quantity < 2)
            bonusPoint = 0;

        else if (quantity > 10)
            bonusPoint = 30;

        return bonusPoint;
    }

    public String toString()
    {
        return "Title           : " + title +
                "\nAuthor          : " + author +
                "\nField           : " + field +
                "\nPrice           : " + price +
                "\nQuantity        : " + quantity +
                "\nPrice with Tax  : RM " + priceTax +
                "\nBonus Point     : " + bonusPoint;
    }
}
