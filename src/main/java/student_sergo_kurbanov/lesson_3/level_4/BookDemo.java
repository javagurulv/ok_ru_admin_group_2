package student_sergo_kurbanov.lesson_3.level_4;

public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.printf("Book title = %s", bookTitle);
    }
}
