class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 45;
        int num3 = 22;

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("The largest number is "+num1);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("The largest number is "+num2);
        }
        else
        {
            System.out.println("The largest number is "+num3);
        }
    }
}
