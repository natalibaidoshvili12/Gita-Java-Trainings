package april4;

public class MyBank {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void getCash(int cash) {
        if (cash <= balance) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= cash;
            System.out.println("ნაშთი: " + balance);
        }
    }

}
