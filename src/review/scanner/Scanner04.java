package review.scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("음식 이름을 입력해주세요.");
            String menu = scanner.nextLine();
            if (menu.equals("exit")) {
                break;
            }
            System.out.println("가격을 입력해 주세요.");
            int price = scanner.nextInt();
            price = price;
            System.out.println("수량을 입력해 주세요.");
            int tnfid = scanner.nextInt();
            scanner.nextLine();
            tnfid = tnfid;

            System.out.println(menu + "를 주문하셨습니다. 가격은 : " + price + "원 / 수량은 : " + tnfid + "개 입니다." +
                    "총 가격은 " + price * tnfid + "원 입니다.");
        }





    }
}
