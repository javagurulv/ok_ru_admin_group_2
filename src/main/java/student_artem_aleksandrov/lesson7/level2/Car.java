package student_artem_aleksandrov.lesson7.level2;

class Car {

    private int releaseYear;

    Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}

class Porsche911 extends Car {

    private int topSpeed;

    Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;

    }

    public int getTopSpeed() {
        return topSpeed;
    }
}

class Porsche911Demo {

    public static void main(String[] args) {
        Porsche911 porsche911 = new Porsche911(1989, 180);
        System.out.println("Release year: %d, TopSpeed: %d".formatted(porsche911.getReleaseYear(),
                porsche911.getTopSpeed()));

    }

}
