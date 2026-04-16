package review.array;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

//        int[] array = {10, 20, 30, 40, 50};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println();
//
//        for (int item : array) {
//            System.out.print(item + ",");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 5개 입력 하세요.");

        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.print(array1[i] + ", ");
        }

    }
}
