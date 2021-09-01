package student_dmitry_samsonov.lesson_10_collections.level_2_intern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {
    Set<String> find(String text) {
        return new HashSet<String>(Arrays.asList(text.split("\\W+")));
    }
}
