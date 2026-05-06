package ch12.files.answer.ex01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Answer01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String nowTime = dateTime.format(formatter);
        Path original = Path.of("temp/one.jpeg");
        Path target = Path.of("temp/Answer/",nowTime+".jpeg");
        Files.move(original, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
