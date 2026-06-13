package may30.library_management_system.entity;

import java.time.LocalDateTime;

public class Borrow {

    private Long id;

    private Long memberId;

    private Long bookId;

    private LocalDateTime borrowDate;

    private LocalDateTime returnDate;

    private LocalDateTime dueAt;

    public Borrow() {
    }

    public Borrow(Long bookId, LocalDateTime borrowDate, LocalDateTime dueAt, Long id, Long memberId, LocalDateTime returnDate) {
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.dueAt = dueAt;
        this.id = id;
        this.memberId = memberId;
        this.returnDate = returnDate;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDateTime getDueAt() {
        return dueAt;
    }

    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "bookId=" + bookId +
                ", id=" + id +
                ", memberId=" + memberId +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", dueAt=" + dueAt +
                '}';
    }
}
