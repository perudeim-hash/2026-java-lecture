package ch12.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReaderWriterMain01 {
    public static void main(String[] args) throws IOException {
        // 파일 쓰기
        String writerString = "ABC";
        byte[] writerBytes = writerString.getBytes(StandardCharsets.UTF_8);
        System.out.println("writerString = " + writerString);
        System.out.println("writerBytes = " + Arrays.toString(writerBytes));
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.txt");
        fileOutputStream.write(writerBytes);
        fileOutputStream.close();

        // 파일 읽기
        FileInputStream fileInputStream = new FileInputStream("temp/hello.txt");
        byte[] readBytes = fileInputStream.readAllBytes();
        fileInputStream.close();
        String readString = new String(readBytes, StandardCharsets.UTF_8);
        System.out.println("readBytes = " + Arrays.toString(readBytes));
        System.out.println("readString = " + readString);

    }
}
