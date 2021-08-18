package student_andrey_domas.lesson10;

import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class UniqueWordFinder {
    private Pattern pattern = Pattern.compile("\\w+");

    Set<String> find(String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.results().map(MatchResult::group).collect(Collectors.toSet());
    }
}
