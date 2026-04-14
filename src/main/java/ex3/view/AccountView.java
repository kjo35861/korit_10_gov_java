package ex3.view;

import ex3.Ex3Application;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

import java.util.Scanner;

public class AccountView implements View {
    Scanner sc = new Scanner(System.in);
    @Override
    public void render() {
        accountMenu();
        String cmd = Input.input();
        if ("1".equals(cmd)) {
            accountCreate();
            String userCMD = Input.input();
            Ex3Application.userData = userCMD;
            RouterPath.current = Routes.HOME.name();

        } else if ("b".equals(cmd)) {
            RouterPath.current = Routes.HOME.name();
        }
    }

    private void accountMenu() {
        System.out.println("======<<ACCOUNT>>======");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("=======================");
    }

    private void accountCreate() {
        System.out.println("======<<ACCOUNT CREATE>>======");
        System.out.println("사용자 이름을 입력해 주세요.");
        System.out.println("==============================");
    }
}
