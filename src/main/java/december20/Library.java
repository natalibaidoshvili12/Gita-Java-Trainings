package december20;

public class Library {

    private Long id;
    private String name;

    public Library() {
    }

    public Library(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo(Long bookId, String bookName) {
        class Book {
            Long bookId;
            String bookName;
        }
        Book book = new Book();
        book.bookId = bookId;
        book.bookName = bookName;
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Book Id: " + book.bookId);
        System.out.println("Book Name: " + book.bookName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
