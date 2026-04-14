package ex2.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static String nextLine() {
        System.out.print("입력 : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = bufferedReader.readLine();
            return line;
        } catch (IOException e) {
            return null;
        }
    }
    }