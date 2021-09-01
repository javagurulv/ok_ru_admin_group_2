package student_dmitry_samsonov.lesson_10_collections.level_6_middle;

import student_dmitry_samsonov.lesson_10_collections.level_2_intern.Book;
import student_dmitry_samsonov.lesson_10_collections.level_2_intern.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id:");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            System.out.printf("Deleting %s '%s' %s%n", bookOpt.get().getAuthor(), bookOpt.get().getTitle(),
                    bookOpt.get().getYearOfIssue().isPresent() ? bookOpt.get().getYearOfIssue().get(): "Unknown");
            bookDatabase.delete(id);
        } else {
            System.out.println("No books with such id");
        }
    }
}