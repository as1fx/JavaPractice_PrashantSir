package Thread.Print1or2;

public class ThreadTest {
    public static void main(String... args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
