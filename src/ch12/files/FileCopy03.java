package ch12.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy03 {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        Path original = Path.of("temp/video.mp4");
        Path target = Path.of("temp/copy_video.mp4");
        // 원본 파일을 타겟 파일로 카피하는데 이미 있을경우 덮어쓰기를 해라
        Files.copy(original, target, StandardCopyOption.REPLACE_EXISTING);

        long endTime = System.currentTimeMillis();
        System.out.println("총 소요 시간 = " + (endTime - startTime) + "ms");
        
    }
}
