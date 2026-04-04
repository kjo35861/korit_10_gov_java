package study.ch10.ex;


public class Ex17 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        for (int i = 0; i < nums.length; i++) {
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
