package ch02;

public class Review {
    public static void main(String[] args) {

        boolean isTrue = true;
        boolean isBig = 5 > 3;
        if (!isBig) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int grade = 4;
        switch (grade) {
            case 1:
                System.out.println("1등급 소고기의 가격은 20000원 입니다.");
                break;
            case 2:
                System.out.println("2등급 소고기의 가격은 15000원 입니다.");
                break;
            case 3:
                System.out.println("3등급 소고기의 가격은 10000원 입니다.");
                break;
            case 4:
                System.out.println("폐기입니다.");
                break;
        }


        String order = "와퍼";
        int price = 0;
//        switch (order) {
//            case "와퍼":
//                price = 7000;
//                break;
//            case "빅맥":
//                price = 6500;
//                break;
//            case "리아버거":
//                price = 5700;
//                break;
//            case "치즈버거":
//                price = 3700;
//                break;
//        } 


        price = switch (order) {
            case "와퍼" -> price = 7000;
            case "빅맥", "칠리버거" -> price = 6500;
            case "리아버거" -> price = 5700;
            case "치즈버거" -> price = 3700;
            default -> 3000;
        };


        System.out.println(price);

    }
}
