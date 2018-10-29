package main.java;

import java.util.*;

public class MajorityElement {
    public static void main(String args[]) {
        int n[] = {3,2,3};
        Map<Integer,Integer> majElement = new HashMap<Integer,Integer>();
        int count  = n.length/3;
        for(int i:n)
        {
            if(majElement.containsKey(i))
            {
                majElement.put(i,majElement.get(i)+1);
            }
                else
                {
                    majElement.put(i,1);
                }
        }
        System.out.println(majElement);
        List<Integer> list = new ArrayList();
        for(Map.Entry e:majElement.entrySet())
        {
            if((Integer)e.getValue()>count)
                list.add((Integer) e.getKey());
        }

             System.out.println(list);



    }
}
