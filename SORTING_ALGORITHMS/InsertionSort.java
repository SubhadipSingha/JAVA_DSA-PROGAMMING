package SORTING_ALGORITHMS;

public class InsertionSort {
    public static void display(int arr[])
    {
        for(int i =0 ; i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {8,7,9,3,4,2,1};
        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        display(arr);
    }
}
