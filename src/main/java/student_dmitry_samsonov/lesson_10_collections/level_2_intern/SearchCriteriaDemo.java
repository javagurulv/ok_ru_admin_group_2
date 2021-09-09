package student_dmitry_samsonov.lesson_10_collections.level_2_intern;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria orSearchCriteria1 = new OrSearchCriteria(orSearchCriteria, titleSearchCriteria);
    }
}