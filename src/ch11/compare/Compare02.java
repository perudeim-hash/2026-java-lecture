package ch11.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Compare02 {
    public static void main(String[] args) {
//      자바가 제공하는 Comparator 라는 interface를 직접 구현
        Integer[] array = {1,2,3,3, 2, 1,10,22,38,85};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new DescComparator());
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println(Arrays.toString(array));

    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
//            -1, 0, 1
//            3항 연산자는 조건 ? true : false 인데 아래의 문장은
//            조건을 만족하면 -1 그리고 다시 조건을 걸었다.
            return (o1<o2) ? -1 : (o1 == o2 ? 0 : 1);
        }
    }


    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + ", o2 = " + o2);
//            -1, 0, 1
//            3항 연산자는 조건 ? true : false 인데 아래의 문장은
//            조건을 만족하면 -1 그리고 다시 조건을 걸었다.
            return ((o1 < o2) ? -1 : (o1 == o2 ? 0 : 1)) * -1;
        }
    }
}
