package study.ch11;

/**
 * 캡슐화
 * 관련 데이터와 메서드를 하나로 묶어 접근을 제한(private) 하여 독립성을 높임
 *
 * 상속
 * 상위클래스의 코드를 하위클래스가 물려받아 코드를 재사용
 *
 * 다형성
 * 같은 메서드가 상황에 따라 다르게 동작(오버로딩 / 오버라이딩)
 *
 * 추상화
 * 여러 하위클래스의 내용 중 중복되는 코드를 상위클래스에 묶어서 사용
 */

/**
 * @Override  < annotation
 * 오버라이드 될 시 재정의 된 부분임을 표시하기 위함
 */

class Animal {
    private String name;

    // 기본 생성자(NoArgumentsConstructor)
    public Animal() {}

    // 전체 생성자(AllArgumentsConstructor)
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + "(이)가 밥을 먹는다.");
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
    }
}

class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(super.getName() + "(이)가 멍멍한다.");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("품종 : " + breed);
    }
}

class Cat extends  Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void grooming() {
        System.out.println(super.getName() + "(이)가 그루밍을 한다.");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("색상 : " + color);
    }

}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("바둑이", "진돗개");
        Cat cat = new Cat("야옹이", "검은색");

//        dog.eat();
//        cat.eat();
//
//        dog.bark();
//        cat.grooming();
//
//        dog.showInfo();
//        cat.showInfo();

        Animal[] animals = new Animal[6];

        animals[0] = new Animal("그냥 동물");
        animals[1] = new Cat("야옹이", "화이트");
        animals[2] = new Dog("콩이", "말티즈");
        animals[3] = new Dog("두부", "말티즈");
        animals[4] = new Cat("네모", "블랙");
        animals[5] = new Animal("무슨 동물");


        for (Animal a : animals) {
            a.showInfo();
            if (a instanceof Dog) {
                ((Dog) a).bark();
            } else if (a instanceof Cat) {
                ((Cat) a).grooming();
            } else {
                System.out.println("추가 기능 없음");
            }
            System.out.println();
        }

        Dog dog2 = new Dog("A","B");
        dog2.showInfo();


    }
}
