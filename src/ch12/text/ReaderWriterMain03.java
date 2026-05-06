package ch12.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriterMain03 {
    public static void main(String[] args) throws IOException {
        String writerString = "abc";
        System.out.println("writerString = " + writerString);
        // 파일 쓰기
        FileWriter fileWriter = new FileWriter("temp/hello.txt", StandardCharsets.UTF_8);
        fileWriter.write(writerString);
        fileWriter.close();

        // 파일 읽기
        FileReader fileReader = new FileReader("temp/hello.txt", StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        int ch;
        while ((ch = fileReader.read()) != -1) {
            stringBuilder.append((char) ch);
        }
        fileReader.close();
        System.out.println("stringBuilder = " + stringBuilder);

    }
}
