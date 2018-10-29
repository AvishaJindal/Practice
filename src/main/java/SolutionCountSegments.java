package main.java;

//Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
public class SolutionCountSegments {
    public int countSegments(String s) {
        if (s != null && !"".equals(s.trim())) {
            String arr[] = s.trim().split(" +");
            return arr.length;
        }
        return 0;
    }
}
