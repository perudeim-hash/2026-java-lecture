package ch12.start;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.txt",true);
        // append의 디폴트값은 false인데 true로 바꿀 경우 글자가 추가된다(복사가 된다?)
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.write(70);
        fos.write(100);
        fos.close();
        FileInputStream fis = new FileInputStream("temp/hello.txt");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());

        fis.close();


    }
}
