class Q25{
	public static void main(String args[]) {
		
		int num = 1256;
		System.out.println(num+" Number Before Reverse");
		
		int answer = 0;
		
		while(num > 0){
			int last = num % 10;
			answer = last + answer * 10;
			num = num / 10;
		}
		
		System.out.println(answer+" Number After Reverse");
	}
}