package student_alexander_zhukov.lesson_15.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "student_alexander_zhukov/lesson_15")
@PropertySource(value = "classpath:application.properties")
public class SpringBaseConfiguration {

    @Bean
    public String confTest() {
        return new String("base configuration is OK");
    }
}
