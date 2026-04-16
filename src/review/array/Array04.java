package review.array;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] priceArray = new int[4];
        String[] productArray = new String[4];
        int index = 0;
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int menu = scanner.nextInt();
            if (menu == 1) {
                System.out.println("상품 등록 창 입니다.");
                System.out.print("상품을 등록 해주세요. ");
                scanner.nextLine();
                String product = scanner.nextLine();
                System.out.print("상품 가격을 입력 해주세요.");
                int price = scanner.nextInt();
                productArray[index] = product;
                priceArray[index] = price;
                index++;
            } else if (menu == 2) {
                if (index == 0) {
                    System.out.println("등록된 제품이 없습니다.");
                }
                System.out.println("상품 목록 창 입니다.");
                for (int i = 0; i < index; i++) {
                    System.out.println(productArray[i] + " |  " + priceArray[i] + "원");
                }

            } else if (menu == 3) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            } else if (menu == 10) {
                System.out.println("관리자 메뉴입니다 기능은 없습니다.");
            } else {
                System.out.println("똑바로 입력하세요");
            }

        }
    }

}
