package student_dmitry_samsonov.lesson_9_interfaces.level_5_middle;

class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("author", "title");
        Book book2 = new Book("author", "title");
        Book book3 = new Book("author", "title1");
        printTestResult("Equal book", book1.equals(book2));
        printTestResult("Non equal book", !book1.equals(book3));
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
