package FRAMEWORK_COLLECTION.Hashing;

public class RemoveDuplicatemorethan2 {
    public static int duplicateRemove(int[] nums){
      if(nums.length < 2){
        return nums.length;
      }
        int index = 2;
        for(int i = 2 ; i < nums.length ; i ++){
            
            if(nums[i] != nums[index - 2]){
                nums[index] = nums[i];
                index++;
            }
           
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(duplicateRemove(nums));
    }
}
