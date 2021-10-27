package student_andrey_tryapichnikov.lesson_13.level_3;

import org.junit.Assert;
import org.junit.Test;

public class TransactionAnalysisServiceTest {
    TransactionTestData testData = new TransactionTestData();
    TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    public void testYear2011() {
        var expectedData = testData.getTransactionsByYear2011();
        var filteredData = service.getTransactionsByYear(testData.getTransactions(), 2011);
        Assert.assertEquals(expectedData, filteredData);
    }

    @Test
    public void testYear2012() {
        var expectedData = testData.getTransactionsByYear2012();
        var filteredData = service.getTransactionsByYear(testData.getTransactions(), 2012);
        Assert.assertEquals(expectedData, filteredData);
    }

    @Test
    public void testSortedByValueAsc() {
        var expectedData = testData.getSortedByValueAsc();
        var sortedData = service.getTransactionsSortedByValueAsc(testData.getTransactions());
        Assert.assertEquals(expectedData, sortedData);
    }

    @Test
    public void testSortedByValueDesc() {
        var expectedData = testData.getSortedByValueDesc();
        var sortedData = service.getTransactionsSortedByValueDesc(testData.getTransactions());
        Assert.assertEquals(expectedData, sortedData);
    }

    @Test
    public void testYear2011SortedByValuesAsc() {
        var expectedData = testData.getTransactionsByYear2011SortedByValueAsc();
        var sortedData = service.getTransactionsByYear2011SortedByValueAsc(testData.getTransactions());
        Assert.assertEquals(expectedData, sortedData);
    }
}