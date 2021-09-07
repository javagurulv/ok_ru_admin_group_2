package student_alexander_zhukov.lesson_9.level_5;

class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        BookReaderImpl library = new BookReaderImpl();
        Book book1 = new Book("Bulgakov", "prose");
        Book book2 = new Book("Tolstoy", "stories");
        Book book3 = new Book("Esenin", "poetry");
        Book book4 = new Book("Esenin", "");
        Book book5 = new Book("", "poetry");
        Book book6 = new Book("Tolxxx", "poetry");

        test.addBookTest(library, book1, true);
        test.addBookTest(library, book2, true);
        test.addBookTest(library, book3, true);
        test.addBookTest(library, book6, true);
        test.addBookTest(library, book1, false);
        test.addBookTest(library, book4, false);
        test.addBookTest(library, book5, false);

        test.removeBookTest(library, book1, true);
        test.removeBookTest(library, book1, false);

        test.addBookTest(library, book1, true);

        for (String i:library.listAllBooks()) {
            System.out.println(i);
        }
        System.out.println("");

        for(Book i:library.findByAuthor("Tol")) {
            System.out.println(i.getAuthor());
        }
        System.out.println("");

        for(Book i:library.findByTitle("sto")) {
            System.out.println(i.getTitle());
        }
        System.out.println("");

        library.setBookFinished(book2);
        library.setBookFinished(book1);
        for (String i:library.listAllFinishedBooks()) {
            System.out.println(i);
        }
        System.out.println("");
        for (String i:library.listAllUnFinishedBooks()) {
            System.out.println(i);
        }

    }

    public void addBookTest(BookReaderImpl library,Book book, boolean answer) {
        checkResults(library.addBook(book) == answer, "addBookTest");
    }

    public void removeBookTest(BookReaderImpl library,Book book, boolean answer) {
        checkResults(library.removeBook(book) == answer, "removeBookTest");
    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
