
class Q3{
	public static void main(String args[]) {
		System.out.println("Sum of digits");
		
		int num = 134;
		int sum = 0;
		while(num > 0)
		{
			int last = num % 10;
			sum = sum + last;
			num = num / 10;
		}

		System.out.println("Sum of digits of 134 : "+sum);
	}
}