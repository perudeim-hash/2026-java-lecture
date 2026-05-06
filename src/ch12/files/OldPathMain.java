package ch12.files;

import java.io.File;
import java.io.IOException;

public class OldPathMain {
    public static void main(String[] args) throws IOException {

        File file = new File("temp/..");
        System.out.println("path = " + file.getPath());

        // 절대 경로
        System.out.println("absolute path = " + file.getAbsolutePath());

        // 정규 경로 -> 실제 폴더의 위치를 알려준다
        System.out.println("Canonical path = " + file.getCanonicalPath());
        // 경로상에 존재하는 모든 것들을 배열로 반환해라.
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println((f.isFile() ? "File" : "Directory ") + " / " + f.getName());

        }
    }
}
