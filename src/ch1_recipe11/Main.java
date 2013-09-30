package ch1_recipe11;

/**
 * Created with IntelliJ IDEA.
 * User: txie
 * Date: 9/30/13
 * Time: 9:49 AM
 */
public class Main {
    public static void main(String[] args) {
        MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
        Task task = new Task();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(threadGroup, task);
            thread.start();
        }
    }
}
