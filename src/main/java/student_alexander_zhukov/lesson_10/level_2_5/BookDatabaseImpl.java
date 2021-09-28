package student_alexander_zhukov.lesson_10.level_2_5;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> books = new ArrayList<>();


    @Override
    public Long save(Book book) {
        books.add(book);
        book.setId((long) books.size());
        return book.getId();

    }

    @Override
    public boolean delete(Long bookId) {
        if (bookId <= books.size() && books.get(bookId.intValue() - 1) != null) {
            books.set(bookId.intValue() - 1, null);
            return true;
        }
        return false;

    }

    @Override
    public boolean delete(Book book) {
        if (this.books.contains(book)) {
            this.books.set(book.getId().intValue() - 1, null);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        if (books.get(bookId.intValue() - 1) != null) {
            return Optional.of(books.get(bookId.intValue() - 1));
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book:books) {
            if (book != null && book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book:books) {
            if (book != null && book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        int result = 0;
        for (Book book:books) {
            if (book != null) {
                result ++;
            }
        }
        return result;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (Book book:books) {
            if (book != null && book.getAuthor().equals(author)) {
                books.set((book.getId().intValue() - 1), null);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (Book book:books) {
            if (book != null && book.getTitle().equals(title)) {
                books.set((book.getId().intValue() - 1), null);
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> result = new ArrayList<>();
        for (Book book:books) {
            if (searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> result = new HashSet<>();
        for (Book book:books) {
            result.add(book.getAuthor());
        }
        return result;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> result = new HashSet<>();
        for (Book book:books) {
            result.add(book.getTitle());
        }
        return result;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> result = new HashSet<>();
        for (Book book:books) {
            result.add(book);
        }
        return result;
    }

    @Override
    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> result = new HashMap<>();
        for (String author:findUniqueAuthors()) {
            result.put(author, findByAuthor(author));
        }
        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> result = new HashMap<>();
        Integer count = 0;
        for (String author:findUniqueAuthors()) {
            for (Book book:findUniqueBooks()) {
                if (book.getAuthor().equals(author)) {
                    count ++;
                }
            }
            result.put(author, count);
        }
        return result;
    }
}
