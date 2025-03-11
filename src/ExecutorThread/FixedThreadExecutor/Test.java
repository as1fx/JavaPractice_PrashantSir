package ExecutorThread.FixedThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);

        Runnable t1 = new ThreadPoolClass("\nTask1");
        Runnable t2 = new ThreadPoolClass("\nTask2");
        Runnable t3 = new ThreadPoolClass("\nTask3");
        Runnable t4 = new ThreadPoolClass("\nTask4");

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);
        service.submit(t4);


        service.shutdown();

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("Some tasks are still running...");
        } else {
            System.out.println("All tasks completed.");
        }
    }
}
