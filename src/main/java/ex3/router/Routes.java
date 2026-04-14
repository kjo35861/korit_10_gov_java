package ex3.router;

import ex3.view.*;
import lombok.Getter;

public enum Routes {
    HOME(new HomeView()), ACCOUNT(new AccountView()), DEPOSIT(new DepositView()),
    WITHDRAWAL(new WithdrawalView()), MONEY(new MoneyView()), LIST(null), HISTORY(null),
    ;

    @Getter
    private View view;


    Routes (View view) {
        this.view = view;
    }
}
