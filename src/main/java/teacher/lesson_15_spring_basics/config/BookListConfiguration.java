package teacher.lesson_15_spring_basics.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "teacher.lesson_15_spring_basics")
@PropertySource(value = "classpath:application.properties")
public class BookListConfiguration {

}
