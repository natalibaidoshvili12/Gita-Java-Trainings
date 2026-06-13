package december18;

import java.math.BigDecimal;

public class PersonAccount {

    private String accountNumber;

    private BigDecimal balance;

    private String bankName;

    private String currency;

    public static class PlasticCard {
        private String cardNumber;
        private String pinCode;

        public void printInfo() {
            System.out.println("Card Number: " + cardNumber);
            System.out.println("Pin Code: " + pinCode);
//            System.out.println("Bank Name: " + bankName);
//            System.out.println("Account Number: " + accountNumber);
//            System.out.println("Balance: " + balance);
//            System.out.println("Currency: " + currency);
        }

        public PlasticCard() {
        }

        public PlasticCard(String cardNumber, String pinCode) {
            this.cardNumber = cardNumber;
            this.pinCode = pinCode;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getPinCode() {
            return pinCode;
        }

        public void setPinCode(String pinCode) {
            this.pinCode = pinCode;
        }
    }

    public PersonAccount() {
    }

    public PersonAccount(String accountNumber, BigDecimal balance, String bankName, String currency) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
