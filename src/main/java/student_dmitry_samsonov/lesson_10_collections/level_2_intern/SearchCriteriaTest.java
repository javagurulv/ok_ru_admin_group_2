package student_dmitry_samsonov.lesson_10_collections.level_2_intern;

public class SearchCriteriaTest {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book B1 = new Book("A1", "T1", "1900");
        Book B2 = new Book("A2", "T2", "2000");
        Book B3 = new Book("Kuper", "Zveroboi", "1890");
        bookDatabase.save(B1);
        bookDatabase.save(B2);
        bookDatabase.save(B3);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        printTestResult("authorSearchCriteria", authorSearchCriteria.match(B3));
        printTestResult("!authorSearchCriteria", !authorSearchCriteria.match(B1));
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        printTestResult("titleSearchCriteria", titleSearchCriteria.match(B3));
        printTestResult("!titleSearchCriteria", !titleSearchCriteria.match(B1));
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        printTestResult("andSearchCriteria", andSearchCriteria.match(B3));
        printTestResult("!andSearchCriteria", !andSearchCriteria.match(B1));
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        printTestResult("yearOfIssueSearchCriteria", yearOfIssueSearchCriteria.match(B3));
        printTestResult("!yearOfIssueSearchCriteria", !yearOfIssueSearchCriteria.match(B1));
        SearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        printTestResult("andSearchCriteria1", andSearchCriteria1.match(B3));
        printTestResult("!andSearchCriteria1", !andSearchCriteria1.match(B1));
        SearchCriteria authorSearchCriteria1 = new AuthorSearchCriteria("A1");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria1, yearOfIssueSearchCriteria);
        printTestResult("orSearchCriteria B3", orSearchCriteria.match(B3));
        printTestResult("orSearchCriteria B1", orSearchCriteria.match(B1));
        SearchCriteria orSearchCriteria1 = new OrSearchCriteria(orSearchCriteria, titleSearchCriteria);
        printTestResult("orSearchCriteria1 B3", orSearchCriteria1.match(B3));
        printTestResult("orSearchCriteria1 B1", orSearchCriteria1.match(B1));
        printTestResult("!orSearchCriteria1 B2", !orSearchCriteria1.match(B2));
        printTestResult("bookDatabase.find B1 and B3", bookDatabase.find(orSearchCriteria1).size() == 2);
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }

}
