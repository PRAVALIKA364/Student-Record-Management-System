import java.util.*;
import java.io.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private static final String FILENAME = "students.csv";

    public StudentManager() {
        loadFromFile();
    }

    public void addStudent(Student s) {
        for (Student st : students) {
            if (st.getId() == s.getId()) {
                System.out.println("Duplicate ID! Cannot add.");
                return;
            }
        }
        students.add(s);
        saveToFile();
        System.out.println("Student added successfully.");
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            saveToFile();
            System.out.println("Student deleted.");
            return true;
        }
        System.out.println("Student not found.");
        return false;
    }

    public void updateStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("New name: ");
            s.setName(sc.nextLine());
            System.out.print("New age: ");
            s.setAge(sc.nextInt());
            sc.nextLine();
            System.out.print("New department: ");
            s.setDepartment(sc.nextLine());
            saveToFile();
            System.out.println("Updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILENAME))) {
            for (Student s : students) {
                pw.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getDepartment());
            }
        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    students.add(new Student(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]), parts[3]));
                }
            }
        } catch (IOException | NumberFormatException e) {
            // Ignore empty/malformed file
        }
    }
}