package study.ch10.ex;

import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        int num = 1;

        // 내가 만든 코드
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = num;
                System.out.print(nums[i][j] + " ");
                num += 1;
            }
            System.out.println();

        }

        // 정답 코드
        // 반복문 안에서 증가하는 int numb 변수 선언 하여 사용
        // 해당 방법으로 하면 변수 낭비x

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int numb = j + 1;
                nums[i][j] = numb + (i * nums[i].length);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
