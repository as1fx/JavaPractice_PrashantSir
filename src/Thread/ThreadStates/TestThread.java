package Thread.ThreadStates;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadPrint t1 = new ThreadPrint();
        ThreadPrint t2 = new ThreadPrint();
        ThreadPrint t3 = new ThreadPrint();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();


    }
}
