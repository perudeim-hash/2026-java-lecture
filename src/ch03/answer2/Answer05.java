package ch03.answer2;

import java.util.Scanner;

public class Answer05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        System.out.println("정수 10개를 입력하세요.");
        int size = array1.length;

        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.print("3의 배수 : ");
        for (int i = 0; i < size; i++) {

            if (array1[i] % 3 != 0) {
                continue;
            }
            System.out.print(array1[i] +  " / ");


        }
    }
}

