package ch11.list.ex.ex04;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("Spring");
        stringArrayList.add("Boot");
        if (stringArrayList.contains("Java")) {
            System.out.println("존재합니다.");
        } else {
            System.out.println("존재하지 않습니다.");


        }
    }
}
