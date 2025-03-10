package Thread.Print1or2;

public class Thread1 extends Thread {

    public synchronized void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("1 ");
        }
    }
}
