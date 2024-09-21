package ARRAYS;

public class MaximumMultiplicationScore {
    public static long maxScore(int[] a, int[] b) {
     long product = 0;
        for (int i = 1; i < a.length; i++) {
               if(b[i] > b[i-1]){
               product += a[i] * b[i-1];}
               System.out.println(a[i] +"*"+ b[i]+": "+product);

            
        }
        
        
        
        return product;
        
    }
    public static void main(String[] args) {
        int a[] = {3,2,5,6}, b[] = {2,-6,4,-5,-3,2,-7};
        System.out.println(maxScore(a, b));
    }
}
