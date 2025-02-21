import java.util.Scanner;

class Reverse_a_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int result = 0;
        int n = num;

        while(num > 0)
        {
            int last = num % 10;
            result = result * 10 + last;
            num = num / 10;
        }

        System.out.println("The reverse of "+n+" is "+result);
    }
}
