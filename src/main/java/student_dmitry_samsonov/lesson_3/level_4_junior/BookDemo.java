package student_dmitry_samsonov.lesson_3.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}