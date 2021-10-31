package student_alexander_zhukov.lesson_15.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomParameter {

    @Value("${parameter:testParameter}")
    public String parameter;

}
