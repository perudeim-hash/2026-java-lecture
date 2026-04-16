package review.array;

public class Array02 {
    public static void main(String[] args) {

        int[][] array = new int[3][4];
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;
        array[0][3] = 40;
        array[1][0] = 50;
        array[1][1] = 60;
        array[1][2] = 70;
        array[1][3] = 80;
        array[2][0] = 80;
        array[2][1] = 90;
        array[2][2] = 95;
        array[2][3] = 100;

        // 비 정형시에 배열을 돌리는 방법 2번째 for문에서 array02[i] 이런식
        int[][] array02 = {{10, 20,777}, {30, 40}, {50, 60,100}};
        for (int i = 0; i < array02.length; i++) {
            for (int j = 0; j < array02[i].length; j++) {
                System.out.println(array02[i][j]);
            }
        }

    }
}
