// Snippet - 03
public class Main3 {
    public static int main(String[] args) { 
        System.out.println("Hello, World!"); 
        return 0; 
    } 
}

// Error
/*
PS E:\CDAC 25\Feb_2025_CDAC\DAY_2\Assignment 2> javac Main3.java

Main method must return a value of type void in class Main3, please
define the main method as:
   public static void main(String[] args) 
*/

// Correct
public class Main3 {
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    }
}

// Output
// Hello, World!