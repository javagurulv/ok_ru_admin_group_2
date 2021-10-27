package student_artem_khokhlov.lesson_13.level_5_middle;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {
    public List<Transaction> TransactionsByYear(int year, List<Transaction> transactions) {
        return transactions.stream().filter(t -> t.getYear() == year).collect(Collectors.toList());
    }
    public boolean CheckCityTrader(String city, List<Transaction> transastions) {
        List<String> cities = transastions.stream().map(Transaction::getTrader).map(Trader::getCity)
                .collect(Collectors.toList());
        return cities.stream().anyMatch(c -> c.equals(city));
    }
}
