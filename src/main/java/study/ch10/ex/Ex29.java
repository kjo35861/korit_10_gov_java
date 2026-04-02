package study.ch10.ex;

public class Ex29 {
    public static void main(String[] args) {
        int[][] nums = {{3, 7, 1}, {9, 2, 6}, {4, 8, 5}};
        int max = 0;
        int maxA = 0;
        int maxB = 0;


        // 내가 작성한 코드
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    maxA = i;
                    maxB = j;
                }
            }
        }
        System.out.println("최대값 : " + max + ", 위치 : " + "[" + maxA + "]" + "[" + maxB + "]");
    }
}
