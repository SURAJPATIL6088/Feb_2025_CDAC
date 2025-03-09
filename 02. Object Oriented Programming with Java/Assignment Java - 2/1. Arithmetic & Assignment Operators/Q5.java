import java.util.Scanner;

class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swap : " + a + ", " + b);
        // 12 21
        // a=33
        a += b;
        // 12
        b = a - b;
        // a=21
        a -= b;

        System.out.println("After Swap : " + a + ", " + b);
    }
}