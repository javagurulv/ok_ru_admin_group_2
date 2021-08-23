package teacher.lesson_15_spring_basics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import teacher.lesson_15_spring_basics.core.domain.Book;

@Configuration
@ComponentScan(basePackages = "teacher.lesson_15_spring_basics")
@PropertySource(value = "classpath:application.properties")
public class BookListConfiguration {

	@Bean
	public Book myBook() {
		return new Book("My title", "My Author");
	}

}
