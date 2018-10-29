package main.java;

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int size = 0;
        boolean results[] = new boolean [count];
        for(int i=0;i<count;i++) {
            size = s.nextInt();
            int arr[][] = new int [size][size];
            for(int j=0;j<size;j++)
            {
                for(int k=0;k<size;k++)
                {
                    arr[j][k] = s.nextInt();
                }
            }
            results[i]=xSymm(arr);
        }
        for(int i=0;i<count;i++) {
            System.out.println(results[i]);
        }
    }

    public static boolean xSymm(int arr[][]){
        int midPoint = arr.length/2;

        for(int i=0;i<arr.length;i++)
        {
            for(int p=0,q=arr.length-1;p<midPoint;p++,q--)
            {
                if(arr[p][i] != arr[q][i] || arr[i][p]!=arr[i][q])
                    return false;
            }

        }
        return true;
    }
}
