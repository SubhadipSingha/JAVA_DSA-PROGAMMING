package ARRAYS;

public class MergeTwoArray {
    
        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
                    //merging the array
                    int idx = m + n;
                    
                    int[] arr = new int[idx];
                    for(int i=0;i<m;i++){
                        arr[i] = nums1[i];
                    }
                    for(int i=0;i<n;i++){
                        arr[i+m] = nums2[i];
                    }
                    for(int i=0;i<arr.length-1;i++){
                       
                        for(int j=0;j<arr.length - i -1;j++){
                          
                          if(arr[j]>arr[j+1]){
                            int temp = arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1] = temp;
                          }

                        }
                        
                    }

                    return arr;
                   
                }
            
        
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
       int[] result = merge(nums1,m,nums2,n);
       for(int i=0 ; i<result.length;i++){
        System.out.print(" "+result[i]);
       }

    }
}
