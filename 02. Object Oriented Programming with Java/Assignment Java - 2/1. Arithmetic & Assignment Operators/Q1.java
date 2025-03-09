
class Q1{
	public static void main(String args[]) {
		
		int a = 34;
		int b = 12;
		System.out.println("Before Swap "+a+", "+b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swap "+a+", "+b);
		
	}
}