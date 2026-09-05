package main.java;

public class Main {
    private Supermarket supermarket;
    private Customer customer;
    private String productName;
    private int amount;

     public static void main(String[] args){

        Product bread = new Product("bread", 2.50, 10);
        Product fruit = new Product("fruit", 0.80, 14);
        Product toiletPaper = new Product("toiletPaper", 4.30, 8);
        Product cheese = new Product("cheese", 8.20, 4);

        Supermarket jumbo = new Supermarket(bread, fruit, cheese, toiletPaper);

        Customer Max = new Customer("Max");

        Max.goToSuperMarket(jumbo);

         IO.println("Which product do you want to buy?");
         String productName = IO.readln().trim();

         IO.println("How many do you want to buy?");
         int amount = Integer.parseInt(IO.readln());

         Max.buyItem(productName, amount);
    }

}
