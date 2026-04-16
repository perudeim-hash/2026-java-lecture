package review.condition;

public class If01 {
    public static void main(String[] args) {

        int age = 7;

        if (age <= 7) {
            System.out.println("미취학 아동");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age < 17) {
            System.out.println("중학생");
        } else if (age < 20) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        int total = 9000;
        int age01 = 11;
        int gkfdls = 1000;

        if (total >= 10000) {
            total = total - gkfdls;

        }
        if (age01 <= 10) {
            total = total - gkfdls;
        }


        System.out.println(total);

    }
}
