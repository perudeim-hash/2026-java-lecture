package ch12.answer.ex02;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static ch12.answer.ex02.BufferedConstant.FILE_NAME;

public class Answer02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bfos = new BufferedOutputStream(fos);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("종료")) {
                break;
            }

            bfos.write((input+"\n").getBytes(StandardCharsets.UTF_8));

//            fos.write(input.getBytes());
//            fos.write("\n".getBytes());

        }
        bfos.close();
        fos.close();

    }
}


class BufferedConstant {
    public static final String FILE_NAME = "temp/diary.txt";

}