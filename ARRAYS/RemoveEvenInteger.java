package ARRAYS;

public class RemoveEvenInteger {

   static void printarray(int[] arr){
    for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");
    }
    System.out.println();

   }
   static int[]  removeeven(int[] arr){
    int cout=0;
    for (int index = 0; index < arr.length; index++) {
        if (arr[index]%2 != 0 ) {
            cout++;
        } 
    }
    int[] result = new int[cout];
    int idx=0;
    for(int i=0;i<arr.length;i++){
        if (arr[i]%2 != 0 ) {
            result[idx] = arr[i];
            idx++;
        }
    }
    return result;
   }
   
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
       int[] ans = removeeven(arr);
        printarray(arr);
        printarray(ans);
    }
}
