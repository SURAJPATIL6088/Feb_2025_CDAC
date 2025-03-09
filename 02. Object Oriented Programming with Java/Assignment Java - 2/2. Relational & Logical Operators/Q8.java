import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean s1 = sc.nextBoolean();
        boolean s2 = sc.nextBoolean();
        boolean s3 = sc.nextBoolean();

        if((s1 && s2) || (s1 && s3) || (s2 && s3))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}
