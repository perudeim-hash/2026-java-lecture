package ch12.files.answer.ex08;


import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Answer08 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("temp");
        LocalDateTime limit = LocalDateTime.now().minusDays(7);
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
        for (Path path : stream) {
            if (Files.isRegularFile(path)) {
                LocalDateTime modifiedTime = Files.getLastModifiedTime(path)
                        .toInstant()
                        .atZone(ZoneId.systemDefault())
                                .toLocalDateTime();
                if (modifiedTime.isBefore(limit)) {
                    Files.delete(path);
                    System.out.println(path.getFileName() + "파일 삭제 완료.");
                }
            }
        }
    }
}
