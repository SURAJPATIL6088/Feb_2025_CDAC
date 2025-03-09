import java.util.Scanner;

class Q18 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage : ");
		int percentage = sc.nextInt();

		String answer = (percentage >= 40 ) ? "Pass" : "Fail";
		System.out.println(answer);
	}
}