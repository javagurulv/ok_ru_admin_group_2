package student_andrey_domas.lesson10;

import java.util.Comparator;

interface SearchCriteria extends Comparator<Book> {
    boolean match(Book book);

    @Override
    default int compare(Book o1, Book o2) {
        return 0;
    }

}
