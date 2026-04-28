package ch11.list;

import java.util.ArrayList;
import java.util.Iterator;

public class List03 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("엄복동");
        names.add("홍길동");
        names.add("이순신");
        names.add("전우치");
        // Iterator << 순환 객체
        Iterator<String> iterator = names.iterator();
//        for (int i = 0; i < names.size(); i++) {
//            if (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            } else {
//                System.out.println("배열에 값이 없습니다.");
//            }
//        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        names.clear(); // 싹 다 삭제
         
    }
}
