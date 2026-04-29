package ch11.compare;

import java.util.Arrays;

public class Compare03 {
    public static void main(String[] args) {
        User user01 = new User("a", 30);
        User user02 = new User("b", 20);
        User user03 = new User("c", 10);
        /*
        정렬의 기준은 DB에서 sort해서 넘어오는 경우도 있고
        raw 데이터를 자바에서 Compare를 통해서 sort하는 경우도 있다
         */
        User[] array = {user01, user02, user03};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparble 정렬");
        // 객체를 기준으로 차순을 정할거면 그 객체에서 Comparble interface를 구현해야한다.
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator.reversed() 정렬");
        // 객체를 기준으로 차순을 정할거면 그 객체에서 Comparble interface를 구현해야한다.
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
