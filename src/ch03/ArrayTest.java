package ch03;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 25;
        nums[2] = 30;
        nums[3] = 521;
        nums[4] = 53477593;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
//        for (int num : nums) {
//            System.out.println("num = " + num);
//        }
        String[] names = {"z", "Test1", "test2", "test3", "test4", "test5"};
        String[] actors = names;  // 얕은 카피(sharrow copy)
        actors[0] = "하지원";
        System.out.println(names);
        System.out.println(actors);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("names[i] = " + names[i]);
        }







    }
}
