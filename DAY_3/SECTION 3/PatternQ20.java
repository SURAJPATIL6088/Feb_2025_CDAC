class PatternQ20 {
    public static void main(String[] args) {
        int n = 5;
        

        for(int i=0; i<=n; i++)
        {
            int num = n;
            for(int j =0; j<i; j++)
            {
                if(i != 0 && j < i-1)
                {
                    System.out.print(num+"*");
                    num--;
                }
                else
                {
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }
}
// 5 
// 5*4 
// 5*4*3 
// 5*4*3*2 
// 5*4*3*2*1 