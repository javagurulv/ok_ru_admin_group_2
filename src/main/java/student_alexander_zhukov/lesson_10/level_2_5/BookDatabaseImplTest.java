package student_alexander_zhukov.lesson_10.level_2_5;

class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        Book book1 = new Book("A1", "T1");
        Book book2 = new Book("A2", "T2");
        Book book3 = new Book("A3", "T3");
        Book book4 = new Book("A4", "T4");
        Book book5 = new Book("A5", "T5");
        Book book6 = new Book("A5", "T6");
        Book book7 = new Book("A5", "T7");

        BookDatabaseImpl db = new BookDatabaseImpl();
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);
        db.save(book6);
        db.save(book7);

        test.deleteIdTest(db, book1.getId(), true);
        test.deleteIdTest(db, book1.getId(), false);
        test.countAllBooksTest(db, 4);

        db.save(book1);
        test.deleteIdTest(db, book1.getId(), true);
        db.deleteByAuthor("A5");
        test.countAllBooksTest(db, 3);

    }

    public void deleteIdTest(BookDatabaseImpl db, Long bookId, boolean answer) {
        checkResults(db.delete(bookId) == answer, "deleteIdTest");
    }

    public void countAllBooksTest(BookDatabaseImpl db, int answer) {
        checkResults(db.countAllBooks() == answer, "countAllBooksTest");
    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
