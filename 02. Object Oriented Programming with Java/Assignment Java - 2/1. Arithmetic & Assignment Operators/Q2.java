
class Q2{
	public static void main(String args[]) {
		System.out.println("Even Odd using Bitwise");
		
		int num = 34;
		
		if((num & 1) == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}