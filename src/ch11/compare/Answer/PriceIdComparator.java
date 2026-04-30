package ch11.compare.Answer;

import java.util.Comparator;

public class PriceIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result = Integer.compare(o1.getPrice(), o2.getPrice());
        if (result == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
