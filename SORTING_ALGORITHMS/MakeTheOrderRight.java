package SORTING_ALGORITHMS;

public class MakeTheOrderRight {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,2,0,0,3,1,2,0};
        //bubble sort
        // for(int i=0;i<arr.length - 1;i++){
        //     for(int j=0;j<arr.length - 1 -i;j++){
        //         //if(arr[j+1]<arr[j])
        //         if(arr[j]>arr[j+1]){
        //         int temp = arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1] = temp;
        //     }
        //     }
        //    // display(arr);
        // }

       for(int i=0; i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++)
        {
            int small = i;
            if(arr[small]>arr[j]){
                small = j;
            }
            int temp = arr[small];
            arr[small]=arr[i];
            arr[i] = temp;
        }
       }



        display(arr);
    }
}
