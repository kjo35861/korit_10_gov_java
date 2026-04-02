package study.ch12;

/**
 * Ctrl + O = 재구성/구현
 * Ctrl + I = 구현
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("강아지가 밥을 먹는다.");
    }
}
