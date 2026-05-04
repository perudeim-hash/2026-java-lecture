package ch12.answer.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static ch12.answer.ex01.BufferedConstant.*;

public class Answer01 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream(FILE_INPUTNAME);
//        FileOutputStream fos = new FileOutputStream(FILE_OUTPUTNAME);

//        byte[] buffer = new byte[1024];
//        int len;
//        while ((len = fis.read(buffer)) != -1) {
//            String str = new String(buffer, 0, len);
//            System.out.print(str);
//            fos.write(buffer);
//        }
//        fis.close();
//        fos.close();
//        System.out.println("파일 복사 완료.");

        Files.copy(
                Path.of("temp/copy.jpeg"),
                Path.of("temp/test04.jpeg"),
                StandardCopyOption.REPLACE_EXISTING
        );


    }
}

class BufferedConstant {
    public static final String FILE_OUTPUTNAME = "temp/copy.jpeg";
    public static final String FILE_INPUTNAME = "temp/test.jpeg";


}
