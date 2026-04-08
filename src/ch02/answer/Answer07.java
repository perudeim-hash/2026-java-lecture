package ch02.answer;

public class Answer07 {

    public static void main(String[] args) {


        int num = 11;
        if (num == 3 || num == 4 || num == 5) {
            System.out.println("if = 봄");
        } else if (num == 6 || num == 7 || num == 8) {
            System.out.println("if = 여름");
        } else if (num == 9 || num == 10 || num == 11) {
            System.out.println("if = 가을");
        } else if (num == 12 || num == 1 || num == 2) {
            System.out.println("if = 겨울");
        }else {
            System.out.println("계절을 제대로 입력해주세요.");
        }
        String season = null;
        switch (num) {
            case 3,4,5 -> season = "switch = 봄";
            case 6,7,8 -> season = "switch = 여름";
            case 9,10,11 -> season = "switch = 가을";
            case 12,1,2 -> season = "switch = 겨울";
        }
        System.out.println(season);

    }
}
