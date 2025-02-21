import java.util.Scanner;

class Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        if(number % 2 == 0)
        {
            System.out.println("The number "+number+" is Even.");
        }
        else
        {
            System.out.println("The number "+number+" is Odd.");
        }
    }
}
