package ch07.lang.immutable.String.ex;

public class ex05 {
    public static void main(String[] args) {
        String email = "java123@gmail.com";
        int idx = email.indexOf("@");
        System.out.println(email.substring(0, 7));
        System.out.println(email.substring(idx + 1));

    }
}
