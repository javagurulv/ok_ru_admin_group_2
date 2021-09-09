package student_alexander_zhukov.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private List<Book> library;

    public BookReaderImpl() {
        this.library = new ArrayList<>();
    }

    @Override
    public boolean addBook (Book book) {
        if (this.library.contains(book) || book.getAuthor().equals("") || book.getTitle().equals("")) {
            return false;
        } else {
            this.library.add(book);
            return true;
        }
    }

    @Override
    public boolean removeBook(Book book) {
        if (this.library.contains(book)) {
            this.library.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<String> listAllBooks() {
        List<String> result = new ArrayList<>();
        for (Book i:this.library) {
            result.add(i.getTitle() + " [" + i.getAuthor() + "]");
        }
        return result;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book i:this.library) {
            if (i.getAuthor().startsWith(author))
                result.add(i);
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book i:this.library) {
            if (i.getTitle().startsWith(title))
                result.add(i);
        }
        return result;
    }

    @Override
    public boolean setBookFinished(Book book) {
        if (this.library.contains(book) && !book.isFinished()) {
            book.setFinished(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean setBookUnFinished(Book book) {
        if (this.library.contains(book) && book.isFinished()) {
            book.setFinished(false);
            return true;
        }
        return false;
    }

    @Override
    public List<String> listAllFinishedBooks() {
        List<String> result = new ArrayList<>();
        for (Book i:this.library) {
            if (i.isFinished()) {
                result.add(i.getTitle() + " [" + i.getAuthor() + "]");
            }
        }
        return result;
    }

    @Override
    public List<String> listAllUnFinishedBooks() {
        List<String> result = new ArrayList<>();
        for (Book i:this.library) {
            if (!i.isFinished()) {
                result.add(i.getTitle() + " [" + i.getAuthor() + "]");
            }
        }
        return result;
    }

}
