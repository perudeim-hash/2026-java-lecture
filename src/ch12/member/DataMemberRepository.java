package ch12.member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataMemberRepository implements MemberRepository {
    private static final String FILE_PATH = "temp/members-data.txt";

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(FILE_PATH));
            while (dataInputStream.available() > 0) {
                String Id = dataInputStream.readUTF();
                String name = dataInputStream.readUTF();
                int age = dataInputStream.readInt();
                Member member = new Member(Id, name, age);
                members.add(member);

            }
            return members;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(Member member) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(FILE_PATH, true));
            dataOutputStream.writeUTF(member.getId());
            dataOutputStream.writeUTF(member.getName());
            dataOutputStream.writeInt(member.getAge());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
