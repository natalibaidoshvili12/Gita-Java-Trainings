package may30.library_management_system;

import may30.library_management_system.entity.Book;
import may30.library_management_system.entity.Borrow;
import may30.library_management_system.entity.Member;

import java.time.LocalDateTime;

public class Library {

    public boolean returnBook(Long bookId, Long memberId) {
        Book book = LibraryList.getBookById(bookId);
        Member member = LibraryList.getMemberById(memberId);
        if (book == null || member == null) {
            throw new RuntimeException("Invalid bookId or memberId");
        }
        Borrow borrow = LibraryList.getBorrowByMemberAndBook(member, book);
        if (borrow == null) {
            throw new RuntimeException("Invalid bookId and memberId");
        }
        book.setAvailableCopies(book.getAvailableCopies() + 1);
        borrow.setReturnDate(LocalDateTime.now());
        return true;
    }

    public Borrow borrowBook(Long bookId, Long memberId) {
        Book book = LibraryList.getBookById(bookId);
        Member member = LibraryList.getMemberById(memberId);
        if (book == null || member == null) {
            throw new RuntimeException("Invalid bookId or memberId");
        }
        if (book.getAvailableCopies() == 0) {
            throw new RuntimeException("No book available copies");
        }
        Borrow borrow = new Borrow();
        borrow.setBookId(bookId);
        borrow.setMemberId(memberId);
        borrow.setBorrowDate(LocalDateTime.now());
        borrow.setDueAt(LocalDateTime.now().plusDays(10));
        LibraryList.saveBorrow(borrow);
        book.setAvailableCopies(book.getAvailableCopies() - 1);
        return borrow;
    }

    public Book getBookByTitle(String title) {
        return LibraryList.getBookByTitle(title);
    }

}
