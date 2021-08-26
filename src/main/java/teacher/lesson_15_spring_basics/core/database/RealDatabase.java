package teacher.lesson_15_spring_basics.core.database;

import java.util.List;

import org.springframework.stereotype.Component;

import teacher.lesson_15_spring_basics.core.domain.Book;

@Component
public class RealDatabase implements Database {
	@Override
	public void save(Book book) {

	}

	@Override
	public boolean deleteById(Long id) {
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		return null;
	}

	@Override
	public List<Book> findByTitle(String title) {
		return null;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		return null;
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) {
		return null;
	}
}
