package study.ch07;

public class Main2 {
    public static void main(String[] args) {
//        int num = 10;
//        int count = 0;
//        int count2 = 0;
//        for (; num % 2 == 0; num = count++ == 3 ? 1 : 10, count2++) System.out.println("짝수입니다.");

//        아래처럼 한줄로 코딩도 가능하지만 가독성이 좋지 않음

        for (int num = 10, count = 0, count2 = 0; num % 2 == 0; num = count++ == 3 ? 1 : 10, count2++) System.out.println("짝수입니다.");


    }
}
