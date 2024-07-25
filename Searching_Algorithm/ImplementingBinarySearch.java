package Searching_Algorithm;

public class ImplementingBinarySearch {
    public static int BinarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("middle: " + value);
			
			if(value < target) low = middle + 1;
			else if(value > target) high = middle - 1;
			else return middle; //target found
		}
		
		return -1;
	}
    public static void main(String[] args) {
        int[] nums =new int[10000000];
        int target = 7;
        for(int i = 0; i< nums.length;i++){
            nums[i] = i;
        }
        int index = BinarySearch(nums, target);
		
		if(index == -1) {
			System.out.println(target + " not found");
		}
		else {
			System.out.println("Element found at: " + index);
		}
    }
}
