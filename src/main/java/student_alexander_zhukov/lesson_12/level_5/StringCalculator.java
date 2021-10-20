package student_alexander_zhukov.lesson_12.level_5;

import student_dmitry_samsonov.lesson_5.level_2_intern.Array;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

class StringCalculator {
    public static void main(String[] args) {
        StringCalculator test = new StringCalculator();
        test.add("//[;][&]\n1;2&3");
    }

    int add(String numbers) {

        Pattern pattern = Pattern.compile("//\\[(?<delimiters>(.+))\\]\n(?<numString>(.+))");
        Matcher matcher = pattern.matcher(numbers);

        if (matcher.find()) {
            //System.out.println("delimiters " + matcher.group("delimiters"));
            StringBuilder customSplit = new StringBuilder();
            customSplit.append("[, \n ");
            customSplit.append(matcher.group("delimiters").replace('[', ' ').replace(']',' '));
            customSplit.append("]+");
            String numbersWithoutPatterns = matcher.group("numString");
            int[] arrNumbersWithoutPatterns = Arrays.stream(numbersWithoutPatterns.substring(0, numbersWithoutPatterns.length()).split(customSplit.toString()))
                    .map(String::trim).mapToInt(Integer::parseInt).toArray();
            //System.out.println(Arrays.toString(arrNumbersWithoutPatterns));
            //System.out.println(IntStream.of(arrNumbersWithoutPatterns).sum());
            return IntStream.of(arrNumbersWithoutPatterns).sum();
            } else {
            try {
                int[] arr = Arrays.stream(numbers.substring(0, numbers.length()).split("[, \n]+"))
                        .map(String::trim).mapToInt(Integer::parseInt).toArray();
                //System.out.println(Arrays.toString(arr));
                //System.out.println(IntStream.of(arr).sum());
                return IntStream.of(arr).sum();

            } catch (NumberFormatException e) {
                return 0;
            }
        }


    }

}
