package student_dmitry_samsonov.lesson_7.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Library {
    private String name;
    private String address;
    private Book[] books;
    private Book[] borrowedBooks;
    private Book[] reservedBooks;
    private Member[] members;
    private Bill[] bills;
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
