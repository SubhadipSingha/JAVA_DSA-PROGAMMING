package JavaIOStream;

import java.io.*;


public class FilewriteUsingIO {
    public static void main(String[] args) {
        try {
            try (FileOutputStream fos = new FileOutputStream("D:\\output of io stream\\output.txt")) {

             String s = "Hello io";
             byte[] b = s.getBytes();
             fos.write(b);

            } catch (FileNotFoundException e) {
                throw e;
            } catch (IOException e) {
               System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            
            System.out.println(e);
        }



    }
}
