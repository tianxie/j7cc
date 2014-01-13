package ch2_recipe04;

/**
 * Created by tian on 14-1-13.
 */
public class Job implements Runnable {
    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s: Going to print a document\n",
                Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("%s: The document has been printed\n",
                Thread.currentThread().getName());
    }
}
