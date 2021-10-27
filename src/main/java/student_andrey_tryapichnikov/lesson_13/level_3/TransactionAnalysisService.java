package student_andrey_tryapichnikov.lesson_13.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {
    public List<Transaction> getTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions
                .stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> getTransactionsSortedByValueAsc(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> getTransactionsSortedByValueDesc(List<Transaction> transactions) {
        return transactions
                .stream()
                .sorted(Comparator.comparing(Transaction::getValue, Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }

    public List<Transaction> getTransactionsByYear2011SortedByValueAsc(List<Transaction> transactions) {
        return getTransactionsSortedByValueAsc(getTransactionsByYear(transactions, 2011));
    }
}
