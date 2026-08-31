package Assignment14;

import java.util.Scanner;

public class OnlineShopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product name: ");
            String productName = sc.nextLine();

            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new IllegalArgumentException("Product quantity must be greater than zero.");
            }

            System.out.println("Order placed successfully.");
            System.out.println("Product: " + productName);
            System.out.println("Quantity: " + quantity);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid quantity.");
        }

        sc.close();
    }
}