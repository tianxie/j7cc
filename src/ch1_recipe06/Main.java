package ch1_recipe06;

import java.util.Date;

/**
 * Date: 13-9-22
 * Time: 21:28
 */
public class Main {
    public static void main(String[] args) {
        DataSourceLoader dataSourceLoader = new DataSourceLoader();
        Thread thread1 = new Thread(dataSourceLoader, "DataSourceThread");

        NetworkConnectionLoader networkConnectionLoader = new NetworkConnectionLoader();
        Thread thread2 = new Thread(networkConnectionLoader, "NetworkConnectionThread");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Configuration has been loaded: %s\n", new Date());
    }
}
