package student_andrey_domas.lesson13;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TransactionAnalysisServiceTest {

    private TransactionAnalysisService tas;
    private TransactionTestData ttd = new TransactionTestData();

    @Before
    public void setUp() {
        tas = new TransactionAnalysisService();
    }

    @Test
    public void findTransactionsByYear() {
        for (int year = 2011; year < 2013; year++) {
            List<Transaction> transactions = tas.findTransactionsByYear(ttd.getTransactions(), year);
            for (Transaction transaction : transactions)
                Assert.assertEquals(year, transaction.getYear());
        }
    }

    @Test
    public void findTransactionsByYearNotFound() {
        for (int year = 3000; year < 3050; year++) {
            List<Transaction> transactions = tas.findTransactionsByYear(ttd.getTransactions(), year);
            Assert.assertEquals(0, transactions.size());
        }
    }

    @Test
    public void sortAsc() {
        List<Transaction> transactions = tas.sort(ttd.getTransactions(), false);
        int prevValue = 0;
        for (Transaction transaction: transactions) {
            Assert.assertTrue(transaction.getValue() > prevValue);
            prevValue = transaction.getValue();
        }
    }

    @Test
    public void sortDesc() {
        List<Transaction> transactions = tas.sort(ttd.getTransactions(), true);
        int prevValue = Integer.MAX_VALUE;
        for (Transaction transaction: transactions) {
            Assert.assertTrue(transaction.getValue() < prevValue);
            prevValue = transaction.getValue();
        }
    }

    @Test
    public void yearsWithTransactions() {
        Integer[] years = tas.yearsWithTransactions(ttd.getTransactions());
        Integer[] yearsSorted = Arrays.stream(years).sorted().toArray(Integer[]::new);
        Integer[] expected = {2011, 2011, 2012, 2012, 2012, 2012};
        Assert.assertArrayEquals(expected, yearsSorted);
    }

    @Test
    public void yearsWithTransactionsUnique() {
        Integer[] years = tas.yearsWithTransactionsUnique(ttd.getTransactions());
        Integer[] yearsSorted = Arrays.stream(years).sorted().toArray(Integer[]::new);
        Integer[] expected = {2011, 2012};
        Assert.assertArrayEquals(expected, yearsSorted);
    }

    @Test
    public void allTraders() {
        String[] traders = tas.allTraders(ttd.getTransactions());
        String[] tradersSorted = Arrays.stream(traders).sorted().toArray(String[]::new);
        String[] expected = {"Alan", "Brian", "Mario", "Raoul"};
        Assert.assertArrayEquals(expected, tradersSorted);
    }

    @Test
    public void allCities() {
        String[] cities = tas.allCities(ttd.getTransactions());
        String[] citiesSorted = Arrays.stream(cities).sorted().toArray(String[]::new);
        String[] expected = {"Cambridge", "Milan"};
        Assert.assertArrayEquals(expected, citiesSorted);
    }

    @Test
    public void findTraderNamesFromCityCambridge() {
        String[] traders = tas.findTraderNamesFromCity(ttd.getTransactions(), "Cambridge");
        String[] tradersSorted = Arrays.stream(traders).sorted().toArray(String[]::new);
        String[] expected = {"Alan", "Brian", "Raoul"};
        Assert.assertArrayEquals(expected, tradersSorted);
    }

    @Test
    public void findTraderNamesFromCityNull() {
        String[] traders = tas.findTraderNamesFromCity(ttd.getTransactions(), null);
        Assert.assertEquals(0, traders.length);
    }

    @Test
    public void isAnyTraderInCity() {
        Assert.assertTrue(tas.isAnyTraderInCity(ttd.getTransactions(), "Milan"));
    }

    @Test
    public void isAnyTraderInCityFalse() {
        Assert.assertFalse(tas.isAnyTraderInCity(ttd.getTransactions(), "Muhosransk"));
    }

    @Test
    public void maxTransactionValue() {
        Optional<Integer> oMax = tas.maxTransactionValue(ttd.getTransactions());
        Assert.assertTrue(oMax.isPresent());
        Assert.assertEquals(1000, oMax.get().intValue());
    }

    @Test
    public void maxTransactionValueEmptyList() {
        Optional<Integer> oMax = tas.maxTransactionValue(new ArrayList<>());
        Assert.assertTrue(oMax.isEmpty());
    }

    @Test
    public void minTransactionValue() {
        Optional<Integer> oMax = tas.minTransactionValue(ttd.getTransactions());
        Assert.assertTrue(oMax.isPresent());
        Assert.assertEquals(300, oMax.get().intValue());
    }

    @Test
    public void minTransactionValueEmptyList() {
        Optional<Integer> oMax = tas.minTransactionValue(new ArrayList<>());
        Assert.assertTrue(oMax.isEmpty());
    }

    @Test
    public void allTraderNamesCommaJoin() {
        String tradersCommaJoin = tas.allTraderNamesCommaJoin(ttd.getTransactions());
        Assert.assertEquals("Alan,Brian,Mario,Raoul", tradersCommaJoin);
    }

    @Test
    public void allTraderNamesCommaJoinEmptyList() {
        String tradersCommaJoin = tas.allTraderNamesCommaJoin(new ArrayList<>());
        Assert.assertEquals("", tradersCommaJoin);
    }

    @Test
    public void allCitiesCommaJoin() {
        String tradersCommaJoin = tas.allCitiesCommaJoin(ttd.getTransactions());
        Assert.assertEquals("Cambridge,Milan", tradersCommaJoin);
    }

    @Test
    public void allCitiesCommaJoinEmptyList() {
        String tradersCommaJoin = tas.allCitiesCommaJoin(new ArrayList<>());
        Assert.assertEquals("", tradersCommaJoin);
    }
}