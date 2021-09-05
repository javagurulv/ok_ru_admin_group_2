package teacher.lesson_15_spring_basics.lessoncode.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import teacher.lesson_15_spring_basics.lessoncode.core.database.Database;
import teacher.lesson_15_spring_basics.lessoncode.core.database.InMemoryDatabaseImpl;
import teacher.lesson_15_spring_basics.lessoncode.core.database.RealDatabase;

@Configuration
@ComponentScan(basePackages = "teacher.lesson_15_spring_basics")
@PropertySource(value = "classpath:application.properties")
public class BookListConfiguration {

	@Bean
	public Database createDb(@Value("${database.selector}") String dbChoice) {
		if (dbChoice.equals("real")) {
			return new RealDatabase();
		} else {
			return new InMemoryDatabaseImpl();
		}
	}

}
