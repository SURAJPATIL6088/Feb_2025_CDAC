import java.util.Scanner;

class Multiplication_Table {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
