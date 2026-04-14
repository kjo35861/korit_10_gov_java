package ex3.view;

import ex3.Ex3Application;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

public class WithdrawalView implements View {

    public void render() {
        withdrawalMenu();
        String cmd = Input.input();
        int mstr = Integer.parseInt(cmd);
        if (Ex3Application.userMoney < mstr) {
            System.out.println("잔액이 부족합니다.");
        } else if (Ex3Application.userMoney >= mstr) {
            Ex3Application.userMoney -= mstr;
            System.out.println(String.format("%,d", mstr) + "원 출금되었습니다.");
            RouterPath.current = Routes.HOME.name();
        }
    }

    private void withdrawalMenu() {
        System.out.println("======<<WITHDRAWAL>>======");
        System.out.println("출금할 금액을 입력해주세요.");
        System.out.println("=======================");
    }
}
