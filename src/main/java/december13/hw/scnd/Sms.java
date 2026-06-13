package december13.hw.scnd;

public class Sms implements Notification {

    private String text;

    private String receiverNumber;

    private String senderNumber;

    public Sms(String text, String receiverNumber, String senderNumber) {
        this.text = text;
        this.receiverNumber = receiverNumber;
        this.senderNumber = senderNumber;
    }

    public Sms() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    @Override
    public void receive() {
        System.out.println("Receiving SMS");
        System.out.println("Sender: " + senderNumber);
        System.out.println("Receiver: " + receiverNumber);
        System.out.println("Text: " + text);
        System.out.println("SMS received");
    }

    @Override
    public void send() {
        System.out.println("Sending SMS");
        System.out.println("Sender: " + senderNumber);
        System.out.println("Receiver: " + receiverNumber);
        System.out.println("Text: " + text);
        System.out.println("SMS sent");
    }
}
