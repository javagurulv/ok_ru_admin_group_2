package student_andrey_tryapichnikov.lesson_10.level_2;

import java.util.Objects;

class Book {
    private Long id;
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        /*
        А надо ли вообще сравнивать тут id?
        Выглядит как отличный способ выстрелить себе в ногу
        и наплодить дубликатов. Понятно, что условие задачи
        этого не требует, но всё равно непонятно, а смысл?

        Не говоря уже о том, что если id книги в базе ключ
        именованного массива, это сильно упрощает управление
        записями.
         */
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}
