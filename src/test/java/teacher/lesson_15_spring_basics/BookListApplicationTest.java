package teacher.lesson_15_spring_basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import teacher.lesson_15_spring_basics.lessoncode.config.BookListConfiguration;
import teacher.lesson_15_spring_basics.lessoncode.core.database.Database;
import teacher.lesson_15_spring_basics.lessoncode.core.database.RealDatabase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BookListConfiguration.class})
public class BookListApplicationTest {

	@Autowired private Database database;

	@Test
	public void test() {
		assertEquals(database.getClass(), RealDatabase.class);
	}

}