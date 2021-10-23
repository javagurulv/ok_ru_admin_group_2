package student_artem_aleksandrov.lesson10;

import java.util.Objects;

class Book {
    private Long id;
    private String title;
    private String author;
    private String issueYear;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    Book(String author, String title, String issueYear) {
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

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(String issueYear) {
        this.issueYear = issueYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author) && issueYear.equals(book.issueYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, issueYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", issueYear='" + issueYear + '\'' +
                '}';
    }
}

