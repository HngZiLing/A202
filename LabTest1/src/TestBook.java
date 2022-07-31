import java.util.Scanner;

public class TestBook
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String title, field, author;
        int noOfBook, bonusPoint, quantity;
        double price, priceTax;

        System.out.print("Enter the number of books : ");
        noOfBook = scan.nextInt();
        System.out.println();

        Book[] bookArray = new Book[noOfBook];

        for (int i = 0; i < bookArray.length; i++)
        {
            System.out.print("Enter book " + (i+1) + " title  : ");
            title = scan.next() + scan.nextLine();

            System.out.print("Enter book field    : ");
            field = scan.next() + scan.nextLine();

            System.out.print("Enter book author   : ");
            author = scan.next() + scan.nextLine();

            System.out.print("Enter price of the book     : RM ");
            price = scan.nextDouble();

            System.out.print("Enter quantity of the book  : ");
            quantity = scan.nextInt();

            System.out.println();

            Book book = new Book(title, field, author, price, quantity);
            bookArray[i] = book;
            book.setPriceTax(book.calculatePriceWithTax());
            book.setBonusPoint(book.determineBonusPoint());
        }

        System.out.println("The following are the list of books : ");
        System.out.println();

        for (int i = 0; i < bookArray.length; i++)
        {
            System.out.println("-----------------Book " + (i+1) + "-----------------");
            System.out.println(bookArray[i].toString());
            System.out.println();
        }
    }
}
