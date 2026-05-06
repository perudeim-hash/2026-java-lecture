package ch12.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriterMain04 {
    public static void main(String[] args) throws IOException {
        String writerString = "abc\n가나다";
        System.out.println("===writerString=== ");
        System.out.println(writerString);
        // 파일 쓰기
        FileWriter fileWriter = new FileWriter("temp/hello.txt", StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 1024);
        bufferedWriter.write(writerString);
        bufferedWriter.close();

        // 파일 읽기
        FileReader fileReader = new FileReader("temp/hello.txt", StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        fileReader.close();

        System.out.println("===read String===");
        System.out.println(stringBuilder);

    }
}
