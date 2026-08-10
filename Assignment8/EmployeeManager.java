package Assignment8;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class EmployeeManager {

    public static void main(String[] args) {

        Manager m = new Manager("Rahul", 50000, "IT");

        m.displayManagerDetails();
    }
}