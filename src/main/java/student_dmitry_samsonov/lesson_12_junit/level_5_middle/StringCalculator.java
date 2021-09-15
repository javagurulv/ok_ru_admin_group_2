package student_dmitry_samsonov.lesson_12_junit.level_5_middle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {
    int add(String numbers) throws IllegalArgumentException {
        int sum = 0;
        if (numbers.length() == 0){
            return sum;
        }
        if (numbers.endsWith("\n")) {
            throw new IllegalArgumentException("Newline forbidden in the end of the input");
        }
        Pattern pattern = Pattern.compile("//(?<delimiters>(\\[[^]]+\\])+)\\n\\[(?<numbers>.*)\\]");
        Matcher matcher = pattern.matcher(numbers);
        String[] parts;
        if (matcher.matches()) {
            StringBuilder customPattern = new StringBuilder().append("[");
            Pattern pattern1 = Pattern.compile("\\[(?<delimiter>[^]]+)\\]");
            Matcher matcher1 = pattern1.matcher(matcher.group("delimiters"));
            while (matcher1.find()) {
                customPattern.append(matcher1.group("delimiter"));
            }
            customPattern.append("]+");
            parts = matcher.group("numbers").split(customPattern.toString());
        } else {
            parts = numbers.split("[,\n]+");
        }
        for (String i:parts) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }
}
