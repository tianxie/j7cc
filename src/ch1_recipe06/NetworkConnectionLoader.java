package ch1_recipe06;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Date: 13-9-22
 * Time: 21:26
 */
public class NetworkConnectionLoader implements Runnable {

    @Override
    public void run() {
        System.out.printf("Beginning network connection loading: %s\n", new Date());
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Network connection loading has finished: %s\n", new Date());
    }
}
