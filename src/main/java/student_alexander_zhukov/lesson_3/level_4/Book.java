package student_alexander_zhukov.lesson_3.level_4;

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
