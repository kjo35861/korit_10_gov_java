package study.ch10.ex;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = {44, 11, 77, 33, 55};
        int min = 0;
        int numb = 0;

        // 최소값과 인덱스 구하기
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                min = nums[i];
                continue;
            }

            if (nums[i] < min) {
                min = nums[i];
                numb = i;
            }
        }

        System.out.println("최소값 : " + min);
        System.out.println("위치 : " + numb);
    }
}
