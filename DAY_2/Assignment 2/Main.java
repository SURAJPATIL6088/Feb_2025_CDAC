// Snippet - 01
public class Main1 { 
    public void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 

// Error
/*
PS E:\CDAC 25\Feb_2025_CDAC\DAY_2\Assignment 2> javac Main1.java
PS E:\CDAC 25\Feb_2025_CDAC\DAY_2\Assignment 2> java Main1

Main method is not static in class Main, please define the main method as:
   public static void main(String[] args) 
*/

// Correct
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 

// Output
// Hello, World!