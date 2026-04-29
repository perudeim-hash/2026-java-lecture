package ch11.compare.Answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer02 {
    public static void main(String[] args) {
        String[] words = {"banana", "kiwi", "apple", "fig", "grape", "pear"};
        Arrays.sort(words, new AscComparator());
        System.out.println(Arrays.toString(words));
    }


    static class AscComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int result = o1.length() - o2.length();
            if (result == 0) {
                return o1.compareTo(o2);
            }
            return result;
        }

    }
}
