package student_alexander_fateev.lesson10;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        Book getBook = (Book) book;
        if (getBook.getTitle().equals(titleToSearch)) {
            return true;
        }
        return false;
    }

}
