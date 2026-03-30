package study.ch07.ex;

public class Ex09 {
    public static void main(String[] args) {
        int month = 7;
// 여기에 코드를 작성하시오
        if (month >= 3 && month <= 5) {
            System.out.println("봄");
        } else if (month >= 6 && month <= 8) {
            System.out.println("여름");
        } else if (month >= 9 && month <= 11) {
            System.out.println("가을");
        } else
            System.out.println("겨울");
        }
    }