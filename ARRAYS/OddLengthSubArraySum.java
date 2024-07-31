package ARRAYS;

public class OddLengthSubArraySum {
    public static int sumOddLength(int[] arr){
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            int s = n - i;
            int e = i + 1;
            int total = s * e;
            int odd = total/ 2;
            if (total % 2 != 0) {
                odd++;
            }
            sum += odd * arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1};
        System.out.println(sumOddLength(arr1));
    }
}
