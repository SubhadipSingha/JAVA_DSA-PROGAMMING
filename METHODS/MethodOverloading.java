package METHODS;

public class MethodOverloading {
    public static void main(String[] args) {
        int x = 5;
        int y= 5;
        int z = 5;

        System.out.println(add(x,y));
        System.out.println(add(x,y,z)); 

    }
    static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
}
