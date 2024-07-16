package ARRAYS;

public class CheckmaxLengthOfSubArrayOnitsOrder {
    public static int MaxLength(int[] arr){
       int decrease =1;
       int increase = 1;
       int Maxcount = 1;
        for (int i = 0; i < arr.length-1; i++) {
        if (arr[i] < arr[i+1]) {
            increase++;
            decrease = 1; 
        }else  if (arr[i] > arr[i+1]) {
            increase = 1;
            decrease++; 
        } else{
            increase =  1;
            decrease = 1; 
        }
        Maxcount = Math.max(Maxcount, Math.max(increase,decrease));
       }
       return Maxcount;
        
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int result = MaxLength(arr);
        
            System.out.print(result);

    }
}
