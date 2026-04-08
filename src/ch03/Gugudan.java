package ch03;

public class Gugudan {
    public static void main(String[] args) {
/**
        int result = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                result = i * j;
                System.out.print(i + " * " + j + " = " + result);
                System.out.print(" ");
            }
            System.out.println();

        }
*/
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("======================================");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
