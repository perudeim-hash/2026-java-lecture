package ch11.list.ex.ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(); // << 찾는거는 빠르지만 중간에 삽입 삭제는 느리다
//        LinkedList<String> linkedList = new LinkedList<>(); // << 중간에 삽입 삭제는 빠르지만 검색은 느리다
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add(1,"X" );
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }
}
