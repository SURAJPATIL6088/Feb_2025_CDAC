import java.util.Scanner;

class Q19{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		String answer = (ch >= 'a' && ch <= 'z') ? "Lowercase Letter" : (ch >= 'A' && ch <= 'Z') ? "Uppercase Letter": "Not a letter";
		System.out.println(answer);
	}
}