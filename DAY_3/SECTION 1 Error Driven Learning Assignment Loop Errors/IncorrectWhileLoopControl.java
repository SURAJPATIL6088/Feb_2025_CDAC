public class IncorrectWhileLoopControl {
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}

// in condition assignment operator is used we have to use (>=)

public class IncorrectWhileLoopControl {
    public static void main(String[] args) { 
        int num = 10; 
        while (num >= 0) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}

// Output :
/*
10
9
8
7
6
5
4
3
2
1
0 
*/