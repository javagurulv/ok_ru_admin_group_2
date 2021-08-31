package student_andrey_domas.lesson13;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class TransactionAnalysisService {
    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

    public List<Transaction> sort(List<Transaction> transactions, boolean desc) {
        return transactions.stream().sorted((t1, t2) -> {
            int v1 = t1.getValue();
            int v2 = t2.getValue();
            return desc ? v2 - v1 : v1 - v2;
        }).toList();
    }

    private Stream<Integer> yearsWithTransactionsStream(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getYear);
    }

    public Integer[] yearsWithTransactions(List<Transaction> transactions) {
        return yearsWithTransactionsStream(transactions).toArray(Integer[]::new);
    }

    public Integer[] yearsWithTransactionsUnique(List<Transaction> transactions) {
        return yearsWithTransactionsStream(transactions).collect(Collectors.toSet()).toArray(Integer[]::new);
    }

    private Stream<Trader> allTradersStream(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader);
    }

    public String[] allTraders(List<Transaction> transactions) {
        return allTradersStream(transactions)
                .map(Trader::getName)
                .collect(Collectors.toSet())
                .toArray(String[]::new);
    }

    public String[] allCities(List<Transaction> transactions) {
        return allTradersStream(transactions)
                .map(Trader::getCity)
                .collect(Collectors.toSet())
                .toArray(String[]::new);
    }

    public String[] findTraderNamesFromCity(List<Transaction> transactions, String city) {
        return allTradersStream(transactions)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet())
                .toArray(String[]::new);
    }

    public boolean isAnyTraderInCity(List<Transaction> transactions, String city) {
        return transactions.stream().anyMatch(t -> t.getTrader().getCity().equals(city));
    }

    public Optional<Integer> maxTransactionValue(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getValue).max(Integer::compareTo);
    }

    public Optional<Integer> minTransactionValue(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getValue).min(Integer::compareTo);
    }

    public String allTraderNamesCommaJoin(List<Transaction> transactions) {
        return allTradersStream(transactions)
                .map(Trader::getName)
                .collect(toSet()).stream()
                .sorted()
                .collect(Collectors.joining(","));
    }

    public String allCitiesCommaJoin(List<Transaction> transactions) {
        return allTradersStream(transactions)
                .map(Trader::getCity)
                .collect(toSet()).stream()
                .sorted()
                .collect(Collectors.joining(","));
    }
}
