package student_alexander_zhukov.lesson_15.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public
class Comp1 {

    public CustomParameter parameter;

    @Autowired
    public Comp1(CustomParameter parameter) {
        this.parameter = parameter;

    }
}
