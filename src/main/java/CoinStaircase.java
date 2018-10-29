package main.java;

public class CoinStaircase {
    public static void main(String args[])
    {
        int n=15;
        int sum=0;
        int row=0;
        while(sum<=n)
        {
            sum = sum+(row+1);
            row++;
            System.out.println( row);
        }
        System.out.println( row-1);
    }
}
