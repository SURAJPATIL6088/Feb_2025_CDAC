import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character : ");
		char ch = sc.next().charAt(0);

        String answer = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Character is Vowel" : (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Character is Vowel" : "Character is Consonant";
        System.out.println(answer);
    }
}
