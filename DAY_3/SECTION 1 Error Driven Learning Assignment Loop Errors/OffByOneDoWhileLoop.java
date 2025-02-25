// public class OffByOneDoWhileLoop {
//     public static void main(String[] args) { 
//         int num = 1; 
//         do { 
//             System.out.println(num); 
//             num--; 
//         } while (num > 0); 
//     } 
// }

// Output : 1

// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> javac OffByOneDoWhileLoop.java
// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> java OffByOneDoWhileLoop

public class OffByOneDoWhileLoop {
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <= 5); 
    } 
}

/*
1
2
3
4
5
*/