// Snippet - 02
public class Main2 {
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}

// Error
/*
PS E:\CDAC 25\Feb_2025_CDAC\DAY_2\Assignment 2> javac Main2.java


Main method not found in class Main2, please define the main method as:
   public static void main(String[] args)        
or a JavaFX application class must extend javafx.application.Application
*/

// Correct
public class Main2 {
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}

// Output
// Hello, World!