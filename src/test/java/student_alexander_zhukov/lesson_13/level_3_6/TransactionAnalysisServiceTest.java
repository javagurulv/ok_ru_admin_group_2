package student_alexander_zhukov.lesson_13.level_3_6;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService test = new TransactionAnalysisService();
    TransactionTestData data = new TransactionTestData();

    @Test
    public void findTrans2011() {
        Assert.assertEquals(2, test.findTransactionsIn2011(data.getTransactions()).size());
    }

    @Test
    public void sortTransactionsByValue() {
        Assert.assertEquals(300,
                test.sortTransactionsByValue(data.getTransactions()).get(0).getValue());
    }

    @Test
    public void sortTransactionsByValueReverse() {
        Assert.assertEquals(1000,
                test.sortTransactionsByValueReversed(data.getTransactions()).get(0).getValue());
    }

    @Test
    public void findTransactionsIn2011Sort() {
        Assert.assertEquals(300,
                test.findTransactions2011AndSort(data.getTransactions()).get(0).getValue());
    }

    @Test
    public void findTransactionsYears() {
        Assert.assertEquals(Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012),
                test.findTransactionsYears(data.getTransactions()));
    }

    @Test
    public void findTransactionsYearsUniq() {
        Assert.assertEquals(Set.of(2011, 2012),
                test.findTransactionsYearsUniq(data.getTransactions()));
    }

    @Test
    public void findTransactionsTradersUniq() {
        Assert.assertEquals(Set.of("Raoul", "Mario", "Alan", "Brian"),
                test.findTransactionsTradersUniq(data.getTransactions()));
    }

    @Test
    public void findTransactionsCitiesUniq() {
        Assert.assertEquals(Set.of("Cambridge", "Milan"),
                test.findTransactionsCitiesUniq(data.getTransactions()));
    }

    @Test
    public void findTransactionsFromCambridge() {
        Assert.assertEquals(Set.of("Raoul", "Alan", "Brian"),
                test.findTransactionsFromCambridge(data.getTransactions()));
    }

    @Test
    public void isAnyTraderBasedOnMilan() {
        Assert.assertTrue(test.isAnyTraderBasedOnMilan(data.getTransactions()));
    }

    @Test
    public void tradersList() {
        Assert.assertEquals("Alan,Brian,Mario,Raoul",
                test.tradersList(data.getTransactions()));
    }

    @Test
    public void citiesList() {
        Assert.assertEquals("Cambridge,Milan",
                test.citiesList(data.getTransactions()));
    }

}