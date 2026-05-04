package ch12.answer.ex01;

import java.io.*;

import static ch12.answer.ex01.BufferedConstant02.FILE_INPUTNAME;
import static ch12.answer.ex01.BufferedConstant02.FILE_OUTPUTNAME;


public class Answer0102{
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];
        FileInputStream fis = new FileInputStream(FILE_INPUTNAME);
        FileOutputStream fos = new FileOutputStream(FILE_OUTPUTNAME);
        File file = new File(FILE_INPUTNAME);

        BufferedInputStream bfis = new BufferedInputStream(fis,1024);
        BufferedOutputStream bfos = new BufferedOutputStream(fos,1024);

        int len;
        while ((len = bfis.read()) != -1) {
            bfos.write(buffer);
        }
        fis.close();
        fos.close();
        System.out.println("파일 복사 완료.");

    }
}

 class  BufferedConstant02 {
    public static final String FILE_OUTPUTNAME = "temp/copy2.jpeg";
    public static final String FILE_INPUTNAME = "temp/test.jpeg";


}
