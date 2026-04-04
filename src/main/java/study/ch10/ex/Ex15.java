package study.ch10.ex;

public class Ex15 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;

        /**
         * for-each로는 불가능한 이유
         * for-each문은 인덱스 비교가 불가능
         */

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        System.out.println("합계 : " + sum);
    }
}
