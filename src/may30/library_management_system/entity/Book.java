package may30.library_management_system.entity;

public class Book {

    private Long id;

    private String title;

    private String author;

    private Long availableCopies;

    private Long totalCopies;

    public Book() {
    }

    public Book(String author, Long availableCopies, Long id, String title, Long totalCopies) {
        this.author = author;
        this.availableCopies = availableCopies;
        this.id = id;
        this.title = title;
        this.totalCopies = totalCopies;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Long availableCopies) {
        this.availableCopies = availableCopies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(Long totalCopies) {
        this.totalCopies = totalCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", availableCopies=" + availableCopies +
                ", totalCopies=" + totalCopies +
                '}';
    }
}
