package SORTING_ALGORITHMS;
public class CheckTheOrder{

public static void main(String[] args) {
    int[] arr = {1,2,3,4,6,7,5,9,10};
    String order = "";
    int count = 0;
    for(int i= 0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            order = "assending";
            if(order == "assending"){
                count+=1;
            }
        }else if(arr[i]>arr[i+1]){
            order= "dessending";
            if(order == "dessending"){
                count-=1;
            }
        }
        System.out.println("THE ORDER BETWEEN INDEX "+i+" AND "+(i+1)+" IS "+order);
    }
    if(count == arr.length-1){
        System.out.println("THE ORDER IS STRICTLY INCREASING");
    }else{System.out.println("THE ORDER IS NOT STRICTLY INCREASING");}

}


}