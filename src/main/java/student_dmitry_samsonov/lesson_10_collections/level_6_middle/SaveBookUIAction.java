package student_dmitry_samsonov.lesson_10_collections.level_6_middle;

import student_dmitry_samsonov.lesson_10_collections.level_2_intern.Book;
import student_dmitry_samsonov.lesson_10_collections.level_2_intern.BookDatabase;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter book issue date:");
        String year = scanner.nextLine();
        this.bookDatabase.save(new Book(author, title, year));
    }
}