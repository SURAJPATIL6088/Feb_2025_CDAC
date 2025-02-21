import java.util.Scanner;

class Calculate_the_Area_of_a_Circle {
    public static void main(String args[])
    {        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int radius = sc.nextInt();

        double Area = Math.PI * (radius * radius);
        System.out.println("Area of the circle: "+Area);
    }
}