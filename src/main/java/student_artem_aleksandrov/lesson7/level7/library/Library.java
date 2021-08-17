package student_artem_aleksandrov.lesson7.level7.library;

import student_artem_aleksandrov.lesson7.level7.library.extensions.BookNotAvailable;

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
    private List<Book> booksReserved = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public boolean isBookInLibrary(Book book) {
        return booksInLibrary.contains(book);
    }

    public boolean isBookOnHands(Book book) {
        return booksOnHands.contains(book);
    }

    public boolean isBookReserved(Book book) {
        return booksOnHands.contains(book);
    }

    private void giveBook(Book book) {
        booksInLibrary.remove(book);
        booksOnHands.add(book);
    }

    public void takeBook(Book book) throws BookNotAvailable {
        if (isBookInLibrary(book) && !isBookReserved(book)) {
            giveBook(book);
        } else {
            throw new BookNotAvailable();
        }
    }

    public void returnBook(Book book) {
        booksOnHands.remove(book);
        booksInLibrary.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }
}
