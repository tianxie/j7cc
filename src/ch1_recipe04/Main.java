package ch1_recipe04;

import java.util.concurrent.TimeUnit;

/**
 * Date: 13-9-17
 * Time: 19:47
 */
public class Main {
    public static void main(String[] args) {
        FileSearch searcher = new FileSearch("C:\\", "autoexec.bat");
        Thread thread = new Thread(searcher);
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
