package april18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer {

    private Lock lock = new ReentrantLock();

    public void printDocument(String document) {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " started printing document: " + document);
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing " + document + " page " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " finished printing document: " + document);
        } finally {
            lock.unlock();
        }
    }

}
