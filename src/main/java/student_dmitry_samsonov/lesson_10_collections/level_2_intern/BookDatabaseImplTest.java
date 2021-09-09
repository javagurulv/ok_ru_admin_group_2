package student_dmitry_samsonov.lesson_10_collections.level_2_intern;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book B1 = new Book("A1", "T1");
        Book B2 = new Book("A2", "T2");
        Book B3 = new Book("A2", "T2");
        bookDatabase.save(B1);
        printTestResult("B1 save+findById", bookDatabase.findById(Long.valueOf(1)).isPresent());

        bookDatabase.delete(Long.valueOf(1));
        printTestResult("B1 delete by id + count", bookDatabase.countAllBooks() == 0);

        bookDatabase.save(B1);
        bookDatabase.delete(B1);
        printTestResult("B1 delete obj", bookDatabase.countAllBooks() == 0);

        bookDatabase.save(B1);
        bookDatabase.save(B1);
        printTestResult("B1 x2 find by author", bookDatabase.findByAuthor("A1").size() == 2);
        printTestResult("B1 x2 find by title", bookDatabase.findByTitle("T1").size() == 2);

        bookDatabase.save(B2);
        bookDatabase.deleteByAuthor("A1");
        printTestResult("B1 delete by author", bookDatabase.countAllBooks() == 1);
        bookDatabase.deleteByTitle("T2");
        printTestResult("B1 delete by title", bookDatabase.countAllBooks() == 0);

        bookDatabase.save(B1);
        bookDatabase.save(B2);
        bookDatabase.save(B3);
        printTestResult("findUniqueAuthors", bookDatabase.findUniqueAuthors().size() == 2);
        printTestResult("findUniqueTitles", bookDatabase.findUniqueTitles().size() == 2);
        printTestResult("findUniqueBooks", bookDatabase.findUniqueBooks().size() == 3);
        printTestResult("contains B1", bookDatabase.contains(B1));

        String text = "kj lkj lnu kb u76 u li loi, wef. weoiwe, p, p, p";
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        printTestResult("word count", uniqueWordFinder.find(text).size() == 11);

        printTestResult("getAuthorToBooksMap", bookDatabase.getAuthorToBooksMap().get("A2").size() == 2);
        printTestResult("getEachAuthorBookCount", bookDatabase.getEachAuthorBookCount().get("A2") == 2);
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
