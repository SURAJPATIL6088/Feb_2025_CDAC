import java.util.Scanner;

class Number_Is_Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        boolean check = false;

        if (num < 2) {
            System.out.println("The Number " + num + " is Not a Prime");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("The Number " + num + " is Not a Prime");
        } else {
            System.out.println("The Number " + num + " is Prime");
        }
    }
}
