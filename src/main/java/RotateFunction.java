package main.java;

import java.util.Arrays;

public class RotateFunction {


    public static void main(String args[])
    {
        int A[] = {4,3,2,6};
        System.out.println(maxRotateFunction(A));
    }
    public static int maxRotateFunction(int[] A) {
        int finalResult=0;
        for(int i=0;i<A.length;i++)
        {
            finalResult = finalResult + (A[i]*i);
        }

        int B[] = rotate(A);
        for(int x: B)
            System.out.println(x);
        System.out.println(B.equals(A));
        while(!Arrays.equals(A,B))
        {
            int sum=0;
            for(int i=0;i<B.length;i++)
            {
                sum = sum + (B[i]*i);
            }
            if(sum>finalResult)
            {
                finalResult =sum;
            }
            B=rotate(B);
        }
        System.out.println("finalResult: "+finalResult);
        return finalResult;
    }
    public static int[] rotate(int[] A)
    {
        int[] C = new int[A.length];
        int temp = A[A.length-1];
        for(int i=A.length-1;i>0;i--)
        {
            C[i]=A[i-1];
        }
        C[0]=temp;
        return C;
    }

}
