package student_alexander_fateev.lesson10;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input book ID: ");
        long id = scan.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            System.out.println("Author: " + bookOpt.get().getAuthor());
            System.out.println("Title: " + bookOpt.get().getTitle());
        }
        else {
            System.out.println("No book with such ID found");
        }
    }

}
