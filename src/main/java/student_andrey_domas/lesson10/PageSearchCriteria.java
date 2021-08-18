package student_andrey_domas.lesson10;

public class PageSearchCriteria implements SearchCriteria {
    private long page;
    private long pageLimit;
    private long counter = 0;

    public PageSearchCriteria(long page, long pageLimit) {
        this.page = page;
        this.pageLimit = pageLimit;
    }

    @Override
    public boolean match(Book book) {
        return counter++ / pageLimit == page;
    }
}
