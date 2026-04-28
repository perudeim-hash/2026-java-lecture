package ch11.set;

import java.util.*;

public class Set01 {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Java");
//        set.add("Spring");
//        set.add("Boot");
//        set.add("Java");
//
//        System.out.println(set);
//        for (String str : set) {
//            System.out.print(str + " / ");
//        }
//        System.out.println();
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 4, 2 );
//        Set<Integer> integerSet = new HashSet<>(list);
//        System.out.println(integerSet);

        Random random = new Random();
        Set<Integer> lotto = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            lotto.add(random.nextInt(45) + 1);
        }
        System.out.println(lotto);



        while (lotto.size() < 6) {
            lotto.add(random.nextInt(45) + 1);
        }
        System.out.println(lotto);


    }
}
