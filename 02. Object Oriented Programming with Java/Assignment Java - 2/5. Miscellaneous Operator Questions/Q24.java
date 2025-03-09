
class Q24{
	public static void main(String args[]) {
		System.out.println("Even Numbers using Bitwise AND");
		
		int num = 100;
		
		for(int i=1; i<=100; i++){
		
			if((i & 1) == 0)
			{
				System.out.println(i+ " is Even Number");
			}
		}
	}
}