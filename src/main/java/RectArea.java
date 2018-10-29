package main.java;
import java.util.*;





class RectArea {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        if (count >= 2) {
            int arr[] = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = s.nextInt();
            }
            int maxProd = 0;
            for (int i = 0; i < count - 1; i++) {
                for (int j = i + 1; j < count; j++) {
                    if ((arr[i] * arr[j]) > maxProd) {
                        maxProd = arr[i] * arr[j];
                    }
                }
            }
            System.out.println(maxProd);
        }
    }
}