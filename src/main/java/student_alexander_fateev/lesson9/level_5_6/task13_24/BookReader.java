package student_alexander_fateev.lesson9.level_5_6.task13_24;

import java.util.ArrayList;
import java.util.List;

interface BookReader {
    boolean addNewBook(List<Object> bookLibrary);
    boolean checkIfEmptyFields();
    boolean removeBook(List<Object> bookLibrary);
    ArrayList<String> listAllBooks(List<Object> bookLibrary);
    ArrayList<String> findBookByAuthor(List<Object> bookLibrary, String bookAuthor);
    ArrayList<String> findBookByTitle(List<Object> bookLibrary, String bookTitle);
    boolean markRead(List<Object> bookLibrary);
    boolean markUnread(List<Object> bookLibrary);
    ArrayList<String> findAllReadBooks(List<Object> bookLibrary);
    ArrayList<String> findAllUnreadBooks(List<Object> bookLibrary);
}
