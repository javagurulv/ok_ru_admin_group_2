package student_andrey_domas.lesson10;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        String issueYear = book.getIssueYear();
        return yearOfIssueToSearch != null && issueYear != null && issueYear.contains(yearOfIssueToSearch);
    }

}