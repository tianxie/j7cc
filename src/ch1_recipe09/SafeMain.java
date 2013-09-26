package ch1_recipe09;

import java.util.concurrent.TimeUnit;

/**
 * Using local thread variables
 * Date: 13-9-26
 * Time: 20:59
 */
public class SafeMain {
    public static void main(String[] args) {
        SafeTask task = new SafeTask();
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
