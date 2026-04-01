package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {

        class 학생 {
            String 이름;
            int 나이;

            void printInfo() {
                System.out.println("name : " + 이름);
                System.out.println("age : " + 나이);
            }

            void increaseAge() {
                System.out.println("나이 한살 더 먹기");
                나이++;
            }
        }

        학생 학생1 = new 학생();
        학생1.이름 = "김준일";
        학생1.나이 = 33;
        학생1.printInfo();
        학생1.increaseAge();
        학생1.printInfo();

        학생 학생2 = new 학생();
        학생2.이름 = "김준이";
        학생2.나이 = 34;


        /**
         * 객체(Object)
         * class 기반 instance
         *
         *
         * field / method
         * field = 객체의 데이터를 저장하는 변수 - 클래스 내부에 선언
         *
         * method = 객체의 행동을 정의하는 함수 - 클래스 내부에 선언
         * 리턴타입 메서드명 (매개변수) { 실행문; }
         *
         *
         * void vs 리턴타입
         * void - 리턴x
         *
         * 리턴타입 - 결과 반환 (int, String ...)
         *
         */
    }
}
