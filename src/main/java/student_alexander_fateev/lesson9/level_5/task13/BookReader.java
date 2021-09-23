package student_alexander_fateev.lesson9.level_5.task13;

import java.util.ArrayList;
import java.util.List;

interface BookReader {
    boolean addNewBook(List<Object> bookLibrary);
    boolean checkIfEmptyFields();
    boolean removeBook(List<Object> bookLibrary);
    ArrayList<String> listAllBooks(List<Object> bookLibrary);
    ArrayList<String> findBookByAuthor(List<Object> bookLibrary, String bookAuthor);
}
