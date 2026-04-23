package ch09.time.ex.ex08;

import java.time.LocalDate;

public class exTest {
    public static void main(String[] args) {


        LocalDate days = LocalDate.of(2026, 4, 26);
        int dydlf= days.getDayOfWeek().getValue();
        
        switch (dydlf) {
            case 1 -> {
                System.out.println(days + "의 요일은 월요일 입니다.");
            }
            case 2 -> {
                System.out.println(days + "의 요일은 화요일 입니다.");
            }
            case 3 -> {
                System.out.println(days + "의 요일은 수요일 입니다.");
            }
            case 4 -> {
                System.out.println(days + "의 요일은 목요일 입니다.");
            }
            case 5 -> {
                System.out.println(days + "의 요일은 금요일 입니다.");
            }
            case 6 -> {
                System.out.println(days + "의 요일은 토요일 입니다.");
            }
            case 7 -> {
                System.out.println(days + "의 요일은 일요일 입니다.");
            }
            
            
            
            
            
        }
    }
}
