package student_artem_khokhlov.lesson_12.level_5_middle;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {
    public int add(String numbers) {
        List<String> parsed = List.of(numbers.split(","));
        if (parsed.size() == 0 || numbers.isEmpty()) {
            return 0;
        }
        try {
            return parsed.stream().map(Integer::parseInt).mapToInt(Integer::intValue).sum();
        }
        catch (NumberFormatException e) {
            System.out.println("incorrect input: " + e);
            return 0;
        }
    }
}
