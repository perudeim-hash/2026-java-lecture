package ch12.buffer;

import java.io.FileOutputStream;
import java.io.IOException;

import static ch12.buffer.BufferedConstant.*;

public class CreateFile02 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        byte[] buffer = new byte[BUFFER_SIZE];
        int bufferIndex = 0;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < FILE_SIZE; i++) {
//            bufferIndex++;
            buffer[bufferIndex++] = 1;
            if (bufferIndex == BUFFER_SIZE) {
                fos.write(buffer);
                bufferIndex=0;
            }
        }
        if (bufferIndex > 0) {
            fos.write(buffer, 0, bufferIndex);
        }
        fos.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : " + FILE_NAME);
        System.out.println("File Created : " + FILE_SIZE);
        System.out.println("파일 생성까지 걸린 시간 : " + (endTime - startTime) + "ms");

    }
}
