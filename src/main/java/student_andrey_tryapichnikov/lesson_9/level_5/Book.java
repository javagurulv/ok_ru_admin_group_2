package student_andrey_tryapichnikov.lesson_9.level_5;

import java.util.Objects;

public class Book {
    String author;
    String title;

    public Book(String title, String author) throws IncompatibleBookIDException {
        if (title.length() < 1 || author.length() < 2) {
            throw new IncompatibleBookIDException("Missing proper title or author!");
        }
        this.title = title;
        this.author = author;
    }

    public String getDescription() {
        return title + " by " + author;
    }

    @Override
    public boolean equals(Object object) {
        if (object.getClass() != Book.class) return false;
        Book book = (Book) object;
        return
        (this.author.equals(book.author) && this.title.equals(book.title));
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
