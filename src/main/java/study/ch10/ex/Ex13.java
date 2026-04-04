package study.ch10.ex;

public class Ex13 {
    public static void main(String[] args) {
        int[] nums = {5, (-3), 8, (-1), 0, (-7), 4};
        int min = 0;

        for (int i : nums) {
            if (i < 0) {
                min += 1;
            }
        }
        System.out.println("음수 개수 : " + min);
    }
}
