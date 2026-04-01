package study.ch10;

public class Array04 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40 };

        System.out.println(nums[0]);    // 배열 기본 출력 방법
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println();

        System.out.println("배열의 크기 : " + nums.length);      // 변수.length = 해당 배열 변수의 값(개수)을 구함
        System.out.println();

        // 배열에서 초과된 인덱스를 사용하려 할 경우 에러발생 및 코드실행 강제 종료

        for (int i=0; i < nums.length; i++) {       // 배열 반복문 사용 출력 방법
            System.out.println(nums[i]);
        }

        System.out.println();

        /**
         * 새로운 nums2 배열을 비어있는 크기 4로 생성
         * nums에 있는 값들을 각 인덱스에 맞게 10씩 곱하여 대입 후 전체 출력
         */

        int[] nums2 = new int[4];

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[i] * 10;
        }

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i] + " ");
        }



    }
}
