package Assignment11;

interface Printable {

    void printDetails();
}

class Student implements Printable {

    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Employee implements Printable {

    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class PrintableApp {

    public static void main(String[] args) {

        Printable student = new Student("Rahul", 101);
        Printable employee = new Employee("Amit", 501);

        System.out.println("Student Details");
        student.printDetails();

        System.out.println();

        System.out.println("Employee Details");
        employee.printDetails();
    }
}