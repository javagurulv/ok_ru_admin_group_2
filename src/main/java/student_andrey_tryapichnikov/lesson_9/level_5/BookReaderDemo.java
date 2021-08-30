package student_andrey_tryapichnikov.lesson_9.level_5;

public class BookReaderDemo {
    BookReader reader = new BookReaderImpl();

    public static void main(String[] args) {
        BookReaderDemo demo = new BookReaderDemo();
        demo.testBook("Unknown", "");
        demo.testBook("Dune", "Frank Herbert");
        demo.testBook("Solaris", "Stanisław Lem");
        demo.testBook("Solaris", "Stanisław Lem");
    }

    void testBook(String title, String author) {
        Book book;
        try {
            book = new Book(title, author);
            if (reader.addBook(book)) {
                System.out.printf("%s has been successfully added!\n", book.getDescription());
            } else {
                System.out.printf("Failed to add %s! Already present.\n", book.getDescription());
            }
        } catch (IncompatibleBookIDException e) {
            System.out.printf("Cannot add %s by %s: %s\n", title, author, e.getMessage());
        }
    }
}
