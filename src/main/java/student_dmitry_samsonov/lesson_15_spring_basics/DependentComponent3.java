package student_dmitry_samsonov.lesson_15_spring_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class DependentComponent3 {
    Component1 component1;

    @Autowired
    public void setComponent1(Component1 component1) {
        this.component1 = component1;
    }
}
