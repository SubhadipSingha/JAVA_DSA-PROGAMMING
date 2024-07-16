package BIT_MANIPULATION;

public class Getbit {
    public static void main(String[] args) {
        int n =5;
        int pos =2;
        //step 1
        int bitmask = 1 <<pos;
        //step 2
        int newnumber = (bitmask & n);
        System.out.println(newnumber);
    }
}
