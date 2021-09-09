package student_alexander_zhukov.lesson_9.level_5;

class Book {

    private String author;
    private String title;
    private boolean finished = false;

    Book (String author, String title) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return (book.author.equals(this.author) && book.title.equals(this.title));
    }
}
