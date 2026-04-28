package ch11.list;

import java.util.ArrayList;

public class List02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("arrayList.size() = " + arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList = " + arrayList.get(i));
        }
        arrayList.remove(0);
        System.out.println("0번째 Index 제거");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList = " + arrayList.get(i));
        }

        arrayList.remove(Integer.valueOf(20));
        // Integer 을 제거하는 경우에는 Integer.valueOf를 통해서 직접적인 값을 지정해줘야한다.
        System.out.println("값이 20인 Index 제거");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList = " + arrayList.get(i));
        }


        ArrayList<String> names = new ArrayList<>();
        names.add("엄복동");
        names.add("홍길동");
        names.add("이순신");

        names.remove("엄복동");
        System.out.println("엄복동에 해당하는 Index 제거");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("names = " + names.get(i));
        }

    }
}
