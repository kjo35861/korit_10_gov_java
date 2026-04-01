package study.ch10;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 4, 1};
        int[] sortedNums = nums.clone();

        System.out.println(Arrays.stream(nums).boxed().toList());
        System.out.println(Arrays.stream(sortedNums).boxed().toList());

        // 배열 속 숫자들을 작은수 부터 큰수 순서로 나열되도록 정렬하기

        for (int j = 0; j < sortedNums.length; j++) {
            for (int i = 0; i < sortedNums.length - 1 - j; i++) {
                if (sortedNums[i] > sortedNums[i+1]) {
                    int num = sortedNums[i];
                    sortedNums[i] = sortedNums[i + 1];
                    sortedNums[i + 1] = num;
                }
            }
        }

        System.out.println(Arrays.stream(sortedNums).boxed().toList());


        // 정답 코드
        for (int i = 0; i < sortedNums.length - 1; i++) {
            for (int j = 0; j < sortedNums.length - 1 - i; j++) {
                if (sortedNums[j] > sortedNums[j+1]) {
                    int temp = sortedNums[j];
                    sortedNums[j] = sortedNums[j + 1];
                    sortedNums[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.stream(sortedNums).boxed().toList());


    }
}
