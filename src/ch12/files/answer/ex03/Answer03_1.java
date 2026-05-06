package ch12.files.answer.ex03;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Answer03_1 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("temp");
        Path imageDir = Paths.get("temp/images");
        Files.createDirectories(imageDir);
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
        for (Path file : stream) {
            String fileName = file.getFileName().toString();
            if (fileName.endsWith(".jpg")) {
                Path target = imageDir.resolve(file.getFileName());
                Files.move(file, target);
            }
        }
        stream.close();

    }
}
