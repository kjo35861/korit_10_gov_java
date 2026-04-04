package study.ch10.ex;

public class Ex18 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 2, 3, 1, 4, 2};

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                continue;
            }
            int num = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    num += 1;
                }
            }

            System.out.println(i + " : " + num + "회");
        }


        // 정답 코드
        int[] arr = {3, 1, 4, 1, 5, 2, 3, 1, 4, 2};
        int[] count = new int[6]; // 인덱스 1~5 사용
        for (int n : arr) count[n]++;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": " + count[i] + "회");
        }
    }
}
