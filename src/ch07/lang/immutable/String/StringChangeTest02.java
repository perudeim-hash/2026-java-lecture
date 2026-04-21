package ch07.lang.immutable.String;

import java.util.Locale;

public class StringChangeTest02 {
    public static void main(String[] args) {
        String str = "                      Java Programming               ";
        System.out.println("소문자로 변환 : " + str.toLowerCase());
        System.out.println("대문자로 변환 : " + str.toUpperCase());
        System.out.println("공백 제거 : " + str.trim() + " ! " + " " + "　　" + "　!");
        System.out.println("공백 제거 : " + str.strip() + " ! " + " " + "　　"  + " !");
        System.out.println("앞 공백제거(stripLeading() : " + str.stripLeading() + "!");
        System.out.println("뒷 공백제거(stripTrailing() : " + str.stripTrailing() + "!");

    }
}
