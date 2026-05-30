package may30.library_management_system;

import may30.library_management_system.entity.Book;
import may30.library_management_system.entity.Member;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Library library = new Library();
        Book book1 = new Book("A",10L,  1L, "A", 10L);
        Book book2 = new Book("B",10L,  2L, "B", 10L);
        Book book3 = new Book("C",15L,  3L, "C", 15L);
        Book book4 = new Book("D",1L,  4L, "D", 1L);
        LibraryList.saveBook(book1);
        LibraryList.saveBook(book2);
        LibraryList.saveBook(book3);
        LibraryList.saveBook(book4);
        Member member1 = new Member("a@gmail.com", 1L, "A");
        Member member2 = new Member("b@gmail.com", 2L, "B");
        Member member3 = new Member("c@gmail.com", 3L, "C");
        Member member4 = new Member("d@gmail.com", 4L, "D");
        LibraryList.saveMember(member1);
        LibraryList.saveMember(member2);
        LibraryList.saveMember(member3);
        LibraryList.saveMember(member4);

        library.borrowBook(1L, 2L);
        library.borrowBook(2L, 3L);
        library.borrowBook(3L, 4L);
        Thread.sleep(1000);
        library.returnBook(1L, 2L);
        Thread.sleep(1000);
        library.returnBook(2L, 3L);
        Thread.sleep(1000);
        System.out.println(LibraryList.books);
        System.out.println(LibraryList.borrows);
        System.out.println();
    }

}
