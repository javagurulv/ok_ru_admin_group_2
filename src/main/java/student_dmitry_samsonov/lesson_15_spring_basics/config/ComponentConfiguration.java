package student_dmitry_samsonov.lesson_15_spring_basics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "student_dmitry_samsonov/lesson_15_spring_basics")
@PropertySource(value = "classpath:dmitry_samsonov_application.properties")
public
class ComponentConfiguration {
    @Bean
    public String myString(){
        return new String("test string");
    }
}
