public class NestedLoopOutput {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(i + " " + j + " ");
            }
            System.out.println();

        }
    }
}

// Dry-run
/*
 iteration : i=1
    j = 1 to j = 2
    print(i, j);
    1 1 1 2

 iteration : i=2
    j = 1 to j = 2
    print(i, j);
    2 1 2 2

 iteration : i=3
    j = 1 to j = 2
    print(i, j);
    3 1 3 2
 */

// Output
/*
    1 1 1 2
    2 1 2 2
    3 1 3 2
*/