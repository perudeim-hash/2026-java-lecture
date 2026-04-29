package ch11.compare.Answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer03 {
    public static void main(String[] args) {
        Integer [] scores= {80,95,70,95,60,85};
        Arrays.sort(scores, new AscComparator().reversed());
        System.out.println(Arrays.toString(scores));

    }


    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {

            return (o1<o2) ? -1 : (o1 == o2 ? 0 : 1);


        }
    }


}
