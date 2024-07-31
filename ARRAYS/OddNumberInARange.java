package ARRAYS;

public class OddNumberInARange {
    public static int checkhowmanyoddno(int low , int high) {
        
        int count =0;
        // for(int i = low ; i<= high; i++ ){
        //     if(i%2 != 0){
        //         System.out.println("Odd NUmb: "+i);
        //         count++;
        //     }
        // }
        //another way
        int total = high - low + 1;
        count = total /2;
        if(low%2 != 0 && high%2 != 0){
            count++;
        }
        return count; 
        
    }
    public static void main(String[] args) {
        int low = 3 , high = 5;
        System.out.println(checkhowmanyoddno(low, high));
    }
}
