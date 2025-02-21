import java.util.Scanner;

class Power_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Base : ");
        int base = sc.nextInt();
        System.out.print("Enter Number Exponent : ");
        int expo = sc.nextInt();

        int answer = 1;
        int e = expo;

        while(expo > 0)
        {
            answer = answer * base;
            expo--;
        }

        System.out.println(base+" raised to the power "+e+" is "+answer);
    }
}
