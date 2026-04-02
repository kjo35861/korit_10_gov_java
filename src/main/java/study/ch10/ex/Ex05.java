package study.ch10.ex;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 22, 7, 36, 41};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
