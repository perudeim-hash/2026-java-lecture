package ch11.compare.Answer;

import java.util.Arrays;

public class Answer04 {
    public static void main(String[] args) {

        User[]users= {
                new User("kim",30),
                new User("lee",20),
                new User("park",20),
                new User("choi",30)
        };

        // Answer04
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        // Answer05
        Arrays.sort(users, new IdAgeComparator());
        System.out.println(Arrays.toString(users));

        // Answer06
        Arrays.sort(users, new AgeIdComparator());
        System.out.println(Arrays.toString(users));
    }
}
