package main.java;

import static java.util.Objects.requireNonNull;

public class Supermarket {
    private Product bread;
    private Product fruit;
    private Product cheese;
    private Product toiletPaper;

    public Supermarket(Product bread, Product fruit, Product cheese, Product toiletPaper){
        requireNonNull(bread);
        requireNonNull(fruit);
        requireNonNull(cheese);
        requireNonNull(toiletPaper);
        this.bread = bread;
        this.fruit = fruit;
        this.cheese = cheese;
        this.toiletPaper = toiletPaper;
    }

    public void buyItem(Product product, int amount){
        if (amount <= product.getAmount()){
            double totalPrice = product.getPrice() * amount;
            product.setAmount(product.getAmount() - amount);
            System.out.println("You bought " + amount + " " + product.getName() + " for " + totalPrice + " euro.");
        } else {
            System.out.println("You cannot buy " + amount + " " + product.getName() + " we only have " + product.getAmount() + " " + product.getName() + " in stock.");
        }
    }
    public void buyBread(int amount){
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount){
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount){
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount){
        buyItem(this.toiletPaper, amount);
    }
}
