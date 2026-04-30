package ch12.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static ch12.buffer.BufferedConstant.*;

public class ReadFile03 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int fileSize = 0;
        int data = 0;
        long startTime = System.currentTimeMillis();

        while ((data = bis.read()) != -1) {
            fileSize++;
        }

        fis.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + FILE_NAME);
        System.out.println("File Size : " + (fileSize / 1024 / 1024) + "mb");
        System.out.println("파일을 읽는 것 까지 걸린 시간 : " + (endTime - startTime) + "ms");

    }

}
