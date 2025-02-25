public class NestedIncrement {
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    }
}

/*
initialize a = 10, b = 5
result = 11 * 5 - 10 + 4

Output 
49
*/
