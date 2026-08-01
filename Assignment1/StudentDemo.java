package Assignment1;
class Student {

    int id;
    String name;
    double marks;


    Student() {
        id = 0;
        name = "Unknown";
        marks = 0.0;
    }

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
    }

    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade : A");
        else if (marks >= 75)
            System.out.println("Grade : B");
        else if (marks >= 60)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : D");
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Default Constructor");
        s1.displayDetails();
        s1.calculateGrade();

        System.out.println();

        Student s2 = new Student(101, "Rahul", 87.5);

        System.out.println("Parameterized Constructor");
        s2.displayDetails();
        s2.calculateGrade();
    }
}