package april18;

public class PrintTask implements Runnable {

    private Printer printer;
    private String fileName;

    public PrintTask(Printer printer, String fileName) {
        this.printer = printer;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        printer.printDocument(fileName);
    }
}
