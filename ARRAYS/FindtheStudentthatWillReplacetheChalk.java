package ARRAYS;

public class FindtheStudentthatWillReplacetheChalk {
   
    public static int chalkReplacer(int[] chalk, int k) {
       long TotalChalk = 0 ;
        for(int a : chalk){
            TotalChalk +=a;
        }
        int remain = (int) (k % TotalChalk);
        // System.out.println(k+" % "+TotalChalk+" "+remain);
        for (int i = 0; i < chalk.length; i++) {
            if( remain < chalk[i]) return i;
            else remain -= chalk[i];
        }
        return 0;
    }
   
    public static void main(String[] args) {
       int chalk[] = {3,4,1,2}, k = 25;
       System.out.println(chalkReplacer(chalk, k));
    }
}
