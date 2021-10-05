package student_alexander_fateev.lesson10;

class SearchCriteriaDemo {
    public static void main(String[] args) {


        AuthorSearchCriteria author = new AuthorSearchCriteria("Kuper");
        TitleSearchCriteria title = new TitleSearchCriteria("Zveroboi");
        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("1890");

        Book book = new Book("Kuper", "Zveroboi");
        book.setYearOfIssue("1890");

        // автор книги "Kuper" и название "Zveroboi"
        AndSearchCriteria fields = new AndSearchCriteria(author, title);
        if (fields.match(book)) {
            System.out.println("author and title: OK");
        }
        else {
            System.out.println("author and title: FAIL");
        }

        // автор книги "Kuper" и год выпуска 1890
        AndSearchCriteria fields1 = new AndSearchCriteria(author, year);
        if (fields.match(book)) {
            System.out.println("author and year: OK");
        }
        else {
            System.out.println("author and year: FAIL");
        }

        // автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
        OrSearchCriteria fields2 = new OrSearchCriteria(author, year);
        OrSearchCriteria fields3 = new OrSearchCriteria(author, title);
        if (fields2.match(book) || fields3.match(book)) {
            System.out.println("author or year or title: OK");
        }
        else {
            System.out.println("author or year or title: FAIL");
        }


    }
}
