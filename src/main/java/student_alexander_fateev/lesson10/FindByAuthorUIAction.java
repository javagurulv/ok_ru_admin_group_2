package student_alexander_fateev.lesson10;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input author: ");
        String author = scan.nextLine();

        List<Book> books = bookDatabase.findByAuthor(author);
        for (Book book: books) {
            System.out.println(book.getAuthor() + ": " + book.getTitle());
        }
    }
}
