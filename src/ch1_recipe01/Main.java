package ch1_recipe01;

/**
 * Creating and running a thread
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Calculator calculator = new Calculator(i);
            Thread thread = new Thread(calculator);
            thread.start();
        }
    }
}
