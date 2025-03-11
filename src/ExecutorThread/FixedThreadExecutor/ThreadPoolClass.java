package ExecutorThread.FixedThreadExecutor;

public class ThreadPoolClass implements Runnable {


    private final String threadName;

    public ThreadPoolClass(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        System.out.printf(threadName, " is being executed by thread: " + Thread.currentThread().threadId());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " has complete");
    }


}
