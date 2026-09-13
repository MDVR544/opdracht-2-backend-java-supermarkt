package main.java;

import java.util.*;

public class Main {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         List<Product> productsHalberteijn = new ArrayList<>();
         productsHalberteijn.add(new Product("bread", 2.50, 10));
         productsHalberteijn.add(new Product("fruit", 0.80, 14));
         productsHalberteijn.add(new Product("toiletPaper", 4.30, 8));
         productsHalberteijn.add(new Product("cheese", 8.20, 4));

         List<Product> productsDumbo = new ArrayList<>();
         productsDumbo.add(new Product("bread", 9.50, 7));
         productsDumbo.add(new Product("fruit", 1.30, 9));
         productsDumbo.add(new Product("toiletPaper", 12.60, 2));
         productsDumbo.add(new Product("cheese", 10.40, 3));

         List<Product> productsCaldi = new ArrayList<>();
         productsCaldi.add(new Product("bread", 1.30, 10));
         productsCaldi.add(new Product("fruit", 0.60, 12));
         productsCaldi.add(new Product("toiletPaper", 13.10, 7));
         productsCaldi.add(new Product("cheese", 10.20, 4));

         Supermarket halberteijn = new Supermarket(productsHalberteijn, "Halbert eijn");
         Supermarket dumbo = new Supermarket(productsDumbo, "Dumbo");
         Supermarket caldi = new Supermarket(productsCaldi, "Caldi");

         Map<String, Supermarket> shoppingCenter = new HashMap<>();

         shoppingCenter.put("halbert eijn", halberteijn);
         shoppingCenter.put("dumbo", dumbo);
         shoppingCenter.put("caldi", caldi);

         Customer max = new Customer("Max");

         while (true) {
         System.out.println("\nWhat do you want to do?");
         System.out.println("1 - Pick a supermarket");
         System.out.println("2 - buy a product");
         System.out.println("3 - restock a product");
         System.out.println("4 - exit");
         int choice = scanner.nextInt();
         scanner.nextLine();

             switch (choice) {
                 case 1:
                     System.out.println("Which supermarket do you want to go to?");
                     System.out.println("Pick one of the following:");
                     System.out.println("- Halbert Eijn");
                     System.out.println("- Dumbo");
                     System.out.println("- Caldi");
                     String superMarketChoice = scanner.nextLine().toLowerCase();
                     max.goToSuperMarket(shoppingCenter.get(superMarketChoice));
                     break;
                 case 2:
                     if (max.getSupermarket() == null){
                         System.out.println("Pick a supermarket first.");
                         break;
                     }
                     System.out.println("Which product do you want to buy from " + max.getSupermarket().getName() + "?");
                     String productChoice = scanner.nextLine().toLowerCase();
                     System.out.println("How many do you want to buy?");
                     int productAmount = scanner.nextInt();
                     scanner.nextLine();

                     max.buyItem(productChoice, productAmount);
                     break;

                 case 3:
                     System.out.println("Which supermarket do you want to go to?");
                     System.out.println("Pick one of the following:");
                     System.out.println("- Halbert Eijn");
                     System.out.println("- Dumbo");
                     System.out.println("- Caldi");
                     String restockSuperMarketChoice = scanner.nextLine().toLowerCase();
                     Supermarket restockSupermarkt = (shoppingCenter.get(restockSuperMarketChoice));
                     System.out.println("Which product do you want to restock from " + restockSupermarkt.getName() + "?");
                     String restockProductChoice = scanner.nextLine().toLowerCase();
                     System.out.println("How many do you want to restock?");
                     int restockAmount = scanner.nextInt();
                     scanner.nextLine();

                     restockSupermarkt.restockItem(restockProductChoice, restockAmount);
                     break;
                 case 4:
                     System.out.println("Closed program, goodbye");
                     return;
                 default:
                     System.out.println("input incorrect, please try again");
                     break;
             }
         }
    }
}
