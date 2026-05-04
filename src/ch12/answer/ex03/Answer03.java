package ch12.answer.ex03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


import static ch12.answer.ex03.BufferedConstant.FILE_NAME;

public class Answer03 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream buis = new BufferedInputStream(fis);

//        byte[] readBytes = fis.readAllBytes();
//        String content = new String(readBytes);
//        String[] arr = content.split("\n");
//        int total = 0;
//        for (String s : arr) {
//            total += Integer.parseInt(s);
//        }
//        System.out.println(total);
//        fis.close();


        byte[] buffer = new byte[1024];
        int len;
        int data = 0;
        int sum = 0;
        int num = 0;
        while ((data = buis.read()) != -1) {
            char ch = (char) data;
            if (ch == '\n') {
                sum += num;
                num = 0;
            } else if (ch != '\r') {
                num = num * 10 + (ch - '0');
            }
        }
        sum += num;
        buis.close();
        System.out.println("합계 : " + sum);
    }
}


class BufferedConstant {
    public static final String FILE_NAME = "temp/numbers.txt";

}