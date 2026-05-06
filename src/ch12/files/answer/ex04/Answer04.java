package ch12.files.answer.ex04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Answer04 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp/memo.txt");
        List<String> lines = Files.readAllLines(path);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + " : " + lines.get(i));
        }
    }
}
