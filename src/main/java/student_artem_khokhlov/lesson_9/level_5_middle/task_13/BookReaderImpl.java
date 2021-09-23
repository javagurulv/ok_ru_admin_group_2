package student_artem_khokhlov.lesson_9.level_5_middle.task_13;

public class BookReaderImpl implements BookReader {

    Library library;
    public BookReaderImpl(Library library) {
        this.library = library;
    }

    @Override
    public Boolean addBook(Book book) {

        return this.library.add(book);
    }
}
