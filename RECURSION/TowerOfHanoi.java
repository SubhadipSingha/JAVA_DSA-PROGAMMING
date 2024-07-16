package RECURSION;

public class TowerOfHanoi {
    public static void hanoi(int n,String src,String dest,String helper){
        if(n==1){
            System.out.println("DISK NO "+n+" TRANSFERED FROM "+src+" TO "+dest);
            return;
        }  
         hanoi(n-1,src,dest,helper);
         System.out.println("DISK NO "+n+" TRANSFERED FROM "+src+" TO "+dest);
        hanoi(n-1, helper, src, dest);
        }
        
    public static void main(String args[]){
        int n = 4;
        hanoi(n,"s","d","h");
    }    
}

