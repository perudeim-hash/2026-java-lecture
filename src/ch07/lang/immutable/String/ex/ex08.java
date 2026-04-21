package ch07.lang.immutable.String.ex;

public class ex08 {
    public static void main(String[] args) {
        String str = "Java Spring Programming Boot";
        // split -> String을 배열로 나눠준다
        String[] words = str.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);

    }
}
