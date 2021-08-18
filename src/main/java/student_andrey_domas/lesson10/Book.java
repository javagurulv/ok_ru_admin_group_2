package student_andrey_domas.lesson10;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String issueYear;

    public Book(String author, String title, String issueYear) {
        this.author = author;
        this.title = title;
        this.issueYear = issueYear;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getIssueYear() {
        return issueYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        // book.id was removed because ID is just a sign that instance has been saved to the database or not
        // unsaved Book instance (with id == null) can be equal to a saved one.
        return title.equals(book.title)
                && author.equals(book.author)
                && issueYear.equals(book.issueYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}