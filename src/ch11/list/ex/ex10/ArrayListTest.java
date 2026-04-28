package ch11.list.ex.ex10;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("B");

        ArrayList<String> list = new ArrayList<>();

        for (String dkfvkqpt : stringArrayList) {
            if (!list.contains(dkfvkqpt)) {
                list.add(dkfvkqpt);
            }
        }
        System.out.println(list);




    }
}
