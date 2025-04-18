public class LargestDigit {
    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        System.out.println("Largest digit: " + largestDigit);
    }
}
