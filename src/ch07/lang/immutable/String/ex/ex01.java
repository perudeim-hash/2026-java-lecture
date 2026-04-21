package ch07.lang.immutable.String.ex;

public class ex01 {
    public static void main(String[] args) {
        String str = "Java Programming";

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
