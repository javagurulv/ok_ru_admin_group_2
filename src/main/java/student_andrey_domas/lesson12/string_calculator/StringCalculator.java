package student_andrey_domas.lesson12.string_calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {

    private Pattern delimiterListPattern = Pattern.compile("\\[([^\\[\\]]+)\\]");
    private Pattern delimiterPattern = Pattern.compile("[,\\n]");

    private Stream<Integer> splitByDelimiterRegexp(String s, Pattern pattern) throws StringCalculatorException {
        String split[] = pattern.split(s);
        Matcher delimiterMatcher = pattern.matcher(s);
        if (delimiterMatcher.results().count() != split.length - 1)
            throw new StringCalculatorException("Wrong number of delimiters");
        return Arrays.stream(pattern.split(s)).map(Integer::valueOf);
    }

    private Pattern extractDelimiters(String s) {
        String[] split = s.split("\n");
        Matcher delimiterListMatcher = delimiterListPattern.matcher(s);
        String delimitersRegexp = delimiterListMatcher.results()
                .map(x -> x.group(1))
                .map(x -> "(" + x + ")")
                .collect(Collectors.joining("|"));  // //[;][&][xxx] -> (;)|(&)|(xxx)
        return Pattern.compile(delimitersRegexp);
    }

    private Stream<Integer> getNumbersStream(String s) throws StringCalculatorException {
        if (s.startsWith("//")) {
            String[] split = s.split("\n");
            System.out.println(extractDelimiters(split[0]));
            splitByDelimiterRegexp(split[1], extractDelimiters(split[0])).forEach(System.out::println);
            return splitByDelimiterRegexp(split[1], extractDelimiters(split[0]));
        } else {
            return splitByDelimiterRegexp(s, delimiterPattern);
        }
    }

    int add(String numbers) throws StringCalculatorException {
        if (numbers.length() == 0)
            return 0;
        Stream<Integer> stream = getNumbersStream(numbers);
        try {
            return stream.collect(Collectors.summingInt(Integer::intValue));
        } catch (NumberFormatException e) {
            throw new StringCalculatorException(e);
        }
    }
}
