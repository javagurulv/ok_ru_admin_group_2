package student_alexander_zhukov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
