package student_dmitry_samsonov.lesson_13_streams.level_3_junior;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream().filter(
                (Transaction transaction) -> transaction.getYear() == 2011).collect(Collectors.toList()
        );
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream().filter(
                (Transaction transaction) -> transaction.getYear() == year).collect(Collectors.toList()
        );
    }

    public List<Transaction> sortTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList()
        );
    }

    public List<Transaction> findTransactionsIn2011SortAsc(List<Transaction> transactions) {
        return sortTransactionsByValue(findTransactionsByYear(transactions, 2011));
    }

    public List<Integer> findAllTransactionYears(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getYear).collect(Collectors.toList());
    }

    public Set<Integer> findAllTransactionUniqueYears(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getYear).collect(Collectors.toSet());
    }

    public Set<String> findAllTraderUniqueNames(List <Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).map(Trader::getName).collect(Collectors.toSet());
    }

    public Set<String> findAllTraderUniqueCities(List <Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).map(Trader::getCity).collect(Collectors.toSet());
    }

    public Set<String> findAllTraderUniqueNamesFromCambridge(List <Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter((Trader trader)-> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findAllTraderUniqueNamesFromCity(List <Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter((Trader trader)-> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public boolean isAnyTraderBasedOnMilan(List <Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch((Trader trader)-> trader.getCity().equals(city));
    }

    public Optional<Integer> findMaxValue(List <Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparingInt(Integer::intValue));
    }

    public Optional<Integer> findMinValue(List <Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.comparingInt(Integer::intValue));
    }

    public String getAllTraderUniqueNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted(Comparator.comparing(String::toString))
                .collect(Collectors.joining(", "));
    }

    public String getAllTraderUniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted(Comparator.comparing(String::toString))
                .collect(Collectors.joining(", "));
    }

}