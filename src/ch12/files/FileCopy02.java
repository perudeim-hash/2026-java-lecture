package ch12.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy02 {
    public static void main(String[] args) throws IOException {

        String fileName = "temp/video.mp4";
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream("temp/copy_video.mp4");
        // 파일 inputStream을 받아서 한번에 OutputStream으로 보내줄 수 있다.
        fileInputStream.transferTo(fileOutputStream);

        fileInputStream.close();
        fileOutputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("총 소요 시간 = " + (endTime - startTime) + "ms");
        
    }
}
