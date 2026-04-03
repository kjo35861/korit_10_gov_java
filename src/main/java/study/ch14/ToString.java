package study.ch14;

class Student extends Object {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "이름 : " + name + " 점수 : " + score;
    }
}

public class ToString {
    public static void main(String[] args) {
        Student student = new Student("김준일", 90);
        System.out.println(student.toString());
        System.out.println(student);
        String a = student + "";
        System.out.println(a);
    }
}
