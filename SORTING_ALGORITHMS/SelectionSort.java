package SORTING_ALGORITHMS;

public class SelectionSort {
    public static void display(int arr[])
    {
        for(int i =0 ; i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {7,8,2,1,3};
        //sorting 
        for(int i=0;i<arr.length - 1;i++){
           
            for(int j=i+1; j<arr.length; j++){
                //swaping
                 int big = i;
                if(arr[big]<arr[j]){
                    big = j;
                }
                int temp = arr[big];
                    arr[big] = arr[i];
                    arr[i] = temp;
            }
        }
      display(arr);
    }
}
