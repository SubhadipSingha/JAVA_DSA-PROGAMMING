package ArrayList;

import java.util.ArrayList;

public class TWODArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocery = new ArrayList<>();
        ArrayList<String> packagefood =new ArrayList<>();
        ArrayList<String> vegetables =new ArrayList<>();
        ArrayList<String> drinks =new ArrayList<>();

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
    }
    
}
