package ch03.answer;

public class Answer04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수입니다. " + i);
            } else if (i % 2 != 0) {
                System.out.println("홀수입니다. " + i);
            }

            
//            String str = i % 2 == 0 ? "짝수" : "홀수";
//            System.out.println(i + " : " + str);
//              삼항 연산자 조건 ? "참" : "거짓"
        }


    }
}
