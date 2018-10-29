package main.java;

import java.util.Scanner;

public class StaircaseProb {

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        double A = (double)s.nextInt();
        double B = (double)s.nextInt();
        double N = (double)s.nextInt();

        if(A==N)
            System.out.println(1);
        else if(N%(A-B)==0.0)
        {
                System.out.println(N/(A-B));
        }
        else
        {
            double x = N/(A-B);
            int floorX = (int) Math.floor(x);
            if(A>=(N-(floorX-1)*(A-B)))
            {
                System.out.println((int) Math.floor(N/(A-B)));
            }
            else{
                System.out.println((int) Math.ceil(N/(A-B)));
            }
        }

    }
}
