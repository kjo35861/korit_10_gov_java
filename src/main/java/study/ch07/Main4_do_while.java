package study.ch07;

public class Main4_do_while {
    public static void main(String[] args) {
        /**
         * while = 조건 먼저 검사 후 실행 (최초 실행이 조건에 부합하지 않으면 실행하지 않음)
         * do-while = 최초 실행 이후 조건 검사
         */

        int i = 0;

         do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }
}
