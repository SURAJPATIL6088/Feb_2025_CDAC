class PatternQ21 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i <= n; i++) 
        {
            int num = 1;
            for (int j = 0; j < 2*i-1; j++) 
            {
                if(num % 2 != 0)
                {
                    System.out.print(j+1);
                }
                else
                {
                    System.out.print("*");
                }
                num = num + 1;
            }
            System.out.println();
        }
    }
}

// 1 
// 1*3 
// 1*3*5 
// 1*3*5*7 
// 1*3*5*7*9 