package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FIndTheIndexOfAnSpeficItem {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocery = new  ArrayList<>();
        Scanner s=new Scanner(System.in);
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


        System.out.println("HERE IS ALL THE ITEMS YOU HAVE IN THE CART:"+grocery);
        System.out.println("NOW ENTER A ITME TO FIND WHERE IT IS IN:");
        String item = s.nextLine();
        for(int i=0;i<grocery.size();i++){
            for(int j=0;j<grocery.get(i).size();j++){
            if(grocery.get(i).get(j).equals(item)){
                  System.out.println("index for this "+item+" is "+i+" and "+j);
            }
        }
        }
    }
}
