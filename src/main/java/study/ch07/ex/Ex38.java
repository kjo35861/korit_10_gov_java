package study.ch07.ex;

public class Ex38 {
    public static void main(String[] args) {
        int j = 0;
        int k = 1;
        System.out.print(j + " ");
        for (int i = 0; i < 9; i++) {
            int sum = j + k;
            System.out.print(sum + " ");
            k = j;
            j = sum;
        }
    }
}
