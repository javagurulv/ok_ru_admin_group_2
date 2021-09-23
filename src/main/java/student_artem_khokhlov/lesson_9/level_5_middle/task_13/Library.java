package student_artem_khokhlov.lesson_9.level_5_middle.task_13;

import java.util.HashSet;
import java.util.LinkedList;

public class Library {
    HashSet<Book> books;

    public Library(HashSet<Book> books) {
        this.books = books;
    }

    public boolean add(Book book) {
        if(books.contains(book)) {
            return false;
        }
        else {
            books.add(book);
            return true;
        }
    }
}
