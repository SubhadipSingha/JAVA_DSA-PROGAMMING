package ARRAYS;

public class AddZeroAtTheEnd {

     public static int[] Removezero(int[] arr) {
        int [] ans = new int[arr.length];
        int ind =0;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]!=0){
                ans[ind] = arr[i];
                ind++;
            }
        }
        
        return ans;
     }


    public static void main(String[] args) {
        int[] arr ={1,0,3,0,4,0,5};
        int[] result = Removezero(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
