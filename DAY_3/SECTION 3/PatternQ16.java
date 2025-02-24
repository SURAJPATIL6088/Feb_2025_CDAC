class PatternQ16 {
    public static void main(String[] args) {
        int n = 5;

        for(int i =1; i<=n; i++)
        {
            for(int j =n-i; j>=1; j--)
            {
                System.out.print(" ");
            }

            for(int j=0; j<2*i-1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
