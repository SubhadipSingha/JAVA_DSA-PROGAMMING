package ARRAYS;

public class ReveseAnArray {
    public static void reverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void minimum(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i+2])
            System.out.print(arr[i]+" ");
        } 
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
       minimum(arr);
    }
}
