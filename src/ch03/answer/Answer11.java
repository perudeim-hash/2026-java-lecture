package ch03.answer;

public class Answer11 {
    public static void main(String[] args) {

        int size = 10;
        int[][] array = new int[size][size];
        int num = 1;
        int top = 0;
        int bottom = size - 1;
        int left = 0;
        int right = size - 1;

        while (num <= size * size) {
            // left -> right
            for (int i = left; i <= right; i++) {
                array[top][i] = num++;
            }
            top++;
            // top -> bottom
            for (int i = top; i <= bottom; i++) {
                array[i][right] = num++;
            }
            right--;
            //  right->  left
            for (int i = right; i >= left; i--) {
                array[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                array[i][left] = num++;
            }
            left++;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }

    }
}
