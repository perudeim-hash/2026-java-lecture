//9. 몸무게(kg)와 키(cm)를 입력받아서 비만도(bmi)를 측정하는 프로그램을 만드시오
//계산식	신체질량지수(BMI) = 체중(kg) / [신장(m)]2
//판정기준	저체중	20 미만
//정상	20 - 24
//과체중	25 - 29
//비만	30 이상
package ch02.answer;

public class Answer09 {
    public static void main(String[] args) {

        double cm = 170.5;
        double kg = 72.1;
        double m = cm / 100;
        double BMI= kg/(m*m);
        System.out.println(BMI);

        if (BMI < 20) {
            System.out.println("저체중입니다.");
        } else if (20 <= BMI && BMI < 25) {
            System.out.println("정상");
        } else if (25 <= BMI && BMI < 30) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
