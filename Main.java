import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Student Record Management System");

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    manager.addStudent(new Student(id, name, age, dept));
                    break;
                case 2:
                    System.out.print("ID: ");
                    Student found = manager.searchStudent(sc.nextInt());
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 3:
                    System.out.print("ID: ");
                    manager.updateStudent(sc.nextInt());
                    break;
                case 4:
                    System.out.print("ID: ");
                    manager.deleteStudent(sc.nextInt());
                    break;
                case 5:
                    manager.displayAll();
                    break;
                case 6:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}