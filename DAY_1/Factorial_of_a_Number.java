import java.util.Scanner;

class Factorial_of_a_Number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int answer = 1;

        for(int i = num; i>=1; i--)
        {
            answer = answer * i;
        }

        System.out.println("Factorial of 5 is "+answer);
    }
}
