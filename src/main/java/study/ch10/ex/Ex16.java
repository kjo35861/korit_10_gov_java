package study.ch10.ex;

public class Ex16 {
    public static void main(String[] args) {
        int[] nums = {45, 78, 12, 91, 34, 67};
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = nums[i];
                secondMax = nums[i];
                continue;
            }
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }
        System.out.println("두 번째 최대값 : " + secondMax);
    }
}
