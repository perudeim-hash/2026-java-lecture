package ch12.etc;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PrintStreamMain {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("temp/print.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);
        printStream.println("hello java");
        printStream.println(10);
        printStream.println(true);
        printStream.printf("hello %s", "Spring");
        printStream.close();

        FileInputStream fileInputStream = new FileInputStream("temp/print.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            stringBuilder.append((char) ch);
        }
        inputStreamReader.close();
        System.out.println(stringBuilder);
    }
}
