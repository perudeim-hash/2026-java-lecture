package ch07.lang.immutable.String.ex;

public class ex02 {
    public static void main(String[] args) {
        String str = "banana";

        int count = 0;

        for (int i = 0; i <= str.length() -1; i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

    }
}
