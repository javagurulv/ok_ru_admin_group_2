package student_andrey_domas.lesson10;

public class SortedSearchCriteria implements SearchCriteria {
    @Override
    public boolean match(Book book) {
        return true;
    }

    private String book2String(Book book) {
        StringBuilder sb = new StringBuilder();
        sb.append(book.getAuthor());
        sb.append(book.getTitle());
        sb.append(book.getIssueYear());
        return sb.toString();
    }

    @Override
    public int compare(Book o1, Book o2) {
        return book2String(o1).compareTo(book2String(o2));
    }
}
