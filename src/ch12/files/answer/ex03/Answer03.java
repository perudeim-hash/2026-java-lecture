package ch12.files.answer.ex03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;


public class Answer03 {
    public static void main(String[] args) throws IOException {
        File directory = new File("temp/images");
        System.out.println("directory = " + directory);
        boolean directoryCreated = directory.mkdir();
        System.out.println("directory Created = " + directoryCreated);
        String suffix = ".jpeg";
        Path path = Path.of("temp/.");
        Path movePath = Paths.get("temp/images");
        Stream<Path> pathStream = Files.list(path);
        List<Path> list = pathStream.toList();
        pathStream.close();
        for (Path p : list) {
            String filename = p.getFileName().toString();
            boolean fileTrue = filename.endsWith(suffix);
            if (fileTrue) {
                Path target = movePath.resolve(filename);
                Files.move(p, target);
                System.out.println(".jpeg가 이동 했습니다 : " + target);
            }

        }
    }
}
