package teacher.lesson_17_log4j.lessoncode.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import teacher.lesson_17_log4j.lessoncode.core.database.Database;
import teacher.lesson_17_log4j.lessoncode.core.database.InMemoryDatabaseImpl;
import teacher.lesson_17_log4j.lessoncode.core.database.RealDatabase;

@Configuration
@ComponentScan(basePackages = "teacher.lesson_17_log4j")
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
