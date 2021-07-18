package student_dmitry_samsonov.lesson_3.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }
}
