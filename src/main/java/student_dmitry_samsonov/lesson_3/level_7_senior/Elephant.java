package student_dmitry_samsonov.lesson_3.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Elephant {
    double speed;
    int calmness;
    Elephant(double speed, int calmness) {
        this.speed = speed;
        this.calmness = calmness;
    }
    String reactionOnBarking() {
        return "nothing";
    }
}
