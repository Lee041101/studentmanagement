
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (running) {
            System.out.println("=========Student Management System==========");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    viewStudent(students);
                    break;
                case 3:
                    searchStudent(scanner, students);
                    break;
                case 4:
                    updateStudent(scanner, students);
                    break;
                case 5:
                    deleteStudent(scanner, students);
                    break;
                    case 6:
                        running = false;
                        System.out.println("Goodbye");
                        break;
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }

    public static void addStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.println("Add Student");
        System.out.println("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your major: ");
        String major = scanner.nextLine();
        Student student = new Student(id, name, age, major);
        students.add(student);
        System.out.println("Student Added Successfully");
    }

    public static void viewStudent(ArrayList<Student> students) {
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
    }

    public static void searchStudent(Scanner scanner, ArrayList<Student> students) {
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
    }

    public static void updateStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.println("Enter Student ID: ");
        int updateId = scanner.nextInt();
        scanner.nextLine();
        for (Student s : students) {
            if (s.getId() == updateId) {
                System.out.println("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.println("Enter your new Age: ");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter your new Major: ");
                String newMajor = scanner.nextLine();
                s.setName(newName);
                System.out.println("Name: " + s.getName());
                s.setAge(newAge);
                System.out.println("Age: " + s.getAge());
                s.setMajor(newMajor);
                System.out.println("Major: " + s.getMajor());
            }
        }

    }

    public static void deleteStudent(Scanner scanner, ArrayList<Student> students) {
        boolean deletefound = false;
        System.out.println("Enter Student ID: ");
        int deleteId = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == deleteId) {
                deletefound = true;
                students.remove(i);
                System.out.println("Student Deleted");
                break;
            }
        }
        if (!deletefound) {
            System.out.println("Student not found");
        }
    }
}
