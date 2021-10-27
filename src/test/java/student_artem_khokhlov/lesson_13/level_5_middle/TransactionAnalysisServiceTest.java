package student_artem_khokhlov.lesson_13.level_5_middle;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

class TransactionTestData {

    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }
}

public class TransactionAnalysisServiceTest extends TestCase {
    List<Transaction> transactions = new TransactionTestData().getTransactions();
    TransactionAnalysisService t_service = new TransactionAnalysisService();
    public void testTransactionsByYear() {
        List<Transaction> result = t_service.TransactionsByYear(2011, this.transactions);
        assertEquals(2, result.size());
    }
    public void testCheckCityTrader() {
        assertTrue(t_service.CheckCityTrader("Milan", transactions));
    }
    public void testCheckCityTraderNegative() {
        assertFalse(t_service.CheckCityTrader("Moscow", transactions));
    }
}