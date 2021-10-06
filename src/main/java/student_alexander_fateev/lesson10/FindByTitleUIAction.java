package student_alexander_fateev.lesson10;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input title: ");
        String title = scan.nextLine();

        List<Book> books = bookDatabase.findByTitle(title);
        for (Book book: books) {
            System.out.println(book.getAuthor() + ": " + book.getTitle());
        }
    }
}
