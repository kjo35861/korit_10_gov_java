package study.ch09;

import study.ch09.entitiy.Teacher;

public class Main {

    // 같은 패키지 안에선 public 세팅 없이도 사용가능 (사용 시 main 메소드 생성x)
    // 하위패키지일 경우에도 public 세팅 해야함 (ex.Teacher)

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "김준일";
        s1.age = 33;
        s1.printInfo();

        Teacher t1 = new Teacher("김준일", 33);
        t1.월급계산(200000);


    }
}

/**
 * private 사용 이유
 * 데이터 은닉 :: 데이터를 숨김, 외부에서 수정되지 않아야 할 변수가 존재할 때
 *
 * 캡슐화, 무조건 표기하기로 약속. 앞으로 변수 사용 시 private 붙이기
 *
 *
 * Getter / private가 걸린 변수와 자료형이 같아야 한다
 * Setter / 리턴은 void
 */
