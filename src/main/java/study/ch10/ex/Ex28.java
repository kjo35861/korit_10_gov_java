package study.ch10.ex;

import java.util.Arrays;

public class Ex28 {
    public static void main(String[] args) {

        // 26번 그대로 복사 해온 코드

        int[][] nums = new int[3][3];
        int[] colsSum = new int[nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int numb = j + 1;
                nums[i][j] = numb + (i * nums[i].length);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }


        // 여기부터 28번 문제 풀이


        // 내가 작성한 코드

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                colsSum[i] += nums[j][i];
            }
        }

        for (int i = 0; i < colsSum.length; i++) {
            System.out.println(i + "열 합계 : " + colsSum[i]);
        }



    }

}
