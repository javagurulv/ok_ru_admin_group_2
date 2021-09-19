package student_dmitry_samsonov.lesson_13_streams.level_3_junior;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();

    @Test
    public void findTransactionsIn2011() {
        Assert.assertEquals(2,
                transactionAnalysisService.findTransactionsIn2011(transactionTestData.getTransactions()).size());
    }
    @Test
    public void findTransactionsIn2012() {
        Assert.assertEquals(4,
                transactionAnalysisService.findTransactionsByYear(transactionTestData.getTransactions(), 2012).size());
    }
    @Test
    public void sortTransactionsByValue() {
        Assert.assertEquals(300,
                transactionAnalysisService.sortTransactionsByValue(transactionTestData.getTransactions()).get(0).getValue());
    }

    @Test
    public void findTransactionsIn2011Sort() {
        Assert.assertEquals(300,
                transactionAnalysisService.findTransactionsIn2011SortAsc(transactionTestData.getTransactions()).get(0).getValue());
    }

    @Test
    public void findAllTransactionYears() {
        Assert.assertEquals(Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012),
                transactionAnalysisService.findAllTransactionYears(transactionTestData.getTransactions()));
    }

    @Test
    public void findAllTransactionUniqueYears() {
        Assert.assertEquals(Set.of(2011, 2012),
                transactionAnalysisService.findAllTransactionUniqueYears(transactionTestData.getTransactions()));
    }

    @Test
    public void findAllTraderUniqueNames() {
        Assert.assertEquals(Set.of("Raoul", "Mario", "Alan", "Brian"),
                transactionAnalysisService.findAllTraderUniqueNames(transactionTestData.getTransactions()));
    }

    @Test
    public void findAllTraderUniqueCities() {
        Assert.assertEquals(Set.of("Cambridge", "Milan"),
                transactionAnalysisService.findAllTraderUniqueCities(transactionTestData.getTransactions()));
    }

    @Test
    public void findAllTraderUniqueNamesFromCambridge() {
        Assert.assertEquals(Set.of("Raoul", "Alan", "Brian"),
                transactionAnalysisService.findAllTraderUniqueNamesFromCambridge(transactionTestData.getTransactions()));
    }

    @Test
    public void findAllTraderUniqueNamesFromCambridge2() {
        Assert.assertEquals(Set.of("Raoul", "Alan", "Brian"),
                transactionAnalysisService.findAllTraderUniqueNamesFromCity(transactionTestData.getTransactions(),
                        "Cambridge"));
    }

    @Test
    public void isAnyTraderBasedOnMilan() {
        Assert.assertTrue(transactionAnalysisService.isAnyTraderBasedOnMilan(transactionTestData.getTransactions(),
                        "Milan"));
    }

    @Test
    public void findMaxValue() {
        Assert.assertEquals(Optional.ofNullable(1000),
                transactionAnalysisService.findMaxValue(transactionTestData.getTransactions()));
    }

    @Test
    public void findMinValue() {
        Assert.assertEquals(Optional.ofNullable(300),
                transactionAnalysisService.findMinValue(transactionTestData.getTransactions()));
    }

    @Test
    public void getAllTraderUniqueNames() {
        Assert.assertEquals("Alan, Brian, Mario, Raoul",
                transactionAnalysisService.getAllTraderUniqueNames(transactionTestData.getTransactions()));
    }

    @Test
    public void getAllTraderUniqueCities() {
        Assert.assertEquals("Cambridge, Milan",
                transactionAnalysisService.getAllTraderUniqueCities(transactionTestData.getTransactions()));
    }

}