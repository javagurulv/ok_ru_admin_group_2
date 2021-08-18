package student_dmitry_samsonov.lesson_9_interfaces.level_5_middle;

class Book {
    private String author;
    private String title;
    private boolean finished;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return (book.author.equals(this.author) && book.title.equals(this.title));
    }
}
