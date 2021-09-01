package student_dmitry_samsonov.lesson_10_collections.level_1_intern;

class Book {
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
    public boolean equals(Object obj) {
        Book otherBook = (Book) obj;
        return this.author.equals(otherBook.author) && this.title.equals(otherBook.title);
    }
}