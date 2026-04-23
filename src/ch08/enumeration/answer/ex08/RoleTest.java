package ch08.enumeration.answer.ex08;

public class RoleTest {
    public static void main(String[] args) {
        Role role = Role.ADMIN;

        if (role == Role.ADMIN) {
            System.out.println("관리자 페이지 접근 가능");
        } else {
            System.out.println("접근 불가");
        }
    }
}
