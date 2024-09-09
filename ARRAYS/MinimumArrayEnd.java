package ARRAYS;

public class MinimumArrayEnd {
 
    public static long minEnd(int n, int x) {
        long arr[] = new long[n] ;
        int count = 0;
        for(int j = x ; count < n ; j++){
            if((x & j) == x){
                arr[count] = j;
                count++;
            }
        }
        return arr[n-1];
        
    }
 
 
    public static void main(String[] args) {
        System.out.println(minEnd(3, 7));
    //    for (int i = 1; i < 10; i++) {
    //     int x =  7;
    //     System.out.println("For "+(x + i)+": "+( x & (x + i)));
    //    }
       System.out.println(7&16);
    }
}
