// Snippet - 04
public class Main4 {
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
}

// Error
/*
PS E:\CDAC 25\Feb_2025_CDAC\DAY_2\Assignment 2> javac Main4.java

Main method not found in class Main4, please define the main method as:
   public static void main(String[] args)        
or a JavaFX application class must extend javafx.application.Applicatio
*/

// Correct
public class Main4 {
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    }
}

// Output
// Hello, World!