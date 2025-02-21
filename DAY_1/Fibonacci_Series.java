class Fibonacci_Series {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        
        for(int i=0; i<10; i++)
        {
            System.out.print(a + " "); 
            int next = a + b;
            a = b;
            b = next;         
        }

    }
}
// a = 0->1->1->2
// b = 1->0+1->1+1->