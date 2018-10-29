package main.java;

import java.util.*;

public class SortRemoveDuplicate {

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < count; i++) {
            set.add(s.next());
        }
        List<String> strList = new ArrayList<>(set);
        Collections.sort(strList);
        System.out.println(strList.size());
        for(String str:strList)
        {
            System.out.println(str);
        }
    }
}
