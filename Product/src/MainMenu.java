/*
Name            : H'NG ZI LING
Matric Number   : 281895
Course Code     : STIA 2024
Course Name     : Data Structure and Algorithm Analysis
Title           : Assignment 1 - Product
 */

public class MainMenu
{
    public static void main(String[] args)
    {
        ProductOperation operation = new ProductOperation();

        Product product;

        product = new Product("bread",2, 2.50);
        operation.addProduct(product);

        product = new Product("ice cream", 3, 2.00);
        operation.addProduct(product);

        product = new Product("Rice", 2, 30.00);
        operation.addProduct(product);

        System.out.println("================= DISPLAYING ALL PRODUCTS==========");
        operation.displayAllProducts();

        System.out.println("\n================= SEARCH A PRODUCT BY NAME TO FIND ITS PRICE ==========");
        operation.searchProduct("bicyle");
        operation.searchProduct("bread");

        System.out.println("\n================= DELETE THE PRODUCT BY ITS NAME  - DELETE ICE CREAM==========");
        String productToDelete = "ice cream";
        System.out.println("Product to be deleted = "+productToDelete);
        operation.deleteProduct(productToDelete);

        System.out.println("\n==== DISPLAYING ALL PRODUCT AFTER THE DELETION PROCESS ======");
        operation.displayAllProducts();
    }
}
