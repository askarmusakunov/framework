package javaExamples;

import java.util.Arrays;

public class FirstTwoMAcNumberinArray {
    public static void main(String[] args) {
        int[] x = {12, 3, 4, 1, 222, 343, 12, 12};
        getTwoMax(x);
    }

    public static void getTwoMax(int[] nums) {

        int maxone = 0;
        int maxTwo = 0;
        Arrays.sort(nums);
        System.out.println("Max1 " + (nums[nums.length - 1]));
        System.out.println("Max2 " + (nums[nums.length - 2]));

    }
}

