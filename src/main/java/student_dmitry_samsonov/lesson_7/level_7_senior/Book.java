package student_dmitry_samsonov.lesson_7.level_7_senior;

class Book {
    private int id;
    private String name;
    private String author;
    private boolean borrowed;
    private boolean reserved;
    private Date borrowStart;
    private Date borrowEnd;
    private Date reserveStart;
    private Date reserveEnd;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}
