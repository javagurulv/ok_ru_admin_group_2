package student_alexander_zhukov.lesson_10.level_6;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction  {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id to delete:");
        int id = scanner.nextInt();
        this.bookDatabase.delete((long) id);
    }
}
