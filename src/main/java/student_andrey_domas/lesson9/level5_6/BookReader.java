package student_andrey_domas.lesson9.level5_6;

public interface BookReader {

    public boolean add(Book book);

    public String[] list();

    public boolean markAsRead(Book book);

    public boolean markAsUnread(Book book);

    public String[] listRead();

    public String[] listUnread();

    public boolean remove(Book book);

    public Book[] findByAuthor(String author);

    public Book[] findByTitle(String title);

}
