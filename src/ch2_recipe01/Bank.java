package ch2_recipe01;

/**
 * Created with IntelliJ IDEA.
 * User: txie
 * Date: 9/30/13
 * Time: 1:58 PM
 */
public class Bank implements Runnable {
    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.substractAmount(1000);
        }
    }
}
