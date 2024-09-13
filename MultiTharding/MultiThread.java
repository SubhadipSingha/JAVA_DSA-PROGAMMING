package MultiTharding;



public class MultiThread extends  Thread {

    public void run(){
        int i = 1;
        while (true) { 
            System.out.print("\tAnother Methode");
            i++;
        }
    }

    public static void main(String[] args) {
       MultiThread t = new MultiThread();
       t.start();
        int i = 1;
        while (true) { 
            System.out.println("Normal Main class");
            i++;
        }
    }
}
