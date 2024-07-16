package ARRAYS;

public class MaximumAscendingSubarray {


    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,8};
        int sum =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    sum += arr[i];
                }else if(arr[j]<arr[j+1]){
                    return;
                }
            } System.out.println(sum);

        }
       
       

    }

    
}
