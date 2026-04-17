package review.static01.ex;

public class MathArrayMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5 ,100 ,200};
        System.out.println("sum = " + MathArrayUtils.sum(values));

        System.out.println("average = " + MathArrayUtils.average(values));

        System.out.println("max = " + MathArrayUtils.max(values));

        System.out.println("min = " + MathArrayUtils.min(values));

    }
}
