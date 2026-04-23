package ch07.lang.ex4_21;

public class ex01 {
    public static void main(String[] args) {
        String[]arr= {"10","20","30","40"};
        int count = 0;
        for (String s : arr) {
         Integer i = Integer.parseInt(s);
            count += i;
        }
        System.out.println("count = " + count);
    }
}
