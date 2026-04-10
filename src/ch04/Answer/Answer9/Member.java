package ch04.Answer.Answer9;

public class Member {
    String id;
    int password;

    public Member(String id, int password) {
        this.id = id;
        this.password = password;
    }

    void login() {
        if (id.equals("qwdf1234") && password == 98989656) {
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }

    }
}
