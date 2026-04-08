package ch02.answer;

public class Answer03 {
    public static void main(String[] args) {
        int money = 65370;

        int rest = 0;
        int money50000 = money / 50000;
        rest = money50000 % 50000;
        int money10000 = rest / 10000;
        rest = money % 10000;
        int money5000 = rest / 5000;
        rest = money % 5000;
        int money1000 = rest / 1000;
        rest = money % 1000;
        int money500 = rest / 500;
        rest = money % 500;
        int money100 = rest / 100;
        rest = money % 100;
        int money50 = rest / 50;
        rest = money % 50;

        int money10 = rest / 10;
        rest = money % 10;
        int money1 = rest / 1;
        rest = money % 1;
        System.out.printf("%d는 오만원권 %d, 만원권 %d, 오천원권 %d, 천원권 %d, " +
                        "오백원 동전 %d, 백원 동전 %d, 오십원 동전 %d, 십원 동전 %d 개",
                money, money50000, money10000, money5000, money1000, money500, money100, money50,money10
        );
    }
}
