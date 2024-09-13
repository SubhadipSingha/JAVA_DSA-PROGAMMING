package MultiTharding;



class MyData{
    int value;
    boolean access = true;
    synchronized public void setvalue(int x){
        while(access!=true)try{wait();}catch(Exception e){}
        value = x;
        access= false;
        notify();
    }
    synchronized public int getvalue(){
        int x = 0;
        while(access!=false)try{wait();}catch(Exception e){}
        x = value;
        access= true;
        notify();
        return x;
    }
   
}

class producer extends Thread{

  MyData data;
  public producer(MyData d){
    data = d;
  }
  public  void run(){
    int count = 1; 
    while(true){
        data.setvalue(count);
        System.out.println("Producer: "+count);
        count++;
    }
  }

}
class consumer extends Thread{

    MyData data;
    public consumer(MyData d){
      data = d;
    }
    public  void run(){
      int count = 1; 
      while(true){
          int v = data.getvalue();
          System.out.println("Consumer: "+v);
          count++;
      }
    }
  
  }


public class InterThreadingCompunication {
    public static void main(String[] args) {
        MyData d = new MyData();
        producer p= new producer(d);
        consumer c= new consumer(d);
        p.start(); c.start();
    }
    
}
