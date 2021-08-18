package student_andrey_domas.lesson10.ui;

import student_andrey_domas.lesson10.Book;
import student_andrey_domas.lesson10.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book id: ");
        long id = scanner.nextLong();
        Optional<Book> o = bookDatabase.findById(id);
        if (o.isEmpty())
            bookNotFound();
        else
            System.out.println(o.get().toString());
    }

}