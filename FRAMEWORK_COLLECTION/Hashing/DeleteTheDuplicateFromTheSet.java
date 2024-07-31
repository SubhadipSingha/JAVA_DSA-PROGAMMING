import java.util.HashSet;

public class DeleteTheDuplicateFromTheSet {
    public static HashSet<Integer> DeleteTheDuplicate(int[] nums){
       HashSet<Integer> hs= new HashSet<>();
       for(int n: nums){
        hs.add(n);
       }
       
        return hs;
        
    }
    
    
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,1,2,1};
        System.out.println(DeleteTheDuplicate(nums));
    }
}
