package Thread.Print1or2;

public class Thread2 extends Thread {

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("2 ");
        }
    }
}
