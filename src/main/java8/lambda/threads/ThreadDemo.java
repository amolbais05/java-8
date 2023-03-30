package main.java8.lambda.threads;

public class ThreadDemo {
    public static void main(String[] args) {

        // First Thread : Thread - JOHN

        Runnable thread1 = () -> {
            // this is body of the thread
            // add stuff here
            for (int i = 0; i < 4; i++) {
                System.out.println("Value of i is : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();
    }
}
