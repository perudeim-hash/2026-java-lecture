package ch03;

public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;

        }
        System.out.println(sum);
    }
}
