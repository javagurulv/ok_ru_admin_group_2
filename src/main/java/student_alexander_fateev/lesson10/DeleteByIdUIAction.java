package student_alexander_fateev.lesson10;

import java.util.List;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input ID: ");
        long id = scan.nextLong();

        if (bookDatabase.delete(id)) {
            System.out.println("Book deleted");
        }
        else {
            System.out.println("No such book");
        }
    }
}
