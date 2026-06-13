package december13.hw.scnd;

public class Email implements Notification {

    private String text;

    private String senderEmail;

    private String recipientEmail;

    public Email(String text, String senderEmail, String recipientEmail) {
        this.text = text;
        this.senderEmail = senderEmail;
        this.recipientEmail = recipientEmail;
    }

    public Email() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    @Override
    public void send() {
        System.out.println("Sending email");
        System.out.println("Sender: " + senderEmail);
        System.out.println("Recipient: " + recipientEmail);
        System.out.println("Text: " + text);
        System.out.println("Email sent!");
    }

    @Override
    public void receive() {
        System.out.println("Receiving email");
        System.out.println("Sender: " + senderEmail);
        System.out.println("Recipient: " + recipientEmail);
        System.out.println("Text: " + text);
        System.out.println("Email received!");
    }
}
