package study.ch10.ex;

public class Ex14 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "avocado", "cherry", "apricot"};

        for (String s : strings) {
            if (s.indexOf("a") == 0) {
                System.out.println(s);
            }
        }

        System.out.println();

        // 정답
        for (String a : strings) {
            if (a.startsWith("a")) {
                System.out.println(a);
            }
        }
    }
}
