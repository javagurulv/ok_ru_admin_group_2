package student_alexander_zhukov.lesson_10.level_6;

class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Database has " + this.bookDatabase.countAllBooks() + " books");
    }
}
