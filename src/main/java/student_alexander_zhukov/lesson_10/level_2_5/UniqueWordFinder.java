package student_alexander_zhukov.lesson_10.level_2_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {
    public Set<String> find(String text) {
        return new HashSet<String>(Arrays.asList(text.split(" ")));
    }
}
