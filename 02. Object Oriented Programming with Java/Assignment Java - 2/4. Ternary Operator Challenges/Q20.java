import java.util.Scanner;

class Q20{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int answer = (num < 0) ? (-(num)) : num;
		System.out.println("Absolute value of "+num+" is "+answer);
	}
}