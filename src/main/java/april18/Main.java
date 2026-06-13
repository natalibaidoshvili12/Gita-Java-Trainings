package april18;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(new PrintTask(printer, "doc1"), "Thread1");
        Thread thread2 = new Thread(new PrintTask(printer, "doc2"), "Thread2");
        Thread thread3 = new Thread(new PrintTask(printer, "doc3"), "Thread3");
        Thread thread4 = new Thread(new PrintTask(printer, "doc4"), "Thread4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
