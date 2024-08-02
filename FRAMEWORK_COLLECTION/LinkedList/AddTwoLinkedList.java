package FRAMEWORK_COLLECTION.LinkedList;

import java.util.LinkedList;
import java.util.List;


    
    public class AddTwoLinkedList {
        public static void main(String[] args) {
            List<Integer> ans = new LinkedList<>();
            List<Integer> list = new LinkedList<>();
            list.add(2);
            list.add(4);
            list.add(3);
            System.out.println(list);
    
            List<Integer> list2 = new LinkedList<>();
            list2.add(5);  // Corrected: Adding elements to list2
            list2.add(3);
            list2.add(8);
            System.out.println(list2);  // Printing list2 to verify its contents
             int carry = 0 , lastdigit = 0 ;
            for(int i = 0 ; i < list.size(); i++){  // Using list.size() to iterate
                int temp = list.get(i) + list2.get(i);
                if(temp < 10){
                    carry = temp / 10;
                   lastdigit = temp % 10;
                }
                ans.add(temp);
            }
            System.out.println(ans);
        }
    }
    