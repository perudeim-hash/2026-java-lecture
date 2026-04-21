package ch07.lang.ex4_21;

import java.util.Arrays;

public class ex02 {
    public static void main(String[] args) {
        String[] arr = {"87", "15", "92", "43", "100", "29"};
        int max = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("max = " + max);

    }
}
