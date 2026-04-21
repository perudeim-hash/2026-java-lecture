package ch07.lang.ex4_21;

public class ex08 {
    public static void main(String[] args) {
        String[] arr = {"11", "24", "36", "41", "52", "67", "80"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);

            if (num % 2 == 0) {
                count++;
            }

        }
        System.out.println("count = " + count);
    }
}
