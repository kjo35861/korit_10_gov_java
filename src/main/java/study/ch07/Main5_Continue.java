package study.ch07;

public class Main5_Continue {
    public static void main(String[] args) {
        /**
         * continue = 지정된 회차만 건너뜀
         * break = 반복문 탈출
         */
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {               // 짝수일 때 continue 걸어줌 (건너뛰기)
                continue;
            }
            System.out.println("i : " + i);
        }

        System.out.println();

        int i = 0;
        while (i < 10) {
            int ii = i++;
            if (ii % 2 != 0) {
                continue;
            }
            System.out.println("i : " + ii);
        }
    }
}
