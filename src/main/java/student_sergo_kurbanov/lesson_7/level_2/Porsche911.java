package student_sergo_kurbanov.lesson_7.level_2;

class Porsche911 extends Car {

    private int topSpeed;

    // создайте конструктор
    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}