package student_alexander_fateev.lesson10;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input author: ");
        String author = scan.nextLine();

        System.out.print("Input title: ");
        String title = scan.nextLine();

        Book book = new Book(author, title);
        bookDatabase.save(book);
    }

}
