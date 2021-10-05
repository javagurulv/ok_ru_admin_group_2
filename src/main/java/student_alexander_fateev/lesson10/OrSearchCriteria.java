package student_alexander_fateev.lesson10;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        Book getBook = (Book) book;

        if (leftCondition.match(book) || rightCondition.match(book)) {
            return true;
        }
        return false;
    }

}
