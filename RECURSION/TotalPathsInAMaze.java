package RECURSION;

public class TotalPathsInAMaze {
    public static int PRintcount(int i,int j,int n,int m) {
    //base case
    if(i==n-1&&j==m-1){
        return 1;
    }
    if(i==n||j==m){
        return 0;
    }
    int downwardcount = PRintcount(i,j+1,n,m);
    int sidewisecount = PRintcount(i+1,j,n,m);
    return downwardcount + sidewisecount;
    
    }
    public static void main(String[] args) {
        int n = 5 , m =2 ;
        System.out.println(PRintcount(0, 0, n, m));
    }
}
