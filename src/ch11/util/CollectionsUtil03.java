package ch11.util;

import java.util.*;

public class CollectionsUtil03 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9); // of로 만들면 불변 객체가 된다.
        // 불변객체를 -> 가변객체로 바꿈
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(100000);
        System.out.println(mutableList.toString());
        // 가변객체를 -> 불변객체로 바꿈
        List<Integer> immutableList = Collections.unmodifiableList(mutableList);


    }
}
