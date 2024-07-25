package FRAMEWORK_COLLECTION.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDqueue{
    public static void main(String[] args) {
            ArrayDeque<Integer> a = new ArrayDeque<>();
            a.add(20);
            a.add(30);
            a.add(60);
            a.add(100);
            a.forEach((x)->System.out.println(x));
    }
}