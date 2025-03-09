import java.util.Scanner;

class Q16{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		String answer = (num >= 0) ? (num == 0) ? "Zero" : "Positive Number" : "Negative Number";
		System.out.println(answer);
	}
}