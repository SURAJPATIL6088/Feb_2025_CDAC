import java.util.Scanner;

class Q22{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter an Operator : ");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
			case '+':{
				System.out.println("Addition of (a+b) : "+(a+b));
				break;
			}
			case '-':{
				System.out.println("Subtraction of (a-b) : "+(a-b));
				break;
			}
			case '*':{
				System.out.println("Multiplication of (a*b) : "+(a*b));
				break;
			}
			case '/':{
				System.out.println("Divison of (a/b) : "+(a/b));
				break;
			}
			
			default:{
				System.out.println("Enter Valid Operator..");
			}
		}	
	}
}