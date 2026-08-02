class Student {

    String name;
    int rollNo;

    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Default Constructor");
        s1.display();

        System.out.println();

        Student s2 = new Student("Rahul", 101);

        System.out.println("Parameterized Constructor");
        s2.display();
    }
}