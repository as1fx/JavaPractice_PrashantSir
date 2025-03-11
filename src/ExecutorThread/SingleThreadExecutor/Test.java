package ExecutorThread.SingleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Runnable task = new ExecutorThread();

        service.submit(task);
        service.shutdown();

    }
}
