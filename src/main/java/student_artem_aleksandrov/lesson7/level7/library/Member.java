package student_artem_aleksandrov.lesson7.level7.library;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String FirstName;
    private String LastName;
    private String BirthDay;
    private List<Book> booksReserved = new ArrayList<>();

    private List<Book> booksOnHands = new ArrayList<>();


    private boolean Active = true;
    private double Credit = 0;

    public Member(String firstName, String lastName, String birthDay) {
        FirstName = firstName;
        LastName = lastName;
        BirthDay = birthDay;
    }

    public void reserveBook(Book book) {
        booksReserved.add(book);
        book.setReserverdBy(this);
    }

    public void releseBook(Book book) {
        booksReserved.remove(book);
        book.setReserverdBy(null);
    }

    public void takeBook(Book book) {
        booksOnHands.add(book);
        releseBook(book);
        book.setUsesBy(this);
    }

    public void returnBook(Book book) {
        booksOnHands.remove(book);
        book.setUsesBy(null);
    }
}
