package ch11.compare.Answer;

import java.util.Arrays;

public class Answer07 {
    public static void main(String[] args) {
        Product [] products= {
                new Product("A",3000),
                new Product("B",1000),
                new Product("C",2000),
                new Product("D",1000)
        };

        Arrays.sort(products, new PriceIdComparator());
        System.out.println(Arrays.toString(products));

    }
}
