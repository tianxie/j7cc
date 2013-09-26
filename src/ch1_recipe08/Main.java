package ch1_recipe08;

/**
 * Processing uncontrolled exceptions in a thread
 * Date: 13-9-26
 * Time: 20:12
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
    }
}
