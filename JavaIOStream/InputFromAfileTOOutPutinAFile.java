package JavaIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class InputFromAfileTOOutPutinAFile {
    public static void main(String[] args)  {
        try (FileOutputStream fo = new FileOutputStream("D:\\output of io stream\\outputclone.txt");
        FileInputStream fi = new FileInputStream("D:\\output of io stream\\output.txt")) {
         int b ;
         while((b = fi.read())!=-1){
            fo.write(b);
         }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
