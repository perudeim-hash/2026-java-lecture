package ch12.files.answer.ex01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Answer01_1 {
    public static void main(String[] args) throws IOException {
        Path uploadFile = Path.of("temp/cat.jpeg");
        String fileName = uploadFile.getFileName().toString();
        String name = fileName.substring(0, fileName.lastIndexOf("."));
        String ext = fileName.substring(fileName.lastIndexOf("."));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String newName = LocalDateTime.now().format(formatter);

        Path target = uploadFile.getParent().resolve(name + "_" + newName + ext);

        Files.move(uploadFile, target);

    }
}
