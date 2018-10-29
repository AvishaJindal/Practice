package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OccurrenceCheck {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Map<Character,Integer> countMap = new HashMap<Character,Integer>();
        for(char c: arr)
        {
            if(countMap.containsKey(c))
            {
                countMap.put(c, countMap.get(c)+1);
            }
            else
                countMap.put(c, 1);
        }
        System.out.println(countMap);
        char c=Character.MIN_VALUE;
        int count=0;
        for(Map.Entry e: countMap.entrySet()){
                if((int)e.getValue()>count)
                {
                    c= (char)e.getKey();
                    count = (int)e.getValue();
                }
                else if((int)e.getValue()==count)
                {
                    count = (int)e.getValue();
                    if((char)e.getKey()<c)
                    {
                        c= (char)e.getKey();
                    }
                }
        }
        System.out.println(c+" "+count);
    }
}
