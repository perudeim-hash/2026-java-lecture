package ch02;

public class SwitchTest {
    public static void main(String[] args) {
//        String order = "카라멜마끼아또";
//        switch (order) {
//            case "아이스 아메리카노" -> {
//                System.out.println("2000원 입니다.");
//            }
//            case "카페모카" -> {
//                System.out.println("3000원 입니다.");
//            }
//            case "카라멜마끼아또" -> {
//                System.out.println("4000원 입니다.");
//            }
//            default -> System.out.println("잘못된 오더입니다.");
//
//        }

        int score = 40;
        switch (score/10) {
            case 9:
                System.out.println("A 입니다.");
                break;
                case 8:
                System.out.println("B 입니다.");
                break;
                case 7:
                System.out.println("C 입니다.");
                break;
                case 6:
                System.out.println("D 입니다.");
                break;
            default:
                System.out.println("불합격입니다");

        }

        int month = 3 ;
        switch (month) {
            case 12,1,2:
                System.out.println("겨울");
                break;
                case 3,4,5:
                System.out.println("봄");
                break;
                case 6,7,8,9:
                System.out.println("여름");
                break;
            default:
                System.out.println("가을");
        }

    }
}
