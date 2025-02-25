public class IncorrectWhileCondition {
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}

// Error : IncorrectWhileCondition.java:4: error: incompatible types: int cannot be converted to boolean while (count = 0) 

// Corrected Version
public class IncorrectWhileCondition {
    public static void main(String[] args) { 
        int count = 5; 
        while (count >= 0) { 
            System.out.print(count+" "); 
            count--; 
        } 
    } 
}

// Output : 5 4 3 2 1 0
