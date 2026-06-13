package april4;

public class Person extends Thread {

    private MyBank myBank;

    public Person(MyBank myBank) {
        this.myBank = myBank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.myBank.getCash(5);
            System.out.println(Thread.currentThread().getName() + ": " + this.myBank.getBalance());
        }
        if (this.myBank.getBalance() <= 0) {
            System.out.println("ანგარიშზე არ არის საკმარისი თანხა");
        }
    }
}
