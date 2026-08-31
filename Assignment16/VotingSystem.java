package Assignment16;

import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {

    static void checkEligibility(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("You are not eligible for voting. Age must be 18 or above.");
        }

        System.out.println("You are eligible for voting.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkEligibility(age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        }

        sc.close();
    }
}