package student_alexander_zhukov.lesson_13.level_3_6;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueReversed(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactions2011AndSort(List<Transaction> transactions) {
        return this.sortTransactionsByValue(this.findTransactionsIn2011(transactions));
    }

    public List<Integer> findTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> findTransactionsYearsUniq(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> findTransactionsTradersUniq(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findTransactionsCitiesUniq(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<String> findTransactionsFromCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(cityToFind))
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public boolean isAnyTraderBasedOnMilan(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    public int maxValue(List<Transaction> transactions) {

        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .map(Transaction::getValue)
                .collect(Collectors.toList())
                .get(0);
    }

    public int minValue(List<Transaction> transactions) {

        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .map(Transaction::getValue)
                .collect(Collectors.toList())
                .get(0);
    }

    public String tradersList(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet()).stream()
                .sorted()
                .collect(Collectors.joining(","));
    }

    public String citiesList(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet()).stream()
                .sorted()
                .collect(Collectors.joining(","));
    }

}
