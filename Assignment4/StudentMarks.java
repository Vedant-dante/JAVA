package Assignment4;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        String m1 = sc.nextLine();

        System.out.print("Enter marks for Subject 2: ");
        String m2 = sc.nextLine();

        System.out.print("Enter marks for Subject 3: ");
        String m3 = sc.nextLine();

        Integer mark1 = Integer.valueOf(m1);
        Integer mark2 = Integer.valueOf(m2);
        Integer mark3 = Integer.valueOf(m3);

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("\nMarks");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}