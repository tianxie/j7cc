package ch1_recipe11;

/**
 * Created with IntelliJ IDEA.
 * User: txie
 * Date: 9/30/13
 * Time: 9:39 AM
 */
public class MyThreadGroup extends ThreadGroup {

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("The thread %s has thrown an Exception\n", t.getId());
        e.printStackTrace(System.out);
        System.out.printf("Terminating the rest of the Treads\n");
        interrupt();
    }
}
