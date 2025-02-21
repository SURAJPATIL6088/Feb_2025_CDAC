import java.util.Scanner;

class Count_the_Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        int count = 0;
        int n = number;

        while(number > 0)
        {
            int last = number % 10;
            count++;
            number = number / 10;
        }

        System.out.println("The number "+n+" has "+count+" digits.");
    }
}
