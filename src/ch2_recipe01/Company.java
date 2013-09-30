package ch2_recipe01;

/**
 * Created with IntelliJ IDEA.
 * User: txie
 * Date: 9/30/13
 * Time: 2:00 PM
 */
public class Company implements Runnable {
    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.addAmount(1000);
        }
    }
}
