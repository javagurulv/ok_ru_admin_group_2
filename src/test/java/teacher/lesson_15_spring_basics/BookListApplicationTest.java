package teacher.lesson_15_spring_basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import teacher.lesson_15_spring_basics.config.BookListConfiguration;
import teacher.lesson_15_spring_basics.core.database.Database;
import teacher.lesson_15_spring_basics.core.domain.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BookListConfiguration.class})
public class BookListApplicationTest {

	@Autowired private Book myBook;
	@Autowired private Database database;

	@Test
	public void test() {
		database.save(new Book("title", "author"));
		System.out.println("dsd");
	}

}