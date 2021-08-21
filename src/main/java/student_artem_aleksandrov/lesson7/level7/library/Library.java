package student_artem_aleksandrov.lesson7.level7.library;


import java.util.ArrayList;
import java.util.List;

/*
Доменная модель должна давать возможность поддерживать следующие операции:
- взять книгу из библиотеки;
- вернуть книгу в библиотеку;
- поиск нужной книги;
- резервация книги;
- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
- выписывание штрафов за вовремя не сданные книги;
- добавление новой книги в библиотеку.

В рамках данной задачи нужно только попробовать разработать модель
данных (pojo классы), которые будут описывать данные, которые нужны для
реализации указанных выше операций. Можно создать модель, которая будет
поддерживать только часть указанных выше операций.

 */
public class Library {

    private List<Book> booksInLibrary = new ArrayList<>();
    private List<Book> booksOnHands = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public boolean isBookInLibrary(Book book) {
        return booksInLibrary.contains(book);
    }

    public boolean isBookNotReserved(Book book, Member member) {
        return book.getReserverdBy() == null || book.getReserverdBy() == member;
    }

    public boolean isBookAvailable(Book book, Member member) {
        return isBookInLibrary(book) && isBookNotReserved(book, member);
    }

    private void giveBook(Book book, Member member) {
        if (isBookAvailable(book, member)) {
            booksInLibrary.remove(book);
            member.takeBook(book);
            booksOnHands.add(book);

        }
    }

    public void returnBook(Book book, Member member) {
        booksOnHands.remove(book);
        member.returnBook(book);
        booksInLibrary.add(book);
    }

    public void reserveBook(Book book, Member member) {
        book.setReserverdBy(member);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void addBook(Book book) {
        booksInLibrary.add(book);
    }

}
