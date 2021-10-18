package student_andrey_tryapichnikov.lesson_10.level_1;

import java.util.LinkedList;

public class BookListContainsDemo {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        Book book = new Book("A.Thor", "the book");
        Book sameBook = new Book("A.Thor", "the book");
        Book anotherBook = new Book("S.Other", "another book");
        books.add(book);
        books.add(anotherBook);
        var contains = books.contains(sameBook);
        System.out.println(contains);
    }
}
