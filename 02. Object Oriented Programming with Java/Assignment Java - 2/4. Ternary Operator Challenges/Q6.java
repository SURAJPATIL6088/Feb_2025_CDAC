import java.util.Scanner;

class Q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int answer = (num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3)? num2 : num3;
		System.out.println("Largest Number is "+answer);
	}
}