package study.ch10.ex;

public class Ex12 {
    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "C++"};

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
            if (i != strings.length-1) {
                System.out.print(" / ");
            }
        }
    }
}
