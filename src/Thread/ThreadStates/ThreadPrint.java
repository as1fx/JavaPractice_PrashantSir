package Thread.ThreadStates;

public class ThreadPrint extends Thread {
    @Override
    public synchronized void run() {
        System.out.printf("%s Thread Started : %d\n", Thread.currentThread().getName(), threadId());


        System.out.printf("%s Thread ended : %d\n", Thread.currentThread().getName(), threadId());
    }
}
