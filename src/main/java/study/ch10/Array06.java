package study.ch10;

import java.util.Random;

public class Array06 {
    public static void main(String[] args) {

        int[] nums = new int[10];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ((i < nums.length - 1) ? ", " : ""));
        }

        System.out.println();


        // nums에 저장된 랜덤한 숫자 중 최대값과 최소값을 각각 구하시오

        int max = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
//            if (max < nums[i]) {
//                max = nums[i];
//            }
            max = max < nums[i] ? nums[i] : max;
        }

        int maxmin = max + 1;
        for (int i = 0; i < nums.length; i++) {
//            if (maxmin > nums[i]) {
//                maxmin = nums[i];
//                min = nums[i];
//            }
            min = maxmin > nums[i] ? nums[i] : min;
            maxmin = min;
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

        // 정답 코드
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {           // 0번 인덱스의 숫자를 다음 인덱스 숫자들과 쉽게 비교하기 위해 무조건 입력
                max = nums[i];
                min = nums[i];
                continue;
            }
//            if (max < nums[i]) {
//                max = nums[i];
//            }
            max = max < nums[i] ? nums[i] : max;

//            if (maxmin > nums[i]) {
//                maxmin = nums[i];
//                min = nums[i];
//            }
            min = min > nums[i] ? nums[i] : min;

        }
    }

    /**
     * 해당 코드 작성 중 발생한 문제
     * 최소값을 추려내는 for 반복문 내용 중
     * int maxmin = max;
     * *for반복문
     * 으로 maxmin 변수의 값을 max로 설정하였을 때
     * 랜덤으로 뽑아낸 배열의 0번 인덱스에 최대값이 출력 될 경우
     * 최소값이 무조건 0으로 체크 됨.
     *
     * 문제가 된 이유
     * 0번 인덱스가 최대값으로 출력 되었을 때, (ex. 0번 인덱스 = 99)
     * maxmin = 99;
     * 최소값 비교 i = 0 차례의 반복문에서
     * min = 99 > 99 ? 99 : 0;
     * 즉 0을 반환
     *
     * 해결 방안
     * maxmin 의 초기화 값을 max 가 아닌 max + 1 로 수정
     * 혹은
     * min = maxmin >= nums[i] ? nums[i] : min;
     * 으로 같아도 비교하도록 수정 가능
     *
     * 알게 된 방법
     * 내가 해결한 방법이 아닌
     * if문을 사용해 0번 인덱스의 값을 무조건 max 와 min에 입력해 두는 방법
     * 도 있다. 해당 방법 사용 시 maxnum 변수를 생성하지 않아도 min 비교가능
     */
}
