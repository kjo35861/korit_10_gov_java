package ex3.util;

import java.util.Scanner;

public class Input {

    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 >> ");
        String line = sc.nextLine();
        return line;
    }

}
