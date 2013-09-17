package ch1_recipe03;

/**
 * Interrupting a thread
 */
public class Main {
    public static void main(String[] args) {
        Thread task = new PrimeGenerator();
        task.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        task.interrupt();
    }
}
