package student_alexander_fateev.lesson4.level_1.task1;

class CheckNumber {
    private int number;

    CheckNumber(int number) {
        this.number = number;
    }

    void isPositive() {
        if (this.number < 0) {
            System.out.println(this.number + " is negative");
        }
        else if (this.number > 0) {
            System.out.println(this.number + " is positive");
        }
        else {
            System.out.println("zero");
        }
    }
}
