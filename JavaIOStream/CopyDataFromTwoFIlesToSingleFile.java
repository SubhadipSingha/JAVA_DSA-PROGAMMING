package JavaIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyDataFromTwoFIlesToSingleFile {
    public static void main(String[] args) {
        try(FileInputStream fi1 = new FileInputStream("D:\\output of io stream\\outputclone.txt");
        FileInputStream fi2 = new FileInputStream("D:\\\\output of io stream\\\\output.txt");
        FileOutputStream fo = new FileOutputStream("D:\\output of io stream\\plustwo.txt");
        SequenceInputStream sis = new SequenceInputStream(fi1,fi2)) {
           int b;
           while((b = sis.read()) !=-1 ){
            fo.write(b);
            
           }
        fi1.close(); fi2.close(); fo.close(); sis.close();

        } catch (Exception e) {
        }
        
    }
}
