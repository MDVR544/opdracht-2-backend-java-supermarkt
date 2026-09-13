package main.java;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class Supermarket {
      private List<Product> products;
      private String name;

    public Supermarket(List<Product> products, String name){
        requireNonNull(products);
        this.products = products;
        this.name = name;
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
    public List<Product> getProducts() {
        return products;
    }

    public void restockItem(String productName, int amount){
        for (Product products : this.products) {
            if (products.getName().equalsIgnoreCase(productName)){
               int restockAmount = products.getAmount() + amount;
                products.setAmount(restockAmount);
                return;
            }
        }
        System.out.println(productName + " is not on stock.");
    }

    public String getName() {
        return name;
    }
}
