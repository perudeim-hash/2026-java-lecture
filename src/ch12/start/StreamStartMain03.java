package ch12.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain03 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("temp/hello.txt");
        // append의 디폴트값은 false인데 true로 바꿀 경우 글자가 추가된다(복사가 된다?)
        byte[] input = {66, 67, 68,1,2,3,4,5,6,7,8,9,0};
        fos.write(input);
        fos.close();
        FileInputStream fis = new FileInputStream("temp/hello.txt");
        byte[] buffer = new byte[10];
        int readCount = fis.read(buffer);
        System.out.println("readCount = " + readCount);
        System.out.println(" = " + Arrays.toString(buffer));
        fis.close();
    }
}
