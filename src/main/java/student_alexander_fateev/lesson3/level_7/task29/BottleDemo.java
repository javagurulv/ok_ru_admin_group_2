package student_alexander_fateev.lesson3.level_7.task29;

class BottleDemo {
    public static void main(String[] args) {
        Bottle myBottle = new Bottle(0.5, "beer", "green");
        myBottle.bottleInfo();
        myBottle.changeDrink("vodka");
        myBottle.bottleInfo();
    }
}
