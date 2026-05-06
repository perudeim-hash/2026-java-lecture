package ch12.files.answer.ex06;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Answer06_1 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("temp/images");
        int count = 0;

        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
        for (Path path : stream) {
            if (Files.isRegularFile(path)) {
                String fileName = path.getFileName().toString().toLowerCase();
                if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")) {
                    count += 1;
                }
            }
        }
        System.out.println("이미지 파일 개수 : " + count);
        stream.close();

    }
}
