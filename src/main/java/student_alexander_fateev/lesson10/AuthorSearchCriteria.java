package student_alexander_fateev.lesson10;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        Book getBook = (Book) book;
        if (getBook.getAuthor().equals(authorToSearch)) {
            return true;
        }
        return false;
    }

}
