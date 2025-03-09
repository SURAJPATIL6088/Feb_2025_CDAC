import java.util.Scanner;

class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if (num < 3) {
            System.out.println("Number is not Divisible by 3");
        }

        boolean Flag = false;
        while (num >= 3) {
            if (num == 3) {
                System.out.println("Number is Divisible by 3");
                Flag = true;
            }

            num -= 3;
        }

        if (Flag == false) {
            System.out.println("Number is not Divisible by 3");
        }
    }
}