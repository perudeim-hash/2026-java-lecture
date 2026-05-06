package ch12.text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReaderWriterMain02 {
    public static void main(String[] args) throws IOException {
        String writerString = "ABC";
        System.out.println("writerString = " + writerString);
        // 파일 쓰기
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8); // << 아웃풋스트림라이트는 단독으로 사용 불가
        outputStreamWriter.write(writerString);
        outputStreamWriter.close();

        // 파일 읽기
        FileInputStream fileInputStream = new FileInputStream("temp/hello.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            stringBuilder.append((char) ch);
        }
        inputStreamReader.close();
        System.out.println("ch = " + stringBuilder);


    }
}
