package study.ch10.ex;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 4};

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
