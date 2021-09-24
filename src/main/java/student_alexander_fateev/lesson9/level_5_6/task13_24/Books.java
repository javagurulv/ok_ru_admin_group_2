package student_alexander_fateev.lesson9.level_5_6.task13_24;

class Books {
    private String bookTitle;
    private String bookAuthor;
    private boolean isRead;

    public Books(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.isRead = false;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean isRead() {
        return isRead;
    }

    @Override
    public boolean equals(Object o) {
        Books book = (Books) o;
        return book.bookAuthor.equals(this.bookAuthor)
                && book.bookTitle.equals(this.bookTitle);
    }
}
