public class ConditionalLoopOutput {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                num += i;
            } else {
                num -= i;
            }
        }
        System.out.println(num);
    }
}

/*

    initialize num = 1

    iteration 1:
    (1 % 2 == 0) false
    num = num - 1; // 0

    iteration 2:
    (2 % 2 == 0) true
    num = num + 2; // 2
    
    iteration 3:
    (3 % 2 == 0) false
    num = num - 3; // -3

    iteration 4:
    (4 % 2 == 0) true
    num = num + 4; // 3

    // Output
    3
*/
