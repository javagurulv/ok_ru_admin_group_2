package student_alexander_zhukov.lesson_10.level_6;

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
        System.out.println("Enter year of book publication:");
        int year = scanner.nextInt();
        Book book = new Book(author, title);
        book.setYearOfIssue(year);
        this.bookDatabase.save(book);
    }

}
