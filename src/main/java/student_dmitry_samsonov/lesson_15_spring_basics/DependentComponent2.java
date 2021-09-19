package student_dmitry_samsonov.lesson_15_spring_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import student_dmitry_samsonov.lesson_15_spring_basics.database.Database;

@Component
class DependentComponent2 {
    @Autowired
    Component1 component1;
    @Autowired
    @Qualifier("DatabaseImpl1")
    Database database;
    @Autowired
    @Qualifier("myString")
    String mystring;
}
