package student_alexander_zhukov.lesson_7.level_2;

class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int topSpeed) {
        super(1964);
        this.topSpeed = topSpeed;
    }

}

class Porsche911Demo {

    public static void main(String[] args) {
        Porsche911 newPorsche = new Porsche911(120);
    }

}
