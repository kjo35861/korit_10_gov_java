package study.ch10.ex;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] revNum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                revNum[j] = nums[i];
            }
        }
        System.out.println(Arrays.toString(revNum));
    }
}
