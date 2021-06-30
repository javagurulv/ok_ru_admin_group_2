package student_alexander_fateev.lesson3.level_7.task29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Bottle {
    double volume;
    String typeOfDrink;
    String bottleColor;

    Bottle(double volume, String typeOfDrink, String bottleColor) {
        this.volume = volume;
        this.typeOfDrink = typeOfDrink;
        this.bottleColor = bottleColor;
    }

    void changeDrink(String newDrink) {
        this.typeOfDrink = newDrink;
    }

    void bottleInfo() {
        System.out.println("You are drinking " + this.typeOfDrink + " from " + this.bottleColor + " bottle, " + this.volume + "l");
    }
}
