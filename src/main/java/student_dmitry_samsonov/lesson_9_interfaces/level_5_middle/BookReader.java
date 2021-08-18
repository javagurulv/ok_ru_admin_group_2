package student_dmitry_samsonov.lesson_9_interfaces.level_5_middle;

import java.util.List;

interface BookReader {
    public boolean addBook(Book Book);
    public boolean delBook(Book Book);
    public List<String> getAllBooks();
    public List<Book> getBooksByAuthor(String author);
    public List<Book> getBooksByTitle(String title);
    public boolean setBookFinished(Book book);
    public boolean setBookNew(Book book);
    public List<String> getFinishedBooks();
    public List<String> getNewBooks();
}
