package study.ch07.ex;

public class Ex24 {
    public static void main(String[] args) {
        int num = 36;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
    }
}
