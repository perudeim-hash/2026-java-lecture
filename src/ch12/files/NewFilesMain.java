package ch12.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NewFilesMain {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("temp/example.txt");
        Path directory = Path.of("temp/exampleDir");
        // 파일이나 디렉토리 존재 여부
        System.out.println("Files exists = " + Files.exists(file));

        // 파일생성
        try {
            Files.createFile(file);
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println(file + " File already exists");
        }
        // 파일 삭제
//        Files.delete(file);
//        System.out.println("File deleted");

        // isRegularFile 파일인지 아닌지 boolean 으로 알려준다
        System.out.println("Is Regular File = " + Files.isRegularFile(file));

        // isDirectory 폴더인지 아닌지 boolean 으로 알려준다
        System.out.println("Is Directory = " + Files.isDirectory(directory));

        // 파일 이름 출력(getFileName)
        System.out.println("file getFileName = " + file.getFileName());

        //이름 출력(getFileName)
        System.out.println("file getFileName = " + directory.getFileName());

        // size() 크기 반환
        System.out.println("File size = " + Files.size(file) + "byte");

        // move() 파일 이름을 변경하거나 이동
        Path newFile = Paths.get("temp/newFile.txt");
        // StandardCopyOption.REPLACE_EXISTING -> 기존에 파일이 있는 경우 덮어쓰기
        Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File moved/ renamed");

        // getLastModifiedTime -> 마지막 수정된 시간 반환
        System.out.println("LastModifiedTime = " + Files.getLastModifiedTime(newFile));

        // 전부 다 출력
        BasicFileAttributes attributes = Files.readAttributes(newFile, BasicFileAttributes.class);
        System.out.println("========= Attributes ========");
        System.out.println("Creation Time = " + attributes.creationTime());
        System.out.println("is directory = " + attributes.isDirectory());
        System.out.println("is regular file = " + attributes.isRegularFile());
        System.out.println("symbolic link =  " + attributes.isSymbolicLink());
        System.out.println("size = " + attributes.size()+"byte");
    }
}
