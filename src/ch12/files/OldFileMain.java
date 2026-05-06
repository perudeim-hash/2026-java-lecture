package ch12.files;

import java.io.File;
import java.io.IOException;

public class OldFileMain {
    public static void main(String[] args) throws IOException {

        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");
        System.out.println("file.exists = " + file.exists());
        System.out.println("directory.exists = " + directory.exists());
        // 파일을 생성할 수 있다.
        boolean created = file.createNewFile();
        System.out.println("file Created = " + created);
        // 디렉토리도 생성이 가능하다.
        boolean directoryCreated = directory.mkdir();
        System.out.println("directory Created = " + directoryCreated);
        // 삭제
//        boolean fileDelete = file.delete();
//        System.out.println("file delete = " + fileDelete);
        // 파일인지 확인
        System.out.println("is File = " + file.isFile());
        // 디렉토리인지 확인(폴더)
        System.out.println("is directory = " + directory.isDirectory());
        // 파일의 이름을 확인
        System.out.println("file name = " + file.getName());
        // 파일의 크기 반환
        File file1 = new File("temp/copy.jpeg");
        System.out.println("file size = " + file1.length());
        // 파일 이름을 바꾸고 전송
        File newFile = new File("temp/newExample.txt");
        boolean renameFile = file.renameTo(newFile);
        System.out.println("renameFile = " + renameFile);

    }
}
