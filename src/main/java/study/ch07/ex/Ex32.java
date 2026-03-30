package study.ch07.ex;

public class Ex32 {
    public static void main(String[] args) {
        int num = 9876;
        int sum = 0;
// 여기에 while 문을 작성하시오
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
