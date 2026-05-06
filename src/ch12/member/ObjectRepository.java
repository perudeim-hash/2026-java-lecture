package ch12.member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectRepository implements MemberRepository {
    private static final String FILE_PATH = "temp/members-Object.txt";

    @Override
    public void add(Member member) {
        List<Member> members = findAll();
        members.add(member);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            objectOutputStream.writeObject(members);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Member> findAll() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Object findObject = objectInputStream.readObject();
            return (List<Member>)findObject;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
