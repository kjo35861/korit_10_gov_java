package study.ch10.ex;

public class Ex09 {
    public static void main(String[] args) {
        int[] nums = {15, 42, 8, 23, 37};
        int findNum = 23;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == findNum) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("찾을 수 없음");
        } else {
            System.out.println(findNum + "은(는) " + index + "번째 인덱스에 있습니다.");
        }
    }
}
