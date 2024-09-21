package JavaIOStream;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;



class producer extends  Thread{
    OutputStream os;
    public producer(OutputStream o){
        os = o;
    }
    public void run(){
        int count = 1 ;
        while (true) { 

            try {
                os.write(count);
                os.flush();
                System.out.println("Producer: "+count);
                System.out.flush();
                Thread.sleep(10);
                count++; 
               
            } catch (Exception e) {
            }
            
        }

    }

}


class consumer extends  Thread{
    InputStream Is;
    public consumer( InputStream I){
        Is = I;
    }
    public void run(){
        int x;
        while (true) { 

            try {
                x = Is.read();
                System.out.println("Consumer: "+x);
                System.out.flush(); 
                Thread.sleep(10);
            } catch (Exception e) {
            }
            
        }

    }

}



public class ProducerAndCosumerUsingPipelineStream {
    public static void main(String[] args) throws  Exception{
       PipedOutputStream pos = new PipedOutputStream();
       PipedInputStream pis = new PipedInputStream();
       pos.connect(pis);
        producer p = new producer(pos);
        consumer c = new consumer(pis);
        p.start();
        c.start();
    }
}
