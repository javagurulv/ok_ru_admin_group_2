package student_artem_aleksandrov.lesson9.level5;

import java.util.List;

interface BookReader {

    boolean isExist(String author, String bookName);

    boolean addBook(String author, String bookName);

    boolean delBook(String author, String bookName);

    String list();

    List<Book> searchBook(String author);

}
