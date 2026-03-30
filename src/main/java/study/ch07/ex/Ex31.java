package study.ch07.ex;

public class Ex31 {
    public static void main(String[] args) {
        // 코드 A
        int x = 100;
        while (x < 5) {
            System.out.println("A 실행");
            x++;
        }

        // 코드 B
        int y = 100;
        do {
            System.out.println("B 실행");
            y++;
        } while (y < 5);
    }

    /**
     * 코드 A
     *
     *
     * 코드 B
     * B 실행
     *
     */

}
