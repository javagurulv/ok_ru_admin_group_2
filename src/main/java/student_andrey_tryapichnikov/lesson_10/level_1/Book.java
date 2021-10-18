package student_andrey_tryapichnikov.lesson_10.level_1;

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object book) {
        if (book.getClass() != Book.class) return false;
        Book actualBook = (Book) book;
        return this.author.equals(actualBook.author) && this.title.equals(actualBook.title);
    }
}
