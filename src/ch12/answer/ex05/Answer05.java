package ch12.answer.ex05;

import ch09.time.LocalDateTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static ch12.answer.ex05.BufferedConstant.FILE_NAME;

public class Answer05 {
    public static void main(String[] args) throws IOException {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
//        String now = LocalDateTime.now().format(formatter);
//
//        fos.write(now.getBytes());
//        fos.write("\n".getBytes());
//        fos.close();
//
//        FileInputStream fis = new FileInputStream(BufferedConstant.FILE_NAME);
//        byte[] readBytes = fis.readAllBytes();
//        String content = new String(readBytes);
//        System.out.println(content);
//        fis.close();
        // Writer <-> Stream Writer은 문자열을 읽을 때(문자열 반환) / Stream은 Jpg(사진이나 동영상) 로 많이 사용한다
        FileWriter fileWriter = new FileWriter(FILE_NAME, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        bufferedWriter.write(dateTime.format(formatter));
        bufferedWriter.newLine();
        bufferedWriter.append("시간 입니다.");
        bufferedWriter.close();



    }
}


class BufferedConstant {
    public static final String FILE_NAME = "temp/log.txt";

}