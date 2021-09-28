package student_alexander_zhukov.lesson_10.level_6;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id:");
        int id = scanner.nextInt();
        Optional<Book> bookOpt = bookDatabase.findById((long) id);
        if (!bookOpt.isEmpty()) {
            System.out.print("Author: " + bookOpt.get().getAuthor());
            System.out.print(" Title: " + bookOpt.get().getTitle());
            System.out.println(" Year: " + bookOpt.get().getYearOfIssue());
            } else {
            System.out.println("No books find");
        }

    }

}
