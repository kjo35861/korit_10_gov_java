package ex3;

import ex3.router.RouterPath;
import ex3.router.Routes;

public class Ex3Application {

    public static boolean running = true;
    public static String userData;
    public static int userMoney = 0;


    public static void main(String[] args) {

        System.out.println("프로그램 실행");
        RouterPath.current = Routes.HOME.name();

        while (running) {
            Routes.valueOf(RouterPath.current).getView().render();
        }

        System.out.println("프로그램 종료");

    }

}
