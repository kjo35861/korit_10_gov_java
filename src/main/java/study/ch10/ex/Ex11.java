package study.ch10.ex;

public class Ex11 {
    public static void main(String[] args) {
        double[] nums = {3.5, 2.1, 7.8, 4.6, 1.9};
        double sum = 0;

        for (double i : nums) {
            sum += i;
        }
        System.out.println(sum);
    }
}
