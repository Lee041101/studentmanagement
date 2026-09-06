import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        ArrayList<Student> students = new ArrayList<>();
        while (running) {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Student");
                    System.out.println("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your major: ");
                    String major = scanner.nextLine();
                    Student student = new Student(id, name, age, major);
                    students.add(student);
                    System.out.println("Student Added");
                    break;
                case 2:

                    System.out.println("View Students");
                    if (students.isEmpty()) {
                        System.out.println("No Student found");
                    } else {
                        for (Student s : students) {
                            System.out.println("ID: " + s.getId());
                            System.out.println("Name: " + s.getName());
                            System.out.println("Age: " + s.getAge());
                            System.out.println("Major: " + s.getMajor());
                        }
                    }
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter the Student ID: ");
                    int SearchId = scanner.nextInt();
                    for (Student s : students) {
                        if (s.getId() == SearchId) {
                            found = true;
                            System.out.println("ID: " + s.getId());
                            System.out.println("Name: " + s.getName());
                            System.out.println("Age: " + s.getAge());
                            System.out.println("Major: " + s.getMajor());

                        }
                    }
                    if (!found) {
                    System.out.println("Student not found");
                }

                    break;
                case 6:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");


            }
        }
    }
}