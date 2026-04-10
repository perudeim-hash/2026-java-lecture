package ch03;

public class ArrayTest02 {
    public static void main(String[] args) {

//        String[] names = {"호", "우", "주", "의", "보"};
//        String[] actors = {"가", "나", "다", "라", "마", "바", "사"};
//
//        int[] nums = {10, 20, 12, 14, 52, 34, 5, 45, 6, 56, 57};
//        int max = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//            System.out.println(nums[i]);
//        }
//        System.out.println("제일 큰 숫자 = " + max   );
//
//        //enhanced for for each
//        for (String actor : actors) {
//            System.out.println("actor = " + actor);
//        }
//
//
//        enum week {월,화,수,목,금,토, 일};
//        for (week day : week.values()) {
//            System.out.println(day);
//        }

//        int[][] intArray = new int[4][3];
//
//        intArray[0][0] = 80;
//        intArray[0][1] = 30;
//        intArray[0][2] = 45;
//
//        intArray[1][0] = 65;
//        intArray[1][1] = 66;
//        intArray[1][2] = 13;
//
//        intArray[2][0] = 91;
//        intArray[2][1] = 96;
//        intArray[2][2] = 99;


//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = 0; j < intArray[i].length; j++) {
//                System.out.println((i+ 1) + "학년 " + (j + 1) + " 학기 점수 : " + intArray[i][j]);
//            }
//        }

        double[][] doubleArray = {{3.7, 4.1}, {1.2, 2.3}, {5.6, 7.8}, {1.9, 6.2}, {8.54, 5.67}};

        for (double[] doubles : doubleArray) {
            for (double aDouble : doubles) {
                System.out.println("aDouble = " + aDouble);
            }
        }

    }
}
