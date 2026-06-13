package may30.library_management_system;

import may30.library_management_system.entity.Book;
import may30.library_management_system.entity.Borrow;
import may30.library_management_system.entity.Member;

import java.util.ArrayList;
import java.util.List;

public class LibraryList {

    public static final List<Book> books = new ArrayList<>();

    public static final List<Borrow> borrows = new ArrayList<>();

    public static final List<Member> members = new ArrayList<>();

    public static Book getBookById(Long id) {
        return books.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public static Book getBookByTitle(String title) {
        return books.stream().filter(e -> e.getTitle().equals(title)).findFirst().orElse(null);
    }

    public static Borrow getBorrowById(Long id) {
        return borrows.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public static Member getMemberById(Long id) {
        return members.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public static Borrow getBorrowByMember(Member member) {
        return borrows.stream().filter(e -> e.getMemberId().equals(member.getId())).findFirst().orElse(null);
    }

    public static Borrow getBorrowByMemberAndBook(Member member, Book book) {
        return borrows.stream().filter(e -> e.getMemberId().equals(member.getId()) && e.getBookId().equals(book.getId())).findFirst().orElse(null);
    }

    public static Borrow getBorrowByBook(Book book) {
        return borrows.stream().filter(e -> e.getBookId().equals(book.getId())).findFirst().orElse(null);
    }

    public static void saveBook(Book book) {
        books.add(book);
    }

    public static void saveBorrow(Borrow borrow) {
        borrows.add(borrow);
    }

    public static void saveMember(Member member) {
        members.add(member);
    }

}
