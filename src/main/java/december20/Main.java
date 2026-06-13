package december20;

public class Main {

    public static void main(String[] args) {
//        Computer computer = new Computer("USA", "LENOVO", 12131.0, true);
//        Computer.Motherboard motherboard = new Computer.Motherboard(12, "ddr1", 1233.0);
//        Computer.Monitor monitor = new Computer.Monitor(123.0, 123.0, 123.0);
//        System.out.println(computer);
//        System.out.println(motherboard);
//        System.out.println(monitor);

        // 2
//        Notification notification = new Notification() {
//
//            @Override
//            public void send() {
//                System.out.println("Notification sent");
//                System.out.println("Sender: " + sender);
//                System.out.println("Receiver: " + receiver);
//                System.out.println("Text: " + message);
//            }
//
//            @Override
//            public void receive() {
//                System.out.println("Notification received");
//                System.out.println("Sender: " + sender);
//                System.out.println("Receiver: " + receiver);
//                System.out.println("Text: " + message);
//            }
//        };
//
//        notification.setMessage("Message was for me");
//        notification.setReceiver("nbaidoshvili12@gmail.com");
//        notification.setSender("nbaidoshvili@bog.ge");
//        notification.send();
//        notification.receive();


        Library library = new Library(1L, "State Library");
        library.printInfo(2L, "The catcher in the rye");

    }

}
