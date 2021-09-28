package student_alexander_zhukov.lesson_10.level_1;

class Book {

    private String author;
    private String title;

    Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return (book.author.equals(this.author) && book.title.equals(this.title));
    }
}
