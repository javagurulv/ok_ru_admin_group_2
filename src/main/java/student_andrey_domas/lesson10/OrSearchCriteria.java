package student_andrey_domas.lesson10;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition != null && leftCondition.match(book)
                || rightCondition != null && rightCondition.match(book);
    }

    @Override
    public int compare(Book o1, Book o2) {
        int leftSorted = leftCondition == null ? 0: leftCondition.compare(o1, o2);
        if (leftSorted > 0)
            return leftSorted;

        int rightSorted = rightCondition == null ? 0: rightCondition.compare(o1, o2);
        return leftSorted;
    }

}
