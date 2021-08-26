package student_dmitry_samsonov.lesson_9_interfaces.level_3_junior;

class ProductDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("A");
        Product product2 = new Product("B");
        Product product3 = new Product("C");
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        printTestResult("Length 2", inMemoryDatabase.products.length == 2);
        printTestResult("Find 2", product2.equals(inMemoryDatabase.findByTitle("B").get()));
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
