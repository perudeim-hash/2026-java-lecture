package ch11.compare.Answer;

import java.util.Comparator;

public class AgeIdComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int result = Integer.compare(o1.getAge(), o2.getAge());
        if (result == 0) {
//            return Integer.compare(o2.getAge(),o1.getAge());
            return o1.getId().compareTo(o2.getId());
        }
        return result;

    }
}