public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 

// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> javac OffByOneErrorForLoop.java
// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> java OffByOneErrorForLoop

/*

1
2
3
4
5
6
7
8
9
10

*/

public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 9; i++) { 
            System.out.println(i); 
        } 
        
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 

/*
Output 
1
2
3
4
5
6
7
8
9
*/