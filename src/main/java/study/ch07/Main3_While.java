package study.ch07;

public class Main3_While {
    public static void main(String[] args) {
        int num = 0;
//        while (num < 10) {
//            System.out.println(num);
//            num++;
//        }
/**
 * while = 조건 먼저 검사 후 실행 (최초 실행이 조건에 부합하지 않으면 실행하지 않음)
 * do-while = 최초 실행 이후 조건 검사
 */
        while (num < 5) {
            int j = 4 - num;
            while (j < 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            num++;
        }

        System.out.println();
        num = 0;

        while (num < 5) {
            int i = 0;
            while (i < 5- 1 - num) {
                System.out.print(" ");
                i++;
            }
            i = 0;
            while (i < num + 1) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            num++;
        }
    }
}
