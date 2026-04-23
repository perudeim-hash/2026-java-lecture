package ch08.enumeration.answer.ex11;

import java.util.Scanner;

public class RoleTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title2 = scanner.nextLine();


        try {
            Role role = Role.valueOf(title2);
            switch (role) {
                case ADMIN -> {
                    System.out.println("권한명 : " + role.getTitle());
                    System.out.println("권한레벨 : " + role.getLevel());
                    System.out.println("관리자 화면입니다.");
                    System.out.println("회원 관리/ 상품 관리/ 통계 관리 가능");
                }
                case MANAGER -> {
                    System.out.println("권한명 : " + role.getTitle());
                    System.out.println("권한레벨 : " + role.getLevel());
                    System.out.println("매니저 화면입니다.");
                    System.out.println("상품 관리 가능");
                }
                case GUEST -> {
                    System.out.println("권한명 : " + role.getTitle());
                    System.out.println("권한레벨 : " + role.getLevel());
                    System.out.println("게스트 화면입니다.");
                    System.out.println("조회만 가능합니다.");
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다 : " + title2);

        }
    }
}
