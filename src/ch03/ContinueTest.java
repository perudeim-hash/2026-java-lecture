package ch03;

public class ContinueTest {
    public static void main(String[] args) {
        int sum = 0;
        //break -> 조건 만족시 반복문에서 나온다
        //continue;-> 조건 만족시 반복문 안에서 실행문을 건너 뛰어라
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);



    }
}
