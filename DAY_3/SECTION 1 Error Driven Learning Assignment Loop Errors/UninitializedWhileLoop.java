public class UninitializedWhileLoop {
    public static void main(String[] args) { 
        int count; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}

// variable count not initialized

// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> javac UninitializedWhileLoop.java
// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> java UninitializedWhileLoop

public class UninitializedWhileLoop {
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}

// Output
/*
0
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