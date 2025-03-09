import java.util.Scanner;

class Q17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();

		String answer = (num1 < num2)
				? (num1 < num3) ? (num1 < num4) ? "num 1" : "num 4" : (num3 < num4) ? "num 3" : "num 4"
				: (num2 < num3) ? (num2 < num4) ? "num 2" : "num 4" : "num 1";
		System.out.println(answer);
	}
}