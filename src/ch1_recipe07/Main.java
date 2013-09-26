package ch1_recipe07;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Creating and running a daemon thread
 * Date: 13-9-26
 * Time: 19:34
 */
public class Main {
    public static void main(String[] args) {
        Deque<Event> deque = new ArrayDeque<>();
        WriterTask writer = new WriterTask(deque);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(writer);
            thread.start();
        }
        CleanerTask cleaner = new CleanerTask(deque);
        cleaner.start();
    }
}
