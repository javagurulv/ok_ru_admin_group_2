package student_artem_aleksandrov.lesson7.level7.library;

public class Book {

    private String name;
    private String author;
    private String publishDate;

    private Member reserverdBy;
    private Member usesBy;

    public Book(String name, String author, String publishDate) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }


    public void setReserverdBy(Member reserverdBy) {
        this.reserverdBy = reserverdBy;
    }

    public void setUsesBy(Member usesBy) {
        this.usesBy = usesBy;
    }

    public Member getReserverdBy() {
        return reserverdBy;
    }

    public Member getUsesBy() {
        return usesBy;
    }

}
