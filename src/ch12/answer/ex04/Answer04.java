package ch12.answer.ex04;

import java.io.*;

public class Answer04 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("temp/input.txt");
        FileWriter fileWriter = new FileWriter("temp/error.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("ERROR")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
