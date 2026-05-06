package ch12.files.answer.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Answer02_1 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("temp/");
        String fileName = "photo.jpg";
        String name = fileName.substring(0, fileName.lastIndexOf("."));
        String ext = fileName.substring(fileName.lastIndexOf("."));

        Path target = dir.resolve(fileName);

        int count = 1;

        while (Files.exists(target)) {
            String newName = name + "(" + count + ")" + ext;
            target= dir.resolve(newName);
            count++;
        }
        Files.createFile(target);
        System.out.println("저장 파일명 = " + target.getFileName());

    }
}
