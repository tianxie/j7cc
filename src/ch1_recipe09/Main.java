package ch1_recipe09;

import java.util.concurrent.TimeUnit;

/**
 * Date: 13-9-26
 * Time: 20:43
 */
public class Main {
    public static void main(String[] args) {
        UnsafeTask task = new UnsafeTask();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
