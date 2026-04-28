package ch11.list;

import java.util.ArrayList;

public class List01 {
    public static void main(String[] args) {
        // 가변 배열
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }

    }
}
