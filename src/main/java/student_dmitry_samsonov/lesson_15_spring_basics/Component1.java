package student_dmitry_samsonov.lesson_15_spring_basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class Component1 {
    @Value("${feature1.enabled:false}")
    String feature1;
}
