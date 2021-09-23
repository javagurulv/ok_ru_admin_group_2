package student_alexander_fateev.lesson9.level_5.task13;

import student_alexander_fateev.lesson2.level_2.task3.Book;

import java.util.ArrayList;
import java.util.List;

class BookMain {
    public static void main(String[] args) {
        List<Object> bookLibrary = new ArrayList<Object>();

        Books book1 = new Books("Some book 1", "Lermontov");
        bookLibrary.add(book1);

        Books book2 = new Books("Some book 1", "Tolstoy");
        bookLibrary.add(book2);


        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Pushkin");
        book.setBookTitle("Some shit");
        if (book.addNewBook(bookLibrary) == true) {
            System.out.println("New book added to the library");
        }
        else {
            System.out.println("ERROR");
        }

        BookReaderImpl book3 = new BookReaderImpl();
        book3.setBookTitle("Buratina");
        book3.setBookAuthor("Pupkin");

        if (book3.removeBook(bookLibrary)) {
            System.out.println("Book was removed");
        }
        else {
            System.out.println("ERROR");
        }

        for (String str: book.listAllBooks(bookLibrary)) {
            System.out.println(str);
        }

        for (String str: book3.findBookByAuthor(bookLibrary, "Lermont")) {
            System.out.println(str);
        }
    }
}
