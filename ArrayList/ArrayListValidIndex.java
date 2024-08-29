package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListValidIndex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int e = sc.nextInt();
            list.add(e);
            System.out.println(list);
        }
        
    }
}
