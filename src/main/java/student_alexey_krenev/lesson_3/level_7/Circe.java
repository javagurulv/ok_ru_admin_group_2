package student_alexey_krenev.lesson_3.level_7;
import java.lang.Math;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circe {
    double raidus;
    double area;

    public Circe(double raidus) {
        this.raidus = raidus;
    }

    public double getSquare() {
        return this.area = Math.PI*this.raidus*this.raidus;
    }

    /*
    Мне кажется лучше так. А вообще можно не хранить area как свойство, а просто его вычислять в методе.
    public double calculateSquare() {
        this.area = Math.PI * this.raidus * this.raidus;
        return this.area;
    }
     */

}
