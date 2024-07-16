package JAVA_OBJECTS.OOP;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Objects o1 = new Objects("chop");
        Objects[] friz = {o1};
        System.out.println(friz[0].name);
    }
}
