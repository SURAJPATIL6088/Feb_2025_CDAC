class Q11{
	public static void main(String args[]) {
		System.out.println("Check Power of 2");
		int num = 30;
		
		
        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is a Power of 2");
        } else {
            System.out.println(num + " is not a Power of 2");
        }		
	}
}