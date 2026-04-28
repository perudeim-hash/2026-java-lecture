package ch11.list.ex.ex05;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("B");
        System.out.println(stringArrayList.indexOf("B"));
        System.out.println(stringArrayList.lastIndexOf("B"));

    }
}
