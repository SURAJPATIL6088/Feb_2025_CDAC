import java.util.Scanner;

class First_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int count = 0;

        while(count != n)
        {
            count++;
            System.out.print(count+" ");
        }
    }
}
