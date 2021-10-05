package student_alexander_fateev.lesson10;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        Book getBook = (Book) book;
        if (getBook.getYearOfIssue().equals(yearOfIssueToSearch)) {
            return true;
        }
        return false;
    }

}
