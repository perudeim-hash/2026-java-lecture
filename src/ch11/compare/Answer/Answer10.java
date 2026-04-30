package ch11.compare.Answer;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Answer10 {
    public static void main(String[] args) {
        String [] dates= {
                "2026-04-29",
                "2025-12-25",
                "2026-01-01",
                "2024-10-10"
        };
        Arrays.sort(dates, new DateComparator());
        System.out.println(Arrays.toString(dates));
    }
}

class DateComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        LocalDate date01 = LocalDate.parse(o1);
        LocalDate date02 = LocalDate.parse(o2);

        return date01.compareTo(date02);
    }

}
