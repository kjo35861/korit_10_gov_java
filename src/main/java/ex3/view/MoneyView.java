package ex3.view;

import ex3.Ex3Application;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

public class MoneyView implements View {

    public void render() {
        moneyMenu();
        String cmd = Input.input();
        if (cmd != null) {
            RouterPath.current = Routes.HOME.name();
        }
    }

    private void moneyMenu() {
        System.out.println("======<<MONEY>>======");
        System.out.println("현재 잔액은 " + String.format("%,d", Ex3Application.userMoney) + "원 입니다.");
        System.out.println("홈으로 돌아가려면 Enter...");
        System.out.println("=======================");
        System.out.println();
    }
}
