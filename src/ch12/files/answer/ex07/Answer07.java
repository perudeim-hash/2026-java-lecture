package ch12.files.answer.ex07;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Answer07 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("temp");
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
        Path maxFile = null;
        long maxSize = 0;
        for (Path path : stream) {
            if (Files.isRegularFile(path)) {
                long size = Files.size(path);
                if (size > maxSize) {
                    maxSize = size;
                    maxFile = path;
                }
            }

        }

        stream.close();
        System.out.println("가장 큰 파일 : " + maxFile.getFileName() + " 이고 크기는 : " + (maxSize / 1024 / 1024) + "mb");


    }
}
