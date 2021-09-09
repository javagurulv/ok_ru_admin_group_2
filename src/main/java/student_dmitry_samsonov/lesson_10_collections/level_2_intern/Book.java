package student_dmitry_samsonov.lesson_10_collections.level_2_intern;

import java.util.Objects;
import java.util.Optional;

public class Book {
    private Long id;
    private String title;
    private String author;
    private Optional<String> yearOfIssue = Optional.ofNullable(null);

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = Optional.of(yearOfIssue);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Optional<String> getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Optional<String> yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}