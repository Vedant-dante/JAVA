package Assignment13;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeFile {

    public static void main(String[] args) {

        String fileName = "employees.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Employee ID: 101\n");
            writer.write("Employee Name: Rahul\n");
            writer.write("Department: Computer Science\n");
            writer.write("Salary: 50000\n");

            writer.close();

            System.out.println("Employee details written to file.");
            System.out.println();

            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            System.out.println("Employee Details");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}