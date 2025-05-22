# Java Programming Exercises - ITS Steve Jobs Academy

This repository contains a collection of Java programming exercises developed during the course at the Steve Jobs Academy. The exercises cover various aspects of Java programming, from basics to more advanced concepts.

## Repository Structure

The repository is organized into thematic folders:

- **lezione_1/**: Java language fundamentals
  - Basic variable declarations
  - Simple mathematical operations
  - User input handling
  - Conditional statements (if, else)
  - Object instantiation and method calls

- **lezione_2/**: More Java fundamentals
  - Primitive data types
  - Complex challenges

- **lezione_3/**: Control structures and arrays
  - Menu-driven applications
  - Mathematical operations
  - Password validation
  - Array manipulation
  - Loops (for, do-while)

- **lezione_4/**: Object-oriented programming basics
  - Class definitions
  - Form handling with classes
  - User data management

- **lezione_4_2/**: Advanced object-oriented programming
  - Form-based user registration
  - Data persistence
  - Input validation
  - User management

- **lezione_5/**: Software design and refactoring
  - Course management system
  - Student tracking
  - Object relationships

- **home/**: Miscellaneous exercises
  - Array operations
  - Factorial calculations
  - Basic Java concepts
  - Person and User class implementations

## How to Use the Exercises

Each file contains a complete Java program that can be compiled and executed separately. To compile an exercise, use the command:

```bash
javac path/to/file.java
```

To run the compiled program:

```bash
java -cp path/to/directory ClassName
```

## Exercise Examples

### Basic Operations (lezione_1)
```java
// Variable declaration and output
int age = 30;
double height = 1.75;
System.out.println("Età: " + age);
System.out.println("Altezza: " + height);

// User input and arithmetic operations
Scanner scanner = new Scanner(System.in);
System.out.println("Inserisci il primo numero : ");
int primoNumero = scanner.nextInt();
System.out.println("Inserisci il secondo numero : ");
int secondoNumero = scanner.nextInt();
float somma = primoNumero + secondoNumero;
```

### Control Structures (lezione_3)
```java
// Menu-driven calculator
do {
    printMenu();
    scelta = scanner.nextInt();
    
    switch (scelta) {
        case 1:
            // Addition operation
            break;
        case 2:
            // Subtraction operation
            break;
        // Other operations...
    }
} while (scelta >= 1 && scelta <= 5);

// Password validation
do {
    System.out.println("Inserisci password : ");
    String input = scanner.nextLine();
    
    if (input.equals(password)) {
        System.out.println("Password corretta !");
        match = true;
    }
} while (!match);
```

### Object-Oriented Programming (lezione_4_2, lezione_5)
```java
// User class definition
class Utente implements Serializable {
    private String nome;
    private String cognome;
    private String email;
    private int eta;
    
    // Constructor, getters, toString method...
}

// Course management
public class Corso {
    private String nome;
    private List<Studente> studenti;
    
    // Methods to add, find, remove students...
}
```

## Educational Objectives

These exercises were designed to:
- Understand the fundamental concepts of Java programming
- Develop problem-solving skills
- Learn object-oriented programming principles
- Apply common algorithms in practical contexts
- Improve the ability to write clean and well-structured code
- Gain experience with GUI development and data persistence

## Requirements

- Java Development Kit (JDK)
- Basic knowledge of Java syntax
- A text editor or IDE (like VS Code, Eclipse, or IntelliJ IDEA)

---

*This repository was created as part of the educational journey at ITS Steve Jobs Academy.*