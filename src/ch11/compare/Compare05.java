package ch11.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare05 {
    public static void main(String[] args) {
        User user01 = new User("a", 30);
        User user02 = new User("b", 20);
        User user03 = new User("c", 10);
        User user04 = new User("c", 50);
        User user05 = new User("b", 60);
        User user06 = new User("a", 12);


        List<User> userList = new ArrayList<>();
        userList.add(user01);
        userList.add(user02);
        userList.add(user03);
        userList.add(user04);
        userList.add(user05);
        userList.add(user06);

        System.out.println("기본 데이터");
        System.out.println(userList);
        System.out.println("Comparable 기본 정렬");
        userList.sort(null);
        System.out.println(userList);
        System.out.println("IdAgeComparator 정렬");
        userList.sort(new IdAgeComparator());
        System.out.println(userList);
    }

}
