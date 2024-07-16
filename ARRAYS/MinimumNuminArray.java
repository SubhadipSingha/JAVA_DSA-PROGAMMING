package ARRAYS;

public class MinimumNuminArray {

    public static int FindMin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
        
    }
    public static int FindSecondlargest(int[] arr) {
        int max = arr[0];
        int secmax = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }else if(arr[i]>secmax && arr[i]!=max){
                arr[i] = secmax;
            }
        }
        return secmax;
    }

    
    public static void main(String[] args) {
        int[] arr={9,3,4,2,53,6,8};
        System.out.println(FindMin(arr));
        System.out.println(FindSecondlargest(arr));
    }
}
