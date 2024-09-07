package ARRAYS;

public class CountAlmostEqualPairsI{
    
    public static int countparis(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int c = nums[i];
            int n = nums[i + 1];

            if (c == n) {
                count++;
            } else {
                String cr = Integer.toString(c);
                String nr = Integer.toString(n);

                // Check if both numbers have the same length
                if (cr.length() == nr.length() && cr.length() == 2) {
                    // Swap digits of cr and check if it equals nr
                    String swapped = cr.charAt(1) + "" + cr.charAt(0);
                    if (swapped.equals(nr)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int nums[] = {3, 12, 30, 17, 21};
        System.out.println(countparis(nums));  // Output should be 2
    }
}
