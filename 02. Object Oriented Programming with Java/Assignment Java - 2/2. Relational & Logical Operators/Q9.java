import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();

        String answer = (num >= 20 && num <= 50) ? "Number is in Specific Range" : "Number is not in Specific Range";
        System.out.println(answer);
    }
}
