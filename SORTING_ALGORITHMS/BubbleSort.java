package SORTING_ALGORITHMS;

public class BubbleSort {
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
            for(int j=0; j<arr.length - i-1; j++){
                //swaping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      display(arr);

    }
}
