package ch07.lang.immutable.String.ex;

public class ex09 {
    public static void main(String[] args) {

        String str = "level";

        String str01 = new StringBuilder(str).reverse().toString();


        if (str.equals(str01)) {
            System.out.println("팰린드롬입니다 : " + str.equals(str01));

        } else {
            System.out.println("팰린드롬이 아닙니다 : " + str.equals(str01));
        }

    }
}
