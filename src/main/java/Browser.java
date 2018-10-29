package main.java;

import java.util.Scanner;

public class Browser {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String websites[] = new String[count];
        String result[] = new String[count];
        for (int i=0;i<count;i++)
        {
            websites[i] = sc.next();
            String mainPart = websites[i].substring(4,websites[i].length()-4);
            System.out.println(mainPart);
            int consonants = 0;
            char[] letters = mainPart.toCharArray();
            for(char c: letters)
            {
                if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
                {
                    consonants++;
                }
            }
            result[i]=consonants+"/"+websites[i].length();
        }
        for (int i=0;i<count;i++)
        {
            System.out.println(result[i]);
        }
    }
}
