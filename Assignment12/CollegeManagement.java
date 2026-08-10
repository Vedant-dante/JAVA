package Assignment12;

import Assignment12.Student.Student;
import Assignment12.Faculty.Faculty;

public class CollegeManagement {

    public static void main(String[] args) {

        Student student = new Student(
            "Rahul",
            101,
            "B.Tech CSE"
        );

        Faculty faculty = new Faculty(
            "Dr. Amit",
            501,
            "Computer Science"
        );

        System.out.println("Student Details");
        student.displayStudent();

        System.out.println();

        System.out.println("Faculty Details");
        faculty.displayFaculty();
    }
}D