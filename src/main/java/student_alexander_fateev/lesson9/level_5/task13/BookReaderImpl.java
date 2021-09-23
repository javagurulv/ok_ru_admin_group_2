package student_alexander_fateev.lesson9.level_5.task13;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader{
    private String bookAuthor;
    private String bookTitle;

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public boolean addNewBook(List<Object> bookLibrary) {
        if (!checkIfEmptyFields()) {
            return false;
        }

        for (Object o: bookLibrary) {
            Books book = (Books) o;
            if (bookAuthor.equals(book.getBookAuthor())
                    && bookTitle.equals(book.getBookTitle())) {
                return false;
            }
        }
        Books newBook = new Books(this.bookTitle, this.bookAuthor);
        bookLibrary.add(newBook);

        return true;
    }

    @Override
    public boolean checkIfEmptyFields() {
        return bookTitle != null && !bookTitle.isEmpty()
                && bookAuthor != null &&!bookAuthor.isEmpty();
    }

    @Override
    public boolean removeBook(List<Object> bookLibrary) {
        Books rmBook = new Books(bookTitle, bookAuthor);
        return bookLibrary.remove(rmBook);
    }

    @Override
    public ArrayList<String> listAllBooks(List<Object> bookLibrary) {
        ArrayList<String> listOfBooks = new ArrayList<String>();

        for (Object o: bookLibrary) {
            Books book = (Books) o;
            listOfBooks.add(book.getBookTitle() + " [" + book.getBookAuthor() + "]");
        }

        return listOfBooks;
    }

    @Override
    public ArrayList<String> findBookByAuthor(List<Object> bookLibrary, String bookAuthor) {
        ArrayList<String> listOfBooks = new ArrayList<String>();

        for (Object o: bookLibrary) {
            Books book = (Books) o;
            if (book.getBookAuthor().startsWith(bookAuthor)) {
                listOfBooks.add(book.getBookTitle() + " [" + book.getBookAuthor() + "]");
            }
        }

        return listOfBooks;
    }
}
