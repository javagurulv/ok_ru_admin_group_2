package student_andrey_domas.lesson10.ui;

import student_andrey_domas.lesson10.Book;
import student_andrey_domas.lesson10.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book id: ");
        Long id = scanner.nextLong();
        if (!bookDatabase.delete(id))
            bookNotFound();
        else
            System.out.println("Book with id = " + id + " removed");
    }
}
