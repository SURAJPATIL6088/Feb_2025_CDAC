public class WrongInitializationForLoop {
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    }
}

// Infinite Loop

// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> javac WrongInitializationForLoop.java
// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> java WrongInitializationForLoop

public class WrongInitializationForLoop {
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) { 
            System.out.println(i); 
        } 
    }
}

// Output
/*
10
9
8
7
6
5
4
3
2
1
0
*/