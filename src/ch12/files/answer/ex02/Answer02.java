package ch12.files.answer.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Answer02 {
    public static void main(String[] args) throws IOException {
        Path original = Path.of("temp/photo.jpg");
        boolean originalTrue = Files.exists(original);

        if (originalTrue) {
            String filename = original.getFileName().toString();
            // test 까지 잘라둔거
            String baseName = filename.substring(0,filename.lastIndexOf("."));
            // 확장자
            String extension = filename.substring(filename.lastIndexOf("."));

            Path targetDir = Path.of("temp");
            Path target = targetDir.resolve(filename);

            int count = 1;

            while (Files.exists(target)) {
                String newName = baseName + "(" + count + ")" + extension;
                target = targetDir.resolve(newName);
                count++;
            }
            System.out.println("새로운 파일이 생성됐습니다. : " + Files.copy(original, target));

        }
    }
}
