package student_dmitry_samsonov.lesson_9_interfaces.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader{
    private List<Book> books;

    public BookReaderImpl(){
        this.books = new ArrayList<>();
    }

    @Override
    public boolean addBook(Book book){
        if (this.books.contains(book)) {
            return false;
        } else {
            this.books.add(book);
            return true;
        }
    }
    @Override
    public boolean delBook(Book book){
        if (this.books.contains(book)) {
            this.books.remove(book);
            return true;
        } else {
            return false;
        }
    }
    public List<String> getAllBooks(){
        List<String> allBooks = new ArrayList<String>();
        for (Book book:this.books) {
            allBooks.add(String.format("%s [%s]", book.getTitle(), book.getAuthor()));
        }
        return allBooks;
    }
    public List<Book> getBooksByAuthor(String author){
        List<Book> authorsBooks = new ArrayList<Book>();
        for (Book book:this.books) {
            if (book.getAuthor().equals(author) || book.getAuthor().startsWith(author)){
                authorsBooks.add(book);
            }
        }
        return authorsBooks;
    }
    public List<Book> getBooksByTitle(String title){
        List<Book> booksByTitle = new ArrayList<Book>();
        for (Book book:this.books) {
            if (book.getTitle().equals(title) || book.getTitle().startsWith(title)){
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }
    public boolean setBookFinished(Book book){
        if (this.books.contains(book)){
            book.setFinished(true);
            return true;
        } else {
            return false;
        }
    }
    public boolean setBookNew(Book book){
        if (this.books.contains(book)){
            book.setFinished(false);
            return true;
        } else {
            return false;
        }
    }
    public List<String> getFinishedBooks(){
        List<String> finishedBooks = new ArrayList<String>();
        for (Book book:this.books) {
            if (book.isFinished()) {
                finishedBooks.add(String.format("%s [%s]", book.getTitle(), book.getAuthor()));
            }
        }
        return finishedBooks;
    }
    public List<String> getNewBooks(){
        List<String> newBooks = new ArrayList<String>();
        for (Book book:this.books) {
            if (!book.isFinished()) {
                newBooks.add(String.format("%s [%s]", book.getTitle(), book.getAuthor()));
            }
        }
        return newBooks;
    }
}
