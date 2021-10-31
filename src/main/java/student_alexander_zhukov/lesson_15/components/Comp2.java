package student_alexander_zhukov.lesson_15.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Comp2 {

    @Autowired
    public CustomParameter parameter;

    @Autowired
    @Qualifier("confTest")
    public String confTest;
}
