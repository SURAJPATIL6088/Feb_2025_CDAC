public class LoopVariableScope {
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
}

// Error 
/*

LoopVariableScope.java:6: error: cannot find symbol
        System.out.println(x); // Error: 'x' is not accessible here
                           ^
  symbol:   variable x
  location: class LoopVariableScope

*/

public class LoopVariableScope {
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
            System.out.println(x);
        } 
    } 
}

// Output:
/*
0
2
4
6
8
*/