package student_dmitry_samsonov.lesson_10_collections.level_2_intern;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().isPresent() && book.getYearOfIssue().get().equals(this.yearOfIssueToSearch);
    }

}