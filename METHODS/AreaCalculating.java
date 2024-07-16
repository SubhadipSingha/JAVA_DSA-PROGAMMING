package METHODS;

public class AreaCalculating {
    static int calculatearea(int a ,int b){
        System.out.println("Rectangle Area =length:"+a+" X width:"+b+"=");
        int ans = a*b;
        return ans;
    }
    static float calculatearea(float base,float height){
          return 1f/2f*(base*height);
    }
    public static void main(String[] args) {
        System.out.println(calculatearea(2,3));
        System.out.println(calculatearea(10.2f, 12.5f));
    }
}
