package review.operator;

public class Operator02 {
    public static void main(String[] args) {

        int sum = 1 + 2 * 3;
        System.out.println(sum);
        int sum02 = (1 + 2) * 3;
        System.out.println(sum02);

        int num = 0;
        num = num + 1;
        num++;
        System.out.println(num);

        int temp = num++;
        System.out.println(temp);

    }
}
