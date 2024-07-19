package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TWODArraylist {
    static void Show(int n){
        if(n%2==0){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocery = new ArrayList<>();
        ArrayList<String> packagefood =new ArrayList<>();
        ArrayList<String> vegetables =new ArrayList<>();
        ArrayList<String> drinks =new ArrayList<>();
        ArrayList<Integer> All =new ArrayList<>(List.of(21,30,41,50,61,70,85));
        packagefood.add("maggie");
        packagefood.add("kurkure"); 
        packagefood.add("soyabin");
        vegetables.add("tomatoes");
        vegetables.add("spinach");
        vegetables.add("carrots");
        drinks.add("coffee");
        drinks.add("chai");

        grocery.add(packagefood);
        grocery.add(vegetables);
        grocery.add(drinks);
        //printing the full 2d arraylist
        System.out.println(grocery);
        //printing a specific list of that 2d arraylist
        System.out.println(grocery.get(0));
        //printing a specfic item from a arraylist inside the 2d arraylist
        System.out.println(grocery.get(0).get(0));

        //checks whether the elemeent is there or not 
        System.out.println(All.contains(100-20));
        
        All.forEach(n->Show(n));

       
         
        for(int i=0;i<All.size()-1;i++){
            
             All.listIterator(i);
            
        }
        System.out.println(All);}
    }
    
    //    for(ListIterator<Integer> it = new ListIterator(); it.hasNext();){
    //         System.out.println(it.next());
    //      }

  

