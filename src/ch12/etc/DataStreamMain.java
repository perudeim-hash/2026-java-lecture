package ch12.etc;

import java.io.*;

public class DataStreamMain {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("temp/data.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF("회원A");
        dataOutputStream.writeInt(10);
        dataOutputStream.writeDouble(10.5);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("temp/data.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        String str = dataInputStream.readUTF();
        System.out.println(str);
        int num = dataInputStream.readInt();
        System.out.println(num);

        System.out.println(dataInputStream.readDouble());
        System.out.println(dataInputStream.readBoolean());
        dataInputStream.close();
    }
}
