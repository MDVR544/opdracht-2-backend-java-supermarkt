package main.java;

public class Customer {
    private String name;
    private Supermarket supermarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSuperMarket(Supermarket supermarket){
    this.supermarket = supermarket;
    }

    public void buyItem(String productName, int amount){
        if (this.supermarket == null){
            System.out.println("Select a supermarket to go to first");
            return;
        }
        for (Product products : this.supermarket.getProducts()) {
            if (productName.equalsIgnoreCase(products.getName())){
                this.supermarket.buyItem(products, amount);
                return;
            }
            }
        System.out.println(this.supermarket.getName() + "does not sell " + productName);
    }

    public Supermarket getSupermarket() {
        return supermarket;
    }
}
