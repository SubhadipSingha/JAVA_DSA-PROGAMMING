package JavaIOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class StoringFloatNumbersInAFile {
    public static void main(String[] args) throws  Exception {
        FileOutputStream fos = new FileOutputStream("D:\\output of io stream\\floatarr.txt");
        FileInputStream fis = new FileInputStream("D:\\output of io stream\\floatarr.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        DataInputStream dis = new DataInputStream(fis);
       dos.writeInt(4);
       dos.writeFloat(10.2f);
       dos.writeFloat(11.2f);
       dos.writeFloat(12.2f);
       dos.writeFloat(13.2f);
       int length = dis.readInt();
       while(length > 0){
        System.out.println(dis.readFloat());
        length--;
       }
      dos.close();
      dis.close();
      fis.close();
      fos.close();

    }
}
