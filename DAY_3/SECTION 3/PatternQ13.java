class PatternQ13 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(i);
                if(i != 1 && j != i-1)
                {
                    System.out.print("*");
                }   
            }

            System.out.println();
        }

        for(int i=n; i>=1; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(i);
                if(i != 1 && j != i-1)
                {
                    System.out.print("*");
                } 
            }

            System.out.println();
        }
    }
}