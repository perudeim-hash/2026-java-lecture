package ch11.compare.Answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer08 {
    public static void main(String[] args) {
        String [] nums= {"10","2","30","21","1"};

        Arrays.sort(nums, new NumComparator());
        System.out.println(Arrays.toString(nums));
    }
}

class NumComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        Integer n1 = Integer.parseInt(o1);
        Integer n2 = Integer.parseInt(o2);

        return n1.compareTo(n2);
    }
}
