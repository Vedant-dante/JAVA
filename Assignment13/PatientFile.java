package Assignment13;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PatientFile {

    public static void main(String[] args) {

        String fileName = "patients.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Patient ID: 201\n");
            writer.write("Patient Name: Amit\n");
            writer.write("Age: 25\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            System.out.println("Patient details written to file.");
            System.out.println();

            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            System.out.println("Patient Details");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}