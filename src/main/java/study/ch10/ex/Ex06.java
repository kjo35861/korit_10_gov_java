package study.ch10.ex;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {5, 12, 3, 18, 7, 21, 9, 14};
        int numb = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                numb += 1;
            }
        }

        System.out.println("홀수 개수 : " + numb);
    }
}
