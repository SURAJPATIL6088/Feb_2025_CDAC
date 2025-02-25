public class DoWhileLoop {
    public static void main(String[] args) 
    {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);

        System.out.println(i);
    }

    /*

    initialize i=1;

    Iteration 1:
    (1 < 5) true
    i++ 
    i = 2
     
    Iteration 2:
    (2 < 5) true
    i++ 
    i = 3
     
    Iteration 3:
    (3 < 5) true
    i++ 
    i = 4
     
    Iteration 4:
    (4 < 5) true
    i++ 
    i = 5

    Iteration 1:
    (4 < 5) false
    
    print(5)
     */

    // output
    // 1 2 3 4 5
}
