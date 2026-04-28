package ch11.list.ex.ex09;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        int count = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            count += arrayList.get(i);
        }
        System.out.println("count = " + count);

    }
}
