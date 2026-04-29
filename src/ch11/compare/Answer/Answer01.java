package ch11.compare.Answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer01 {
    public static void main(String[] args) {
        Integer[] arr = {7,-3, 1, -7, 4, -2, 6};
        Arrays.sort(arr, new AscComparator());
        System.out.println(Arrays.toString(arr));

    }


    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            int result = Integer.compare(Math.abs(o1), Math.abs(o2));
            if (result == 0) {
                Integer.compare(o1, o2);
            }
            return result;
        }
    }


}
