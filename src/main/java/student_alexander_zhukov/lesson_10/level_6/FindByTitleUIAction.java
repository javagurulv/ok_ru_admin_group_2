package student_alexander_zhukov.lesson_10.level_6;

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
        List<Book> result = bookDatabase.findByTitle(title);
        if (result.size() > 0) {
            for (Book i:result) {
                System.out.print("Author: " + i.getAuthor());
                System.out.print(" Title: " + i.getTitle());
                System.out.println(" Year: " + i.getYearOfIssue());
            }

        } else {
            System.out.println("No books find");
        }
    }
}
