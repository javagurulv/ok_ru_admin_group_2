package student_dmitry_drozdetsky.lesson_3.level4.t14;

public class Book {

        String title;

        Book(String bookTitle) {
            this.title = bookTitle;
        }

        String getTitle() {
            return this.title;
        }

    }

    class BookDemo {

        public static void main(String[] args) {
            Book myBook = new Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }
