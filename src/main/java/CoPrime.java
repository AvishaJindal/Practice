package main.java;

import java.util.Scanner;

public class CoPrime {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();

        int arr[][] = new int[count][2];
        for (int i = 0; i < count; i++) {
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
        }
        int results[] = new int[count];
        for (int i = 0; i < count; i++) {
            int result = 0;
            int x = arr[i][0];
            int y = arr[i][1];
            int p=1,q=1;
            if(p==arr[i][0] && q==arr[i][1])
            {
                results[i]=result;
            }
            else
            {
                if(arr[i][0]<arr[i][1])
                {
                    while(p<arr[i][0])
                    {
                        p=p+q;
                        result++;
                    }
                    while(q<arr[i][1])
                    {
                        q=p+q;
                        result++;
                    }
                }
                else
                {
                    while(q<arr[i][1])
                    {
                        q=p+q;
                        result++;
                    }
                    while(p<arr[i][0])
                    {
                        p=p+q;
                        result++;
                    }
                }
            }
            results[i]=result;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(results[i]);
        }

    }
}
