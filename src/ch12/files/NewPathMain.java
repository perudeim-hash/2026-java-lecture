package ch12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class NewPathMain {
    public static void main(String[] args) throws IOException {

        Path path =  Path.of("temp/..");
        System.out.println("path = " + path);
        // 절대 경로
        System.out.println("absolute path = " + path.toAbsolutePath());

        // 정규 경로  <-- 요즘은 정규경로를 많이 사용한다.
        System.out.println("Canonical path = " + path.toRealPath());

        // 경로상에 존재하는 모든 것들을 리스트로 반환해라.
        Stream<Path> pathStream = Files.list(path);
        List<Path> list = pathStream.toList();
        pathStream.close();
        for (Path p : list) {
            System.out.println((Files.isRegularFile(p) ? "File" : "Directory ") + " / " + p.getFileName());

        }
    }
}
