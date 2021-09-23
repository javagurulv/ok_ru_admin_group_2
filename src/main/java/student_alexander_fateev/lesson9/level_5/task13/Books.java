package student_alexander_fateev.lesson9.level_5.task13;

class Books {
    private String bookTitle;
    private String bookAuthor;

    public Books(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    @Override
    public boolean equals(Object o) {
        Books book = (Books) o;
        return book.bookAuthor.equals(this.bookAuthor)
                && book.bookTitle.equals(this.bookTitle);
    }
}
