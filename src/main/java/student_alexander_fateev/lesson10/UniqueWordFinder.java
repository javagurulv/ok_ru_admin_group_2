package student_alexander_fateev.lesson10;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {
    Set<String> find(String text) {
        HashSet<String> uniqueWords = new HashSet<>();
        String[] splited = text.split("\\s+");

        for (String s: splited) {
            uniqueWords.add(s);
        }

        return uniqueWords;
    }
}
