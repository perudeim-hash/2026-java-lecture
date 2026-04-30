package ch12.buffer;

import java.io.FileInputStream;
import java.io.IOException;

import static ch12.buffer.BufferedConstant.BUFFER_SIZE;
import static ch12.buffer.BufferedConstant.FILE_NAME;

public class ReadFile02 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] buffer = new byte[BUFFER_SIZE];
        int fileSize =0;
        int size = 0;
        long startTime = System.currentTimeMillis();

        while ((size = fis.read(buffer)) != -1) {
            fileSize += size;
        }
        fis.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + FILE_NAME);
        System.out.println("File Size : " + (fileSize / 1024 / 1024) + "mb");
        System.out.println("파일을 읽는 것 까지 걸린 시간 : " + (endTime - startTime) + "ms");

    }

}
