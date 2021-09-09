package student_dmitry_samsonov.lesson_10_collections.level_6_middle;

import student_dmitry_samsonov.lesson_10_collections.level_2_intern.Book;
import student_dmitry_samsonov.lesson_10_collections.level_2_intern.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        List<Book> books = bookDatabase.findByTitle(title);
        if (books.size() == 0) {
            System.out.println("No books with such title");
            return;
        }
        for (Book book: books) {
            System.out.printf("%s %s %s%n", book.getAuthor(), book.getTitle(),
                    book.getYearOfIssue().isPresent() ? book.getYearOfIssue().get() : "Unknown");
        }
    }
}
