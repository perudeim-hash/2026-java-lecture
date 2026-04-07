package ch02;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SwitchTest02 {
    public static void main(String[] args) {

//        int month = 9 ;
//        String season = null;
//        season = switch (month) {
//            case 12, 1, 2 ->{
//            yield "겨울";
//            }
//            case 3, 4, 5 -> {
//                yield "봄";
//            }
//            case 6, 7, 8, 9 -> {
//                yield "여름";
//            }
//            default -> {
//                yield "가을";
//            }
//        };
//        System.out.println(season);
        int month = 9 ;
        String season = null;
        season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8, 9 -> "여름";
            default -> "가을";
        };
        System.out.println(season);

        int day = 1;
        switch (day) {
            case 1 :
                System.out.println("월요일");
                break;
                case 2 :
                System.out.println("화요일");
                break;
                case 3 :
                System.out.println("수요일");
                break;
                case 4 :
                System.out.println("목요일");
                break;
                case 5 :
                System.out.println("금요일");
                break;
                case 6 :
                System.out.println("토요일");
                break;
                case 7 :
                System.out.println("일요일");
                break;
            default:
                System.out.println("오류가 발생했습니다.");
        }


        LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfWeek());



    }
}
