import java.util.Scanner;

class Celsius_to_Fahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius : ");
        int celsius = sc.nextInt();

        double Fahrenheit = (celsius * 9/5) + 32;

        System.out.print(celsius + "°C is equal to " + Fahrenheit + "°F");
    }
}