package ch1_recipe05;

import java.util.concurrent.TimeUnit;

/**
 * Sleeping and resuming a thread
 * Date: 13-9-18
 * Time: 18:47
 */
public class Main {
    public static void main(String[] args) {
        FileClock clock = new FileClock();
        Thread thread = new Thread(clock);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
