package ex3.view;

import com.sun.jdi.event.VMDeathEvent;
import ex3.Ex3Application;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

import java.sql.SQLOutput;


public class DepositView implements View {
    int money = 0;
    String mstr;

    public void render() {
        depositMenu();
        String cmd = Input.input();
        mstr = cmd;
        deposit();
    }

    private void depositMenu() {
        System.out.println("======<<DEPOSIT>>======");
        System.out.println("입금할 금액을 입력해주세요.");
        System.out.println("=======================");
    }

    private void deposit() {
        try {
            money = Integer.parseInt(mstr);
            System.out.println(String.format("%,d", money) + "원 입금되었습니다.");
            Ex3Application.userMoney += money;
            RouterPath.current = Routes.HOME.name();
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해주세요.");
        }

        System.out.println(money);
    }
}
