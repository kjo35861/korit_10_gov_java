package study.ch08;

public class OBJ02 {
    public static void main(String[] args) {
        class Addition {
            int defaultNumber = 10;

            // 1. 중복 코드 제거
            // 2. 기능별로 코드를 나눌 때

            int add (int a, int b) {
                System.out.println("변수 a : " + a);
                System.out.println("변수 b : " + b);
                System.out.println("기본값 : " + defaultNumber);
                return a + b + defaultNumber;
            }
        }

        Addition add1 = new Addition();
        int num = 1000;
        int num2 = add1.add(100,200);
        int num3 = add1.add(400,500);
        System.out.println(num + num2 + num3);


    }
}
