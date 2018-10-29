package main.java;

import java.util.Scanner;

public class PlayfulString {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        String strings[] = new String[count];
        String results[] = new String [count];
        for(int i=0;i<count;i++) {
            strings[i] = s.next();
            for(int j=0;j<strings[i].length()-1;j++)
            {
                if(strings[i].charAt(j)-strings[i].charAt(j+1)==-1||strings[i].charAt(j)-strings[i].charAt(j+1)==1)
                {
                    results[i] = "YES";
                }
                else
                {
                    results[i] = "NO";
                    break;
                }
            }
        }
        for(int i=0;i<count;i++) {
            System.out.println(results[i]);
        }
    }

}
