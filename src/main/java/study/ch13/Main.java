package study.ch13;

abstract class Person {
    private String firstName;
    private String lastName;
    public abstract void showName();
    public void showName2() {

    }
}

interface Person2 {
    // public 만 가능 private 불가능
    public String lastName = "";
    public String firstName = "";

    // public abstract 부분 생략 가능
    // 자식클래스에 반드시 공유가 되어야하기 때문에 private 사용 불가
    public abstract void showName();

    public default void showName2() {

    }
}

class Student extends Person {
    @Override
    public void showName() {

    }
}


class Student2 implements Person2 {
    @Override
    public void showName() {

    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student();      // 추상 클래스 상속
        Person2 p2 = new Student2();    // 인터페이스 상속
    }
}
