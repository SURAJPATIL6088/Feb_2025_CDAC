public class MisplacedForLoopBody {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Done");
        }
    }
}

// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> javac MisplacedForLoopBody.java
// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> java MisplacedForLoopBody

// Initial Output
/*
 * 0
 * 1
 * 2
 * 3
 * 4
 * Done
 */

// PS E:\CDAC 25\Feb_2025_CDAC\DAY_3\SECTION 1> java MisplacedForLoopBody

/*
0
Done
1
Done
2
Done
3
Done
4
Done
*/