package student_andrey_domas.lesson10.ui;

import student_andrey_domas.lesson10.Book;
import student_andrey_domas.lesson10.BookDatabase;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book author: ");
        String author = scanner.next();
        List<Book> books = bookDatabase.findByAuthor(author);
        if (books.isEmpty())
            bookNotFound();
        else
            books.forEach(System.out::println);
    }
}
