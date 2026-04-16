package review.condition;

public class If02 {
    public static void main(String[] args) {

        int km = 25;

        if (km <= 1) {
            System.out.println("도보");
        } else if (km <= 10) {
            System.out.println("자전거");
        } else if (km <= 100) {
            System.out.println("자동차");
        } else if (km > 100) {
            System.out.println("비행기");
        } else {
            System.out.println("이동수단이 없습니다.");
        }


        System.out.println("========삼항 연산자==============");
        int a = 20;
        int b = 10;
        int big;

        big = a > b ? a : b; // 삼항연산자(조건이 2개일 경우에만 가능하다)
        System.out.println(big);
        int c = 10;
        int d = 15;

        int gap = c - d > 0 ? c - d : d - c;
        System.out.println(gap);

    }
}
