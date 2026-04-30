package ch12.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static ch12.buffer.BufferedConstant.*;
import static ch12.buffer.BufferedConstant.FILE_SIZE;

public class CreateFile03 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        byte[] buffer = new byte[BUFFER_SIZE];
        BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE); // 보조 스트림

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < FILE_SIZE; i++) {
            bos.write(1);
        }

        fos.close();
        long endTime = System.currentTimeMillis();

        System.out.println("File Created : " + FILE_NAME);
        System.out.println("File Created : " + FILE_SIZE);
        System.out.println("파일 생성까지 걸린 시간 : " + (endTime - startTime) + "ms");


    }

}
