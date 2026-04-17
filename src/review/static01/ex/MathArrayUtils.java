package review.static01.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    static double average(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        total = total / values.length;
        return total;
    }

    static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min)
                min = values[i];
        }
        return min;
    }

    static int max(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max)
                max = values[i];
        }
        return max;
    }


}
