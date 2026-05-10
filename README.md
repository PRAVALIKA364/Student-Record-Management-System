# Student Record Management System

This is a simple Java console application developed to manage student records efficiently.  
The project allows users to perform basic CRUD operations such as adding, searching, updating, deleting, and viewing student details. Student data is also stored in a CSV file so records remain saved even after closing the program.

---

## Features

- Add new student records
- Search students using Student ID
- Update existing student details
- Delete student records
- Display all students
- Store data permanently using file handling
- Prevent duplicate student    IDs

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections (`ArrayList`)
- File Handling (`CSV`)

---

## Project Structure

```bash
├── Main.java
├── Student.java
├── StudentManager.java
└── students.csv
```

---

## About the Classes

### `Student.java`

This class represents a student object and contains:
- Student ID
- Name
- Age
- Department

It also includes:
- Constructor
- Getters and Setters
- `toString()` method for displaying student details

---

### `StudentManager.java`

This class handles all student-related operations such as:
- Adding students
- Searching students
- Updating records
- Deleting records
- Displaying all records
- Saving data into a CSV file
- Loading data from the file

The program uses `ArrayList` to store student objects dynamically.

---

### `Main.java`

This is the main driver class of the project.  
It provides a menu-driven interface for user interaction through the console.

---

## How to Run the Project

### Step 1: Compile the Java Files

```bash
javac Main.java Student.java StudentManager.java
```

### Step 2: Run the Program

```bash
java Main
```

---

## Sample Menu

```text
Student Record Management System

1. Add Student
2. Search Student
3. Update Student
4. Delete Student
5. Display All
6. Exit
```

---

## File Storage

All student records are stored in:

```text
students.csv
```

Example:

```csv
101,Pravalika,20,CSE
102,Rahul,21,ECE
```

---

## Concepts Practiced

This project helped in understanding:
- Classes and Objects
- Encapsulation
- Constructors
- Collections Framework
- File Handling
- Exception Handling
- CRUD Operations
- Menu-driven programming

---

## Future Improvements

Some features that can be added in the future:
- Graphical User Interface using Java Swing or JavaFX
- Database connectivity using MySQL
- Search by name or department
- Sorting and filtering student records
- Login authentication system

---

## Author

**PANDIKONDA PRAVALIKA**



---