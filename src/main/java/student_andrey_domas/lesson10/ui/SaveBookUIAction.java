package student_andrey_domas.lesson10.ui;

import student_andrey_domas.lesson10.Book;
import student_andrey_domas.lesson10.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Book title: ");
        String title = scanner.next();

        System.out.print("Book author: ");
        String author = scanner.next();

        System.out.print("Book year: ");
        String year = scanner.next();

        Book book = new Book(author, title, year);
        Long id = bookDatabase.save(book);
        if (id == null)
            System.out.println("book not saved");
        else
            System.out.println("saved with id = " + id);
    }

}