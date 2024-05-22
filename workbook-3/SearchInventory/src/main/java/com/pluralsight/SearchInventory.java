package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("""
                What do you want to do?\s
                \t1 - List all products
                \t2 - Lookup a product by its id
                \t3 - Find all products within a price range
                \t4 - Add a new product
                \t5 - Quit the application
                """);
        int command;
        do {
            System.out.print("Please enter a valid command: ");
            command = scanner.nextInt();
            switch (command) {
                case 1 -> listAllProducts(inventory);
                case 2 -> lookUpById(inventory);
                case 3 -> findWithinPriceRange(inventory);
                case 4 -> addNewProduct(inventory);
                case 5 -> System.out.println("Exiting the application...");
                default -> System.out.println("Invalid command. Please enter a valid command.");
            }
        } while (command != 5);
    }

    private static void addNewProduct(ArrayList<Product> inventory) {
        int id;
        String name;
        float price;
        System.out.print("Please enter the id of the product: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the name of the product: ");
        name = scanner.nextLine();
        System.out.print("Please enter the price of the product: ");
        price = scanner.nextFloat();
        Product product = new Product(id, name, price);
        inventory.add(product);
        System.out.println("Product added successfully.");
    }

    private static void findWithinPriceRange(ArrayList<Product> inventory) {
        float minPrice, maxPrice;
        System.out.print("Please enter the minimum price: ");
        minPrice = scanner.nextFloat();
        System.out.print("Please enter the maximum price: ");
        maxPrice = scanner.nextFloat();
        System.out.println("Products within the price range:");
        boolean found = false;
        for (Product product : inventory) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found within the specified price range.");
        }
    }

    private static void lookUpById(ArrayList<Product> inventory) {
        System.out.print("Please enter the id of the product: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (Product product : inventory)
            if (product.getId() == id) {
                System.out.println("Product found: " + product);
                found = true;
                break;
            }
        if (!found) {
            System.out.println("No product found with the specified id.");
        }
    }

    private static void listAllProducts(ArrayList<Product> inventory) {
        System.out.println("List of all products:");
        for (Product ignored : inventory) {
            System.out.println();
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("inventory.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                Product product;
                product = new Product(Integer.parseInt(data[0]), data[1], Float.parseFloat(data[2]));
                inventory.add(product);
            }
        } catch (IOException e) {
            System.err.println("Error reading inventory file: " + e.getMessage());
        }
        return inventory;
    }

    private static class Product {
        public Product(int id, String name, float price) {
        }

        public float getPrice() {
            return 0;
        }

        public int getId() {
            return 0;
        }
    }
}
